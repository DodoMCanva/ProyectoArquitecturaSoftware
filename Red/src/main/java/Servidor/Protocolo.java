package Servidor;

import Objetos.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Equipo
 */
public class Protocolo {

    private static final Protocolo instancia = new Protocolo();

    private Protocolo() {
    }

    public static Protocolo getInstancia() {
        return instancia;
    }

    private final List<String> nombres = new ArrayList<>();
    private final List<Boolean> votos = new ArrayList<>();
    private Partida partida;

    // Crear Jugador
    public synchronized boolean nombreUnicoJugador(String nombre) {
        if (!nombres.contains(nombre)) {
            nombres.add(nombre);
            return true;
        }
        return false;
    }

    // Crear Partida
    public synchronized boolean crearPartida(Partida partida) {
        if (this.partida == null) {
            this.partida = partida;
            return true;
        }
        return false;
    }

    // Unirse a Partida
    public synchronized Partida agregarJugador(Jugador jugador) {
        if (partida != null && !partida.partidaCompleta()) {
            partida.agregarJugador(jugador);
            return partida;
        }
        return null;
    }

   

    // Solicitar Inicio de Partida
    public synchronized boolean solicitarInicio() {
        votos.add(true);
        return votos.size() == partida.getNumeroJugadores();
    }

    // Ejercer Turno
    public synchronized Movimiento ejercerTurno() {
        return null;
    }
}
