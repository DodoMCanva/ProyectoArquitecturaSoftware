
package iniciar;

import Cliente.Cliente;
import Menu.ctrlMenu;

/**
 *
 * @author Equipo
 */
public class ctrlCrearCuenta {
    
    private Cliente cli;
    private mdlCrearCuenta modelo;
    private ctrlMenu control_menu;

    
   public ctrlCrearCuenta(Cliente cli) {
        this.cli = cli;
        modelo = new mdlCrearCuenta(cli);
        control_menu = new ctrlMenu(cli);
    }
    
    public void abrirVentana(){
        modelo.abrirVentana(this);
    }
    
    public void crearJugador(String nombre, String avatar){
        modelo.crearJugador(nombre, avatar);
    }
    
    public void abrirVentanaSiguiente(){
        control_menu.abrirVentana();
    }
    
    public void cambiarAvatar(){
        modelo.cambiarAvatar();
    }
}
