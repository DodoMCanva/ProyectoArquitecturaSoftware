package Servidor;

import Objetos.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Equipo
 */
public class Protocolo {

    //Utileria
    private List<String> nombres = new ArrayList<>();
    private List<Boolean> votos = new ArrayList<>();

    private Partida partida;
    
    //Crear Jugador
    public boolean nombreUnicoJugador(String nombre){
        if (!nombres.contains(nombre)) {
            nombres.add(nombre);
            return true;
        }
        return false;
    }

    //Crear Partida
    public boolean crearPartida(Partida partida) {
        if (partida == null) {
            this.partida = partida;
            return true;
        }
        return false;
    }

    //Unirse Partida
    public Partida agregarJugador(Jugador jugador) {
        if (partida != null) {
            if (!partida.partidaCompleta()) {
                this.partida.agregarJugador(jugador);
                return this.partida;
            }
        }
        return null;
    }

    //Solicitar Inicio Partida
    public boolean solicitarInicio() {
        votos.add(Boolean.TRUE);
        if (votos.size() == partida.getNumeroJugadores()) {
            return true;
        }
        return false;
    }

    //Ejercer Turno
    public Movimiento ejercerTurno() {

        return null;
    }

}
