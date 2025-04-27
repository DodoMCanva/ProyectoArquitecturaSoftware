package Menu;

import Cliente.Cliente;
import Lobby.ctrlLobby;
import iniciar.mdlCrearCuenta;

/**
 *
 * @author Equipo
 */
public class ctrlMenu {
    private Cliente cli;
    private mdlMenu modelo;
    private ctrlLobby control_lobby = new ctrlLobby(cli);

    public ctrlMenu(Cliente cli) {
        this.cli = cli;
        modelo = new mdlMenu(cli);
        control_lobby = new ctrlLobby(cli);
    }
    
    public void abrirVentana() {
        modelo.abrirVentana(this);
    }
    
    public void crearPartida(int tmn, int nj) {
        modelo.crearPartida(tmn, nj);
    }
    
    public void unirsePartida() {
        modelo.unirsePartida();
    }

    void abrirVentanaSiguiente() {
        control_lobby.abrirVentana();
    }
    
}
