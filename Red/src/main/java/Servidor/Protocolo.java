package Servidor;


import Convertidor.convertirJugador; 
import Objetos.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Protocolo {

    private static final Protocolo instancia = new Protocolo();

    private Protocolo() {}

    public static Protocolo getInstancia() {
        return instancia;
    }

    private final List<String> nombres = new ArrayList<>();
    private final List<Boolean> votos = new ArrayList<>();
    private final List<Integer> clientesAbandono = new ArrayList<>();

    private static Partida partida;
    private int[] ordenTurnos;
    private int turnoActual;

    convertirJugador convertir = new convertirJugador();

    public synchronized boolean nombreUnicoJugador(String nombre) {
        if (!nombres.contains(nombre)) {
            nombres.add(nombre);
            return true;
        }
        return false;
    }

    public synchronized boolean crearPartida(Partida partidaNueva) {
        if (partida == null) {
            partida = partidaNueva;
            return true;
        }
        return false;
    }

    public synchronized Partida agregarJugador(Jugador jugador) {
        if (partida != null && !partida.partidaCompleta()) {
            partida.agregarJugador(jugador);
            return partida;
        }
        return null;
    }

    public synchronized String solicitarInicio() {
        votos.add(true);
        if (votos.size() >= jugadoresDentro() && jugadoresDentro() > 1) {
            return "voto";
        }
        return "";
    }

    public synchronized void generarOrdenTurnos(int[] clientes, int total) {
        this.ordenTurnos = new int[total];
        System.arraycopy(clientes, 0, ordenTurnos, 0, total);

        Random random = new Random();
        for (int i = ordenTurnos.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = ordenTurnos[i];
            ordenTurnos[i] = ordenTurnos[j];
            ordenTurnos[j] = temp;
        }
        turnoActual = 0;
    }

    public synchronized boolean ejercerTurno(MovimientoDTO mov, int clienteSolicitante) {
        if (ordenTurnos == null || ordenTurnos.length == 0) return false;
        if (ordenTurnos[turnoActual] != clienteSolicitante) return false;

        boolean aplico;
        Jugador jugador = convertir.convertir_DTO_a_Dominio(mov.getJugador());

        if (mov.isEsHorizontal()) {
            aplico = partida.getTablero().dibujarLineaHorizontal(mov.getFila(), mov.getColumna(), jugador);
        } else {
            aplico = partida.getTablero().dibujarLineaVertical(mov.getFila(), mov.getColumna(), jugador);
        }

        if (aplico) {
            avanzarTurno();
        }

        return aplico;
    }

    private void avanzarTurno() {
        int intentos = 0;
        do {
            turnoActual = (turnoActual + 1) % ordenTurnos.length;
            intentos++;
        } while (clientesAbandono.contains(ordenTurnos[turnoActual]) && intentos <= ordenTurnos.length);
    }

    public synchronized JugadorDTO obtenerJugadorActual() {
        int index = turnoActual < partida.getJugadores().length ? turnoActual : 0;
        return convertir.convertir_Dominio_a_DTO(partida.getJugadores()[index]);
    }

    public synchronized void marcarAbandono(int cliente) {
        if (!clientesAbandono.contains(cliente)) {
            clientesAbandono.add(cliente);
        }
    }

    private int jugadoresDentro() {
        int cant = 0;
        for (Jugador jugador : partida.getJugadores()) {
            if (jugador != null) {
                cant++;
            }
        }
        return cant;
    }
}
