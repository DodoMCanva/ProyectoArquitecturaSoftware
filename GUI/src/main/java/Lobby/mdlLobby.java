package Lobby;

import Cliente.Cliente;
import Interfaz.Observado;
import Interfaz.Observador;
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

    }

    public void abrirVentana(ctrlLobby control) {
        vista = new frmLobby(control);
        estado = "abrir";
        interfaz = this;
        notificar();
    }

    public void rellenarCampos() {
        estado = "rellenar";
        interfaz = this;
        notificar();
    }

    @Override
    public String obtenerEstado() {
        return estado;
    }

    public void notificar() {
        vista.actualizar(interfaz);
    }

    @Override
    public ArrayList<String> obtenerDatos() {
        return cli.datosotrosjugadores();
    }

    public void run() {
        while (true) {
            if (cli.partidaLista()) {
                estado = "Partida Lista";
                vista.actualizar(interfaz);

                return;
            }
            if (cli.solicitudUnirse()) {
                int respuesta = JOptionPane.showConfirmDialog(null, "¿Quieres aceptar otro jugador",
                        "UnirsePartida", JOptionPane.YES_NO_OPTION);
                if (respuesta == JOptionPane.YES_OPTION) {

                }
            }
            if (cli.actualizar_vista_lobby()) {
                for (int i = 0; i < 4; i++) {
                    switch (i) {
                        case 0:

                            break;
                        case 1:

                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        default:
                            throw new AssertionError();
                    }
                }

            }
        }

    }

}
