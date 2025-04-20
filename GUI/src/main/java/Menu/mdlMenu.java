package Menu;

import Cliente.Cliente;
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
        partida.agregarJugador(cli.getJugadorCliente());
        cli.enviarServidor(partida);

        if (cli.esRespuestaValida()) {
            estado = "cambiar";
            interfaz = this;
            notificar();
        }

    }

    public void unirsePartida() {
        cli.enviarServidor(cli.getJugadorCliente());
        
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
