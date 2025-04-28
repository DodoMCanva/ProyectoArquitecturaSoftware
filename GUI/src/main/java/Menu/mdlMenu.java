package Menu;

import Cliente.Cliente;
import Convertidor.convertirJugador;
import Convertidor.convertirPartida;
import Interfaz.Observado;
import Interfaz.Observador;
import Objetos.*;

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
        partida = new Partida(new Tablero(tmn), nj);
        convertirPartida convertir = new convertirPartida();
        convertirJugador convertirJuga= new convertirJugador();
        cli.enviarServidor(convertir.pasar_Dominio_a_DTO(partida));
        if (cli.esRespuestaValida()) {
            partida.agregarJugador(cli.getJugadorCliente());
            cli.setPartidaCliente(partida);
            cli.enviarServidor(convertirJuga.convertir_Dominio_a_DTO(cli.getJugadorCliente()));
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
