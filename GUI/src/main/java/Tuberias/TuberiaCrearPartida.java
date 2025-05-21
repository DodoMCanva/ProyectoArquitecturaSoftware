/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuberias;

import Filtros.FiltroNumeroJugadores;
import Filtros.FiltroTamanoTablero;
import Objetos.Partida;

/**
 *
 * @author Gabri
 */
public class TuberiaCrearPartida {
      public boolean procesar(Partida partida){
        
    
    
        if (partida.getNumeroJugadores()>4 && partida.getNumeroJugadores()<0) {
                      return false;  
        }
          if (!FiltroTamanoTablero.aplicar(partida)) {
              return false;
          }
          if (!FiltroNumeroJugadores.aplicar(partida)) {
              return false;
          }
          
          return true;
    }
     
   
}
