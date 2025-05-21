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
public class FiltroTamanoTablero {
    public static boolean aplicar(Partida partida) {
        int tam = partida.getTablero().getTamano();
        return tam == 10 || tam == 20 || tam == 30;
    }
}
