/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filtros;

import Objetos.Partida;

/**
 *
 * @author Gabri
 */
public class FiltroNumeroJugadores {
  public static boolean aplicar(Partida partida) {
        
        if (partida.getNumeroJugadores() > 4 || partida.getNumeroJugadores() < 1) {
            return false;
        }
        return true;
    }
}
