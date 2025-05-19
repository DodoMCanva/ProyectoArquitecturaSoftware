package Lobby;

import Cliente.Cliente;
import Partida.ctrlPartida;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Equipo
 */
public class ctrlLobby {

    private Cliente cli;
    private mdlLobby modelo;
    private ctrlPartida control_partida;

    public ctrlLobby(Cliente cli) {
        this.cli = cli;
        modelo = new mdlLobby(cli);
        control_partida = new ctrlPartida(cli);
    }

    public void abrirVentana() {
        modelo.abrirVentana(this);
    }
    
    public void solicitarInicio(){
        modelo.solicitarInicio();
    }
    
    public void ajustarPreferencias(Color J1, Color J2, Color J3, Color j4){
        modelo.ajustarPreferencias(J1,  J2, J3, j4);
    }

    void abrirVentanaSiguiente() {
        control_partida.abrirVentana();
    }

}
