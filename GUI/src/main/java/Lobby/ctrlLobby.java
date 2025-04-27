package Lobby;

import Cliente.Cliente;
import Partida.ctrlPartida;

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

    void abrirVentanaSiguiente() {
        // control_partida.abrirVentana();
    }

}
