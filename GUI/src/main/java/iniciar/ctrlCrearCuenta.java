
package iniciar;

import Menu.ctrlMenu;

/**
 *
 * @author Equipo
 */
public class ctrlCrearCuenta {
    mdlCrearCuenta modelo = new mdlCrearCuenta();
    ctrlMenu control_menu = new ctrlMenu();
    
    
    public void abrirVentana(){
        modelo.abrirVentana(this);
    }
    
    public void crearJugador(String nombre, String avatar){
        modelo.crearJugador(nombre, avatar);
    }
    
    public void abrirVentanaSiguiente(){
        control_menu.abrirVentana();
    }
}
