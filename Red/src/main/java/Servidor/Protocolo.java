package Servidor;

import Convertidor.convertirJugador;
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

    private static Partida partida;

    convertirJugador convertir = new convertirJugador();

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
        System.out.println("Se realizo voto");
        if (votos.size() >= jugadoresDentro() && jugadoresDentro() > 1) {
            return "voto";
        }
        return "";
    }

    // Ejercer Turno
    public synchronized boolean ejercerTurno(Movimiento mov) {
        boolean aplico;
        if (mov.isEsHorizontal()) {
            aplico = partida.getTablero().dibujarLineaHorizontal(mov.getFila(), mov.getColumna(), convertir.convertir_DTO_a_Dominio(mov.getJugador()));
            System.out.println("Es horizontal");
        } else {
            aplico = partida.getTablero().dibujarLineaVertical(mov.getFila(), mov.getColumna(), convertir.convertir_DTO_a_Dominio(mov.getJugador()));
            System.out.println("Es vertical");
        }
        return aplico;

    }

    public JugadorDTO obtenerJugador(int index) {
        return convertir.convertir_Dominio_a_DTO(partida.getJugadores()[index]);
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
