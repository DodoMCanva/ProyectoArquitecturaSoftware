/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Convertidor;

import Objetos.Tablero;
import Objetos.TableroDTO;

/**
 *
 * @author delll
 */
public class ConvertirTablero {
    public Tablero transformar(TableroDTO tableroDTO) {
        return new Tablero(tableroDTO.getTamano(), tableroDTO.getEstructura());
    }


}
