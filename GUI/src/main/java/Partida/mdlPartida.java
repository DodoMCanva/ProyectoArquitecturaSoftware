package Partida;

import Cliente.Cliente;
import Filtros.IFiltro;
import Interfaz.Observado;
import Interfaz.Observador;
import Objetos.Linea;
import Objetos.Movimiento;
import Tuberias.TuberiaMovimientoRecibido;

/**
 *
 * @author Equipo
 */
public class mdlPartida extends Thread implements Observado, ImdlPartida {

    private Observador vista;
    private ImdlPartida interfaz;
    private String estado = "";
    private boolean Terminada = false;
    private TuberiaMovimientoRecibido tuberiaMovimientoRecibido;


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
        public mdlPartida(IFiltro<Linea, Boolean> verificarLinea) {
        this.tuberiaMovimientoRecibido = new TuberiaMovimientoRecibido(verificarLinea);
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

    public void recibirMovimiento(Movimiento movimiento) {
        Linea lineaProcesada = tuberiaMovimientoRecibido.procesarMovimiento(movimiento);

        if (lineaProcesada != null) {
            System.out.println("Movimiento válido. Línea creada: " + lineaProcesada);
        } else {
            System.out.println("Movimiento inválido. No se generó línea.");
        }
    }


}
