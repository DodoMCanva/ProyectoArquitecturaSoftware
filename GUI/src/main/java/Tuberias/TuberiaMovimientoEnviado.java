package Tuberias;

import Cliente.Cliente;
import Convertidor.convertirJugador;
import Filtros.IFiltro;
import Objetos.Linea;
import Objetos.MovimientoDTO;

/**
 *
 * @author josed
 */
public class TuberiaMovimientoEnviado {
  private IFiltro<Linea, Boolean> verificarLinea;
    private Cliente cliente;
    private convertirJugador convertirJugador;

    public TuberiaMovimientoEnviado(IFiltro<Linea, Boolean> verificarLinea, Cliente cliente) {
        this.verificarLinea = verificarLinea;
        this.cliente = cliente;
        this.convertirJugador = new convertirJugador();
    }

    // Validar si la línea es correcta antes de enviarla
    public boolean validarLinea(Linea linea) {
        if (linea == null) {
            System.out.println("❌ Línea recibida es null, no se puede procesar.");
            return false;
        }
        boolean esValida = verificarLinea.aplicar(linea);
        System.out.println("¿Línea válida?: " + esValida);
        return esValida;
    }

    // Convertir una línea en un MovimientoDTO para enviarlo al servidor
    public MovimientoDTO convertirAMovimientoDTO(Linea linea) {
        if (linea == null) return null;

        return new MovimientoDTO(
            linea.getX1(),
            linea.getX2(),
            linea.isEsHorizontal(),
            convertirJugador.convertir_Dominio_a_DTO(cliente.getJugadorCliente())
        );
    }

    // Procesar y enviar el movimiento al servidor solo si es válido
    public boolean enviarMovimiento(Linea linea) {
        if (!validarLinea(linea)) {
            System.out.println("❌ Movimiento inválido, no se enviará.");
            return false;
        }

        MovimientoDTO movimientoDTO = convertirAMovimientoDTO(linea);

        if (movimientoDTO != null) {
            cliente.enviarServidor(movimientoDTO);
            System.out.println("✅ Movimiento enviado: " + movimientoDTO);
            return true;
        }

        System.out.println("❌ Error al convertir la línea en MovimientoDTO.");
        return false;
    }


}
