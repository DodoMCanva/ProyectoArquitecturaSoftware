/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuberias;

/**
 *
 * @author delll
 */

import Filtros.IFiltro;
import Objetos.Linea;
import Objetos.Tablero;

public class VerificarLinea implements  IFiltro<String, Linea> {
     private Tablero tablero;

    public VerificarLinea(Tablero tablero) {
        this.tablero = tablero;
    }

    

    @Override
    public boolean esValido(String var) {
        return IFiltro.super.esValido(var); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

     @Override
    public boolean aplicar(Linea linea) {
        // Verifica si la línea está dentro de los límites del tablero y si no está dibujada
        return !linea.estaDibujada();
    }


}
