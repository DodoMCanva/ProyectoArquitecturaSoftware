
package iniciar;

import Menu.mdlMenu;

/**
 *
 * @author Equipo
 */
public class ctrlCrearCuenta {
    mdlCrearCuenta modelo = new mdlCrearCuenta();
    mdlMenu modelo_menu = new mdlMenu();
    
    
    public void abrirVentana(){
        modelo.abrirVentana(this);
    }
    
    public void crearJugador(String nombre, String avatar){
        modelo.crearJugador(nombre, avatar);
    }
    
    public void abrirVentanaSiguiente(){
        modelo_menu.abrirVentana();
    }
}
