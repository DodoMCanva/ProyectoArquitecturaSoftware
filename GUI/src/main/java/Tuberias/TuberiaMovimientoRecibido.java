package Tuberias;

/**
 *
 * @author equipo
 */
import Filtros.IFiltro;
import Objetos.Linea;
import Objetos.MovimientoDTO;


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

    // Validar y procesar un movimiento recibido
    public Linea procesarMovimiento(MovimientoDTO movimiento) {
        if (movimiento == null) {
            System.out.println("❌ Movimiento recibido es null.");
            return null;
        }

        // Paso 1: Determinar orientación
        boolean esHorizontal = ubicarOrientacion.definirOrientacion(movimiento);

        // Paso 2: Obtener primera coordenada
        int[] primerPunto = ubicarPrimerPunto.obtenerCoordenada(movimiento);

        // Paso 3: Obtener segunda coordenada
        int[] segundoPunto = ubicarSegundoPunto.obtenerCoordenada(movimiento, esHorizontal);

        // Paso 4: Crear línea
        Linea nuevaLinea = formarLinea.construirLinea(primerPunto, segundoPunto, esHorizontal);

        // Validar si la línea es correcta antes de procesarla
        if (verificarLinea.aplicar(nuevaLinea)) {
            System.out.println("✅ Línea válida, procesando.");
            return nuevaLinea;
        }

        System.out.println("❌ Línea inválida, no se procesará.");
        return null; // Si la línea no es válida, retorna null
    }

}