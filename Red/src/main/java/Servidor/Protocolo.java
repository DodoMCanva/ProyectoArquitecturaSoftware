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

    private Partida partida;

    private Jugador[] ordenTurnos;
    private int turnoActual = 0;

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
        if (true) {
            if (mov.isEsHorizontal()) {
                partida.getTablero().dibujarLineaHorizontal(mov.getFila(), mov.getColumna(), convertir.convertir_DTO_a_Dominio(mov.getJugador()));
                System.out.println("Es horizontal");
            } else {
                partida.getTablero().dibujarLineaHorizontal(mov.getFila(), mov.getColumna(), convertir.convertir_DTO_a_Dominio(mov.getJugador()));
                System.out.println("Es vertical");
            }
            return true;
        } else {
            return false;
        }

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

    public synchronized void inicializarTurnos() {
        Jugador[] jugadores = partida.getJugadores();
        int n = jugadores.length;

        // Contar jugadores válidos (no null)
        int reales = 0;
        for (Jugador j : jugadores) {
            if (j != null) {
                reales++;
            }
        }

        ordenTurnos = new Jugador[reales];

        int index = 0;
        for (Jugador j : jugadores) {
            if (j != null) {
                ordenTurnos[index++] = j;
            }
        }

        // Mezclar el arreglo ordenTurnos (Fisher–Yates shuffle)
        java.util.Random rand = new java.util.Random();
        for (int i = ordenTurnos.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Jugador temp = ordenTurnos[i];
            ordenTurnos[i] = ordenTurnos[j];
            ordenTurnos[j] = temp;
        }

        turnoActual = 0;

        System.out.println("Orden aleatorio generado:");
        for (Jugador j : ordenTurnos) {
            System.out.println(j.getNombre());
        }
    }

}
