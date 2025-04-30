package Menu;

import Cliente.Cliente;
import Convertidor.convertirJugador;
import Convertidor.convertirPartida;
import Interfaz.Observado;
import Interfaz.Observador;
import Objetos.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Equipo
 */
public class mdlMenu implements Observado, ImdlMenu {

    private Observador vista;
    private ImdlMenu interfaz;
    private String estado = "";
    private Partida partida;

    private Cliente cli;

    public mdlMenu(Cliente cli) {
        this.cli = cli;
    }

    public void abrirVentana(ctrlMenu control) {
        vista = new frmMenu(control);
        estado = "abrir";
        interfaz = this;
        notificar();
    }

    public void crearPartida(int tmn, int nj) {
        convertirJugador convertir = new convertirJugador();
        PartidaDTO partida = new PartidaDTO(new TableroDTO(tmn), nj);
        partida.setCreador(convertir.convertir_Dominio_a_DTO(cli.getJugadorCliente()));
        cli.enviarServidor(partida);
        if (cli.esRespuestaValida()) {
            Partida cliP = new Partida(tmn, nj);
            cliP.agregarJugador(cli.getJugadorCliente());
            cli.setPartidaCliente(cliP);
            cli.setAdministrador(true);
            estado = "cambiar";
            interfaz = this;
            notificar();
        }

    }

    public void unirsePartida() {
        convertirJugador convertir = new convertirJugador();
        cli.enviarServidor(convertir.convertir_Dominio_a_DTO(cli.getJugadorCliente()));
        if (cli.esRespuestaValida()) {
            estado = "cambiar";
            interfaz = this;
            notificar();
        }else{
            JOptionPane.showConfirmDialog(null, "No se pudo acceder a la partida");
        }
    }

    @Override
    public String obtenerEstado() {
        return estado;
    }

    @Override
    public void notificar() {
        vista.actualizar(interfaz);
    }

}
