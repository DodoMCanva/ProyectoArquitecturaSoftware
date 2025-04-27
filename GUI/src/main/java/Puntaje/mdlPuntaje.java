package Puntaje;

import Cliente.Cliente;
import Interfaz.Observado;
import Interfaz.Observador;
import Objetos.Partida;

/**
 *
 * @author Equipo
 */
public class mdlPuntaje implements Observado, ImdlPuntaje {

    private Observador vista;
    private ImdlPuntaje interfaz;
    private String estado = "";
    private Partida partida;

    private Cliente cli;

    public mdlPuntaje(Cliente cli) {

    }

    public void abrirVentana(ctrlPuntaje control) {
        vista = new frmPuntaje(control);
        estado = "abrir";
        interfaz = this;
        notificar();
    }

    @Override
    public String obtenerEstado() {
        return estado;
    }

    @Override
    public void notificar() {
        vista.actualizar(interfaz);
    }

}
