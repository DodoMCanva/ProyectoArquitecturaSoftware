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
        convertirPartida convertir = new convertirPartida();
        Partida partida = new Partida(tmn, nj);
        partida.agregarJugador(cli.getJugadorCliente());
        cli.enviarServidor(convertir.convertir_Dominio_a_DTO(partida));
        if (cli.esRespuestaValida()) {
            cli.setPartidaCliente(partida);
            estado = "cambiar";
            interfaz = this;
            notificar();
        } else {
            JOptionPane.showMessageDialog(null, "Ya hay una partida creada");
        }
    }

    public void unirsePartida() {
        convertirJugador convertir = new convertirJugador();
        cli.enviarServidor(convertir.convertir_Dominio_a_DTO(cli.getJugadorCliente()));
        if (cli.esRespuestaValida()) {
            if (cli.getPartidaCliente() != null) {
                estado = "cambiar";
                interfaz = this;
                notificar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la partida");
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
