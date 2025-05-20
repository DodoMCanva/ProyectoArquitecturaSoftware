package Puntaje;

import Cliente.Cliente;
import Menu.ctrlMenu;

/**
 *
 * @author Equipo
 */
public class ctrlPuntaje {

    private Cliente cli;
    private mdlPuntaje modelo;
    private ctrlMenu control_menu;

    public ctrlPuntaje(Cliente cli) {
        this.cli = cli;
        modelo = new mdlPuntaje(cli);
    }

    public void abrirVentana() {
        modelo.abrirVentana(this);
    }

    void abrirVentanaSiguiente() {
        control_menu.abrirVentana();
    }
}
