/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filtros;

/**
 *
 * @author delll
 */

import Objetos.Linea;
import Objetos.Movimiento;
import Objetos.Tablero;

public class UbicarSegundaPosicion {
    public int[] obtenerSegundaPosicion(Linea linea, Tablero tablero) {
        int x = 0; // Lógica real para calcular X
        int y = 0; // Lógica real para calcular Y
        return new int[]{x, y};
    }
 public int[] obtenerCoordenada(Movimiento movimiento, boolean esHorizontal) {
        int xFinal = esHorizontal ? movimiento.getColumna() + 1 : movimiento.getColumna();
        int yFinal = esHorizontal ? movimiento.getFila() : movimiento.getFila() + 1;
        return new int[]{xFinal, yFinal};
    }

}
