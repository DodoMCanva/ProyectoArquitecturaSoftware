package Menu;

import Lobby.ctrlLobby;

/**
 *
 * @author Equipo
 */
public class ctrlMenu {
    mdlMenu modelo = new mdlMenu();
    ctrlLobby control_lobby = new ctrlLobby();
    
    
    public void abrirVentana() {
        modelo.abrirVentana(this);
    }
    
    public void abrirVentanaSiguiente() {
        //control_lobby.abrirVentana();
    }
    
}
