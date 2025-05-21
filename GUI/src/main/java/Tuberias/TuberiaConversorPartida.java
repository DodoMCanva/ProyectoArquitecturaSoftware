/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuberias;

/**
 *
 * @author delll
 */
import Convertidor.convertirJugador;
import Convertidor.convertirPartida;
import Convertidor.convertirTablero;
import Objetos.Jugador;
import Objetos.Tablero;
import Objetos.Partida;
import Objetos.PartidaDTO;
import Objetos.JugadorDTO;
import Objetos.TableroDTO;


public class TuberiaConversorPartida {
     private convertirJugador convertirJugadores;
    private convertirTablero convertirTablero;

    public TuberiaConversorPartida() {
        this.convertirJugadores = new convertirJugador();
        this.convertirTablero = new convertirTablero();
    }

    public Partida procesar(PartidaDTO partidaDTO) {
        // Paso 1: Convertir jugadores desde DTO a objetos de dominio
        Jugador[] jugadores = convertirJugadores.mapear(partidaDTO.getJugadores());

        // Paso 2: Convertir tablero desde DTO a objeto de dominio
        Tablero tablero = convertirTablero.transformar(partidaDTO.getTablero());

        // Paso 3: Ensamblar la partida final con los jugadores y el tablero
        return new Partida(jugadores, tablero);
    }
}


