package Lobby;

import Cliente.Cliente;
import Interfaz.Observado;
import Interfaz.Observador;
import Objetos.Partida;
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

    public void actualizarTodosCompletos() {
    }

    @Override
    public String obtenerEstado() {
        return estado;
    }

    public void notificar() {
        vista.actualizar(interfaz);
    }

    public void run() {
        while (true) {
            if (cli.partidaLista()) {
                estado = "Partida Lista";
                vista.actualizar(interfaz);
                
                return;
            }
            if (cli.solicitudUnirse()) {
                int respuesta= JOptionPane.showConfirmDialog(null,"¿Quieres aceptar otro jugador",
                        "UnirsePartida", JOptionPane.YES_NO_OPTION);
                if (respuesta == JOptionPane.YES_OPTION) {
                    
                    
                    
                }
            }
        }

    }
}
