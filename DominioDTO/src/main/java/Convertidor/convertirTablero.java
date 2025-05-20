/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Convertidor;

import Objetos.Caja;
import Objetos.CajaDTO;
import Objetos.Linea;
import Objetos.LineaDTO;
import Objetos.Tablero;
import Objetos.TableroDTO;

/**
 *
 * @author cesar
 */
public class convertirTablero {

    public TableroDTO convertir_Dominio_a_DTO(Tablero dominio) {
        if (dominio == null) {
            throw new IllegalArgumentException("Tablero es null");
        }

        int tamano = dominio.getTamano();
        TableroDTO dto = new TableroDTO(tamano);

        // Convertir líneas horizontales
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano - 1; j++) {
                Linea linea = dominio.horizontales[i][j];
                LineaDTO lineaDTO = new LineaDTO();
                lineaDTO.setEstaDibujada(linea.estaDibujada());
                lineaDTO.setJugador(linea.getJugador());
                dto.getHorizontales()[i][j] = lineaDTO; 
            }
        }

        // Convertir líneas verticales
        for (int i = 0; i < tamano - 1; i++) {
            for (int j = 0; j < tamano; j++) {
                Linea linea = dominio.getVerticales()[i][j];
                LineaDTO lineaDTO = new LineaDTO();
                lineaDTO.setEstaDibujada(linea.estaDibujada());
                lineaDTO.setJugador(linea.getJugador());
                dto.getVerticales()[i][j] = lineaDTO; 
            }
        }

        // Convertir cajas
        for (int i = 0; i < tamano - 1; i++) {
            for (int j = 0; j < tamano - 1; j++) {
                Caja caja = dominio.getCajas()[i][j];
                CajaDTO cajaDTO = new CajaDTO();
                cajaDTO.setPropietario(caja.getPropietario());
                dto.getCajas()[i][j] = cajaDTO;
            }
        }

        return dto;
    }

}
