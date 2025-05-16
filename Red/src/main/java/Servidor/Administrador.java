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

    //Objetos
    private Socket socket;
    private ObjectOutputStream out;
    private ObjectInputStream in;
    private int jugador;
    private Servidor servidor;

    //Utilidades
    private static final Protocolo protocolo = Protocolo.getInstancia();
    convertirPartida convertidorPartida = new convertirPartida();
    convertirJugador convertidorJugador = new convertirJugador();

    public Administrador(Socket socket, int jugador, Servidor servidor) {
        this.socket = socket;
        this.jugador = jugador;
        this.servidor = servidor;
    }

    public void run() {
        try {
            out = new ObjectOutputStream(socket.getOutputStream());
            out.flush();
            in = new ObjectInputStream(socket.getInputStream());

            Object obj;
            while ((obj = in.readObject()) != null) {

                //Crear Usuario
                if (obj instanceof String) {
                    servidor.notificar(protocolo.nombreUnicoJugador((String) obj), jugador);
                }

                //Crear Partida
                if (obj instanceof PartidaDTO) {
                    servidor.notificar(protocolo.crearPartida(convertidorPartida.convertir_DTO_a_Dominio((PartidaDTO) obj)), jugador);
                }

                //Unirse Partida
                if (obj instanceof JugadorDTO) {
                    Jugador jugador = convertidorJugador.convertir_DTO_a_Dominio((JugadorDTO) obj);
                    Partida partida = protocolo.agregarJugador(jugador);

                    if (partida != null) {
                        PartidaDTO partidaDTO = convertidorPartida.convertir_Dominio_a_DTO(partida);
                        servidor.notificarTodos(partidaDTO);
                    }
                }

                //Solicitar Inicio Partida
                if (obj instanceof Boolean) {
                    servidor.notificarTodos(protocolo.solicitarInicio());
                }

                //Ejercer Turno
                if (obj instanceof Movimiento) {

                }

            }

        } catch (IOException e) {
            System.out.println("Jugador " + (jugador + 1) + " desconectado.");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ObjectOutputStream getOut() {
        return out;
    }

}
