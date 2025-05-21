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
import Objetos.MovimientoDTO;
public class UbicarOrientacion {
      public boolean esHorizontal(Linea linea) {
        // Lógica para determinar si la línea es horizontal
        return true;  // Implementación real basada en coordenadas
    }

    public boolean esVertical(Linea linea) {
        // Lógica para determinar si la línea es vertical
        return true;  // Implementación real basada en coordenadas
    }
    public boolean definirOrientacion(MovimientoDTO movimiento) {
        return movimiento.isEsHorizontal();
    }

    
}
