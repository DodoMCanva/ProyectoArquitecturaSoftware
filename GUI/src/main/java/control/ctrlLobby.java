package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import model.mdlLobby;
import view.frmLobby;

/**
 *
 * @author Equipo
 */
public class ctrlLobby {

    private frmLobby o = new frmLobby();
    private mdlLobby lobby = new mdlLobby(o);

    public ctrlLobby() {
        lobby.Mostrar();
        addActionListeners();
    }

    private void addActionListeners() {
        JButton btn = o.getBtnSolicitarInicio();
        JButton btnR = o.getBtnSalir();

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lobby.mandarVoto()) {
                    ctrlPartida partida = new ctrlPartida();
                    partida.iniciar();
                }

            }
        });

        btnR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ctrlMenu menu = new ctrlMenu();
            }
        });
    }

}
