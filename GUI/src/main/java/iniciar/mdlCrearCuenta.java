package iniciar;

import Cliente.Cliente;
import Interfaz.Observado;
import Interfaz.Observador;
import Objetos.Jugador;
import Tuberias.TuberiaJugador;
import javax.swing.JOptionPane;

/**
 *
 * @author Equipo
 */
public class mdlCrearCuenta implements ImdlCrearCuenta, Observado {

    private Observador vista;
    private ImdlCrearCuenta interfaz;
    private String estado = "";
    
    //
    private Cliente cli;

    public mdlCrearCuenta(Cliente cli) {
        this.cli = cli;
    }

    @Override
    public void abrirVentana(ctrlCrearCuenta control) {
        vista = new frmCrearCuenta(control);
        estado = "abrir";
        interfaz = this;
        notificar();
    }
    
    public void cambiarAvatar(){
     estado= "cambiar avatar";
     interfaz= this;
     notificar();
             
    }

    @Override
    public void crearJugador(String nombre, String avatar) {
        TuberiaJugador tuberia = new TuberiaJugador();
        nombre = tuberia.procesar(nombre);
        
        cli.enviarServidor(nombre);
        cli.setJugadorCliente(new Jugador(avatar, nombre, 0));
        
        if (!nombre.equals("") && cli.esRespuestaValida()) {
            estado = "cambiar";
            interfaz = this;
            notificar();
        } else {
            JOptionPane.showMessageDialog(null, "Nombre ya registrado");
        }
    }
    @Override
    public String obtenerEstado() {
        return this.estado;
    }

    @Override
    public void notificar() {
        vista.actualizar(interfaz);
    }
}
