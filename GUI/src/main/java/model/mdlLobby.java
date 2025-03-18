
package model;

import view.frmLobby;

/**
 *
 * @author Equipo
 */
public class mdlLobby {

    private frmLobby Lobby;

    public mdlLobby(frmLobby Lobby) {
        this.Lobby = Lobby;
    }
    
    public void Mostrar() {
        Lobby.setVisible(true);
    }

    public boolean mandarVoto() {
        return true;
    }
    
    
    
}
