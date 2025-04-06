
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
        modelo.abrirVentana();
    }
    
    public void crearJugador(){
        if (modelo.crearJugador()) {
            modelo_menu.abrirVentana();
        }
        
    }
}
