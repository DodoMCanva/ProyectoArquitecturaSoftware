package Lobby;

import Cliente.Cliente;
import Interfaz.Observado;
import Interfaz.Observador;
import Objetos.Jugador;
import Objetos.Partida;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Equipo
 */
public class mdlLobby extends Thread implements Observado, ImdlLobby {

    private Observador vista;
    private ImdlLobby interfaz;
    private String estado = "";
    private Partida partida;
    private boolean Terminada = false;

    private Cliente cli;

    public mdlLobby(Cliente cli) {
        this.cli = cli;
    }

    public void abrirVentana(ctrlLobby control) {
        vista = new frmLobby(control);
        estado = "abrir";
        interfaz = this;
        notificar();
    }

    @Override
    public String obtenerEstado() {
        return estado;
    }

    @Override
    public Jugador[] obtenerJugadores() {
        return cli.getPartidaCliente().getJugadores();
    }

    public void notificar() {
        vista.actualizar(interfaz);
    }

    public void run() {
        while (true) {
            if (cli.partidaLista()) {
                estado = "cambio";
                interfaz = this;
                vista.actualizar(interfaz);

            }
            if (cli.solicitudUnirse()) {
                int respuesta = JOptionPane.showConfirmDialog(null, "¿Quieres aceptar otro jugador",
                        "UnirsePartida", JOptionPane.YES_NO_OPTION);
                if (respuesta == JOptionPane.YES_OPTION) {
                    cli.enviarServidor("aceptado");
                }
            }
            if (cli.cambioLobby()) {
                estado = "datos";
                interfaz = this;
                vista.actualizar(interfaz);
            }
        }
    }

}
