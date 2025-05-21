package Tuberias;

/**
 *
 * @author equipo
 */
import Filtros.FormarLinea;
import Filtros.UbicarOrientacion;
import Filtros.IFiltro;
import Filtros.UbicarSegundaPosicion;
import Objetos.Linea;
import Objetos.Movimiento;



public class TuberiaMovimientoRecibido {
       private UbicarOrientacion ubicarOrientacion;
    private UbicarPrmeraPosicion ubicarPrimerPunto;
    private UbicarSegundaPosicion ubicarSegundoPunto;
    private FormarLinea formarLinea;
    private IFiltro<Linea, Boolean> verificarLinea;

    public TuberiaMovimientoRecibido(IFiltro<Linea, Boolean> verificarLinea) {
        this.ubicarOrientacion = new UbicarOrientacion();
        this.ubicarPrimerPunto = new UbicarPrmeraPosicion();
        this.ubicarSegundoPunto = new UbicarSegundaPosicion();
        this.formarLinea = new FormarLinea();
        this.verificarLinea = verificarLinea;

    }

    public boolean procesar(Linea linea) {
        return verificarLinea.aplicar(linea);
    }

   


    public Linea procesarMovimiento(Movimiento movimiento) {
        // Paso 3: Determinar orientación
        boolean esHorizontal = ubicarOrientacion.definirOrientacion(movimiento);

        // Paso 5: Obtener primera coordenada
        int[] primerPunto = ubicarPrimerPunto.obtenerCoordenada(movimiento);

        // Paso 7: Obtener segunda coordenada
        int[] segundoPunto = ubicarSegundoPunto.obtenerCoordenada(movimiento, esHorizontal);

        // Paso 9: Formatear línea
        Linea nuevaLinea = formarLinea.construirLinea(primerPunto, segundoPunto, esHorizontal);

        // Validar si la línea es válida antes de enviarla
        if (verificarLinea.aplicar(nuevaLinea)) {
            return nuevaLinea;
        }

        return null; // Retorna nulo si el movimiento no es válido
    }

}
