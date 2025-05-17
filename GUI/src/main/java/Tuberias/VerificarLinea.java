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

public class VerificarLinea implements IFiltro<Linea, Boolean> {

    @Override
    public Boolean aplicar(Linea linea) {
        return linea != null && !linea.estaDibujada();
    }

    @Override
    public boolean esValido(Linea linea) {
        return linea != null; // Valida que la línea exista
    }


}
