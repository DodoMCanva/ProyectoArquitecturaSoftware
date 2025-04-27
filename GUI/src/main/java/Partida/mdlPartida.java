package Partida;

import Cliente.Cliente;
import Interfaz.Observado;
import Interfaz.Observador;

/**
 *
 * @author Equipo
 */
public class mdlPartida extends Thread implements Observado, ImdlPartida {

    private Observador vista;
    private ImdlPartida interfaz;
    private String estado = "";
    private boolean Terminada = false;

    private Cliente cli;
    private Grafico grafico;

    public mdlPartida(Cliente cli) {
        this.cli = cli;
    }

    public mdlPartida(frmPartida vistaPartida) {
        vista = vistaPartida;
    }

    public void abrirVentana(ctrlPartida control) {
        vista = new frmPartida(control);
        estado = "abrir";
        interfaz = this;
        notificar();
    }

    public void Terminar() {

    }

    public void clickPanel(int y, int x) {
        //TuberiaMoviemiento;
        //interpretarMovimiento
        //si movimiento valido entonces
        //enviar a la red
    }

    public void abandonar() {

    }

    public Grafico grafico() {
        return grafico;
    }

    @Override
    public String obtenerEstado() {
        return estado;
    }

    @Override
    public void notificar() {
        vista.actualizar(interfaz);
    }

    @Override
    public void run() {
        while (!Terminada) {
            if (cli.cambioPartida()) {
                //interpretarMovimientoGraficamente(cli.getMovimiento());
                estado = "actualizar tablero";
                vista.actualizar(interfaz);
            }
        }
    }
}
