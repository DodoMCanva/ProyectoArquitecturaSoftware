package Partida;

import Cliente.Cliente;
import Puntaje.ctrlPuntaje;

/**
 *
 * @author Equipo
 */
public class ctrlPartida {

    private Cliente cli;
    private mdlPartida modelo;
    private ctrlPuntaje control_puntaje;

    public ctrlPartida(Cliente cli) {
        this.cli = cli;
        modelo = new mdlPartida(cli);
        control_puntaje = new ctrlPuntaje(cli);
    }

    public void abrirVentana() {
        modelo.abrirVentana(this);
    }

    public void abrirVentanaSiguiente() {
        control_puntaje.abrirVentana();
    }

    public void clickPanel(int x, int y) {
        modelo.clickPanel(x, y);
    }

    void abandonar() {

    }

}
