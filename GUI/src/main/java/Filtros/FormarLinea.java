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


public class FormarLinea {
    public Linea construirLinea(int[] primerPunto, int[] segundoPunto, boolean esHorizontal) {
        return new Linea(primerPunto[0], primerPunto[1], segundoPunto[0], segundoPunto[1], esHorizontal);
    }

}

