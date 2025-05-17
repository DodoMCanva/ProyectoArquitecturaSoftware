/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuberias;

/**
 *
 * @author delll
 */

import Objetos.Linea;
import Objetos.Movimiento;

public class FormarMovimiento {
    public Movimiento aplicar(Linea linea) {
        return new Movimiento(linea);
    }
}
