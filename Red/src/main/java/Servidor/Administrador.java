package Servidor;

import Convertidor.convertirJugador;
import Convertidor.convertirPartida;
import Objetos.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Equipo
 */
public class Administrador implements Runnable {

    private Socket socket;
    private ObjectOutputStream out;
    private ObjectInputStream in;

    private List<String> nombres = new ArrayList<>();
    private int jugador;

    private Partida partida;

    public Administrador(Socket socket, int jugador) {
        this.socket = socket;
        this.jugador = jugador;
    }

    public void run() {

        try {
            out = new ObjectOutputStream(socket.getOutputStream());
            out.flush();
            in = new ObjectInputStream(socket.getInputStream());

            Object obj;
            while ((obj = in.readObject()) != null) {

                if (obj instanceof PartidaDTO) {
                    convertirPartida convertidor = new convertirPartida();
                    if (partida == null) {
                        partida = convertidor.convertir_DTO_a_Dominio((PartidaDTO) obj);
                        enviar(true);
                    } else {
                        enviar(false);
                    }
                }
                if (obj instanceof JugadorDTO) {
                    convertirJugador convertidor = new convertirJugador();
                    if (partida != null) {
                        if (!partida.partidaCompleta()) {
                            if (enviar_recibir("Solicitud")) {
                                partida.agregarJugador(convertidor.convertir_DTO_a_Dominio((JugadorDTO) obj));
                                if (partida.partidaCompleta()) {
                                    enviar("partida completa");
                                }
                            }

                        }
                    }
                }
                if (obj instanceof Movimiento) {
                    
                }
                if (obj instanceof String) {
                    if (!Servidor.nombres.contains((String) obj)) {
                        Servidor.nombres.add((String) obj);
                        enviar(true);
                    } else {
                        enviar(false);
                    }
                }

            }

        } catch (IOException e) {
            System.out.println("Jugador " + (jugador + 1) + " desconectado.");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void enviar(Object obj) throws IOException {
        out.writeObject(obj);
        out.flush();
    }

    public boolean enviar_recibir(Object obj) {
        return true;
    }

}
