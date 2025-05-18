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
        if (partida != null) {
            if (!partida.partidaCompleta()) {
                partida.agregarJugador(jugador);
                return partida;
            } else {
                System.out.println("Partida llena");
            }
        } else {
            System.out.println("Partida nula");
        }
        return null;
    }
    // Solicitar Inicio de Partida

    public synchronized String solicitarInicio() {
        votos.add(true);
        if (votos.size() == jugadoresDentro()) {
            return "voto";
        }
        return "";
    }

    // Ejercer Turno
    public synchronized Movimiento ejercerTurno() {
        return null;
    }

    public int jugadoresDentro() {
        int cant = 0;
        for (Jugador jugador : partida.getJugadores()) {
            if (jugador != null) {
                cant++;
            }
        }
        return cant;
    }
}
