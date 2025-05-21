package Menu;

import Cliente.Cliente;
import Convertidor.convertirJugador;
import Convertidor.convertirPartida;
import Interfaz.Observado;
import Interfaz.Observador;
import Objetos.*;
import Tuberias.TuberiaCrearPartida;
import javax.swing.JOptionPane;

/**
 *
 * @author Equipo
 */
public class mdlMenu implements Observado, ImdlMenu {

    private Observador vista;
    private ImdlMenu interfaz;
    private String estado = "";
    private Partida partida;

    private Cliente cli;

    public mdlMenu(Cliente cli) {
        this.cli = cli;
    }

    public void abrirVentana(ctrlMenu control) {
        vista = new frmMenu(control);
        estado = "abrir";
        interfaz = this;
        notificar();
    }

    public void crearPartida(int tmn, int nj) {
        convertirPartida convertir = new convertirPartida();
        Partida partida = new Partida(tmn, nj);
           TuberiaCrearPartida tuberia = new TuberiaCrearPartida();
    if (!tuberia.procesar(partida)) {
        JOptionPane.showMessageDialog(null, "Parámetros incorrectos para crear la partida.");
        return;
    }
        partida.agregarJugador(cli.getJugadorCliente());
        cli.enviarServidor(convertir.convertir_Dominio_a_DTO(partida));
        if (cli.esRespuestaValida()) {
            cli.setPartidaCliente(partida);
            estado = "cambiar";
            interfaz = this;
            notificar();
        } else {
            JOptionPane.showMessageDialog(null, "Ya hay una partida creada");
        }
    }
/*
    public void unirsePartida() {
        if (cli.getPartidaCliente() != null) {
            // Ya está en una partida
            estado = "cambiar";
            interfaz = this;
            notificar();
            return;
        }

        convertirJugador convertir = new convertirJugador();
        cli.enviarServidor(convertir.convertir_Dominio_a_DTO(cli.getJugadorCliente()));

        if (cli.esRespuestaValida()) {
            if (cli.getPartidaCliente() != null) {
                estado = "cambiar";
                interfaz = this;
                notificar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la partida");
        }
    }
*/
    public void unirsePartida() {
    if (cli.getPartidaCliente() != null) {
        // Ya está en una partida
        estado = "cambiar";
        interfaz = this;
        notificar();
        return;
    }

    if (cli.getJugadorCliente() == null) {
        JOptionPane.showMessageDialog(null, "No tienes un jugador asignado.");
        return;
    }

    convertirJugador convertir = new convertirJugador();
    JugadorDTO jugadorDTO = convertir.convertir_Dominio_a_DTO(cli.getJugadorCliente());
    
    System.out.println("Enviando jugador al servidor: " + jugadorDTO.getNombre());
    cli.enviarServidor(jugadorDTO);

    System.out.println("Esperando respuesta del servidor...");
    if (cli.esRespuestaValida()) {
        System.out.println("Respuesta válida recibida.");
        if (cli.getPartidaCliente() != null) {
            System.out.println("Partida asignada correctamente.");
            estado = "cambiar";
            interfaz = this;
            notificar();
        } else {
            System.out.println("Error: La partida sigue siendo null.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "No se pudo acceder a la partida");
    }
}
    @Override
    public String obtenerEstado() {
        return estado;
    }

    @Override
    public void notificar() {
        vista.actualizar(interfaz);
    }

}
