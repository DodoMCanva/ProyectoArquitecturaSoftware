package conexion;

import java.util.List;

/**
 *
 * @author Equipo
 */
public class SocketServerProtocol {

//    private IPAF ipaf;
//    private IRepo repo;
    public SocketServerProtocol() {

    }

    public Object procesarEntrada(Object mensajeEntrante) {

//        //Si despues de realizada la conexion, el socket del cliente manda los
//        //datos del jugador, le avisa al Thread que efectivamente son los datos
//        if (mensajeEntrante instanceof Jugador) {
//            return MensajeSockets.JUGADOR_NUEVO;
//
//            //Si se reciben los datos de un MovimientoDTO, se manda al componente 
//            //PipesAndFilters para realizar la conversion correspondiente, asignar 
//            //y obtener respuesta
//        } else if (mensajeEntrante instanceof MovimientoDTO) {
//            MovimientoDTO movimiento = (MovimientoDTO) mensajeEntrante;
//
//            if (movimiento.getLinea() != null) {
//                ipaf.asignarLinea(movimiento.getLinea());
//            } else if (movimiento.getCuadros() != null) {
//                for (CuadroDTO cuadro : movimiento.getCuadros()) {
//                    ipaf.asignarCuadro(cuadro);
//                }
//            }
//
//            RespuestaDTO respuesta = new RespuestaDTO(movimiento, repo.obtenerMarcador());
//            return respuesta;
//
//            //Si un cliente vota, se verifica y se manda respuesta
//        } else if (mensajeEntrante == MensajeSockets.VOTO) {
//            return MensajeSockets.VOTO;
//        } else if (mensajeEntrante == MensajeSockets.TURNO_TERMINADO) {
//            return repo.obtenerTurnoSiguiente();
//        } else if (mensajeEntrante == MensajeSockets.MARCADOR) {
//            return repo.obtenerMarcador();
//        }
//
//        return null;
//    }
//
//    public Object empezarPartida(List<Jugador> jugadores) {
//        ipaf.crearSala(jugadores);
//        return repo.obtenerMarcador();
//    }
    return null;
    }
}
