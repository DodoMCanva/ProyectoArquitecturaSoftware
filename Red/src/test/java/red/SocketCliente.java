/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package red;

import Objetos.Jugador;

/**
 *
 * @author delll
 */
public class SocketCliente {
        private static SocketCliente instance;
        private Jugador jugadorAdmin;

 public static SocketCliente getInstance() {
        if (instance == null) {
            instance = new SocketCliente();
        }
        return instance;
    }
}
