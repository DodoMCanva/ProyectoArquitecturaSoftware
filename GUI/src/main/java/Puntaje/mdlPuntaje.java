package Puntaje;

import Cliente.Cliente;
import Interfaz.Observado;
import Interfaz.Observador;
import Objetos.Jugador;
import Objetos.Partida;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Equipo
 */
public class mdlPuntaje implements Observado, ImdlPuntaje {

    private Observador vista;
    private ImdlPuntaje interfaz;
    private String estado = "";
    private Partida partida;

    private Cliente cli;

    public mdlPuntaje(Cliente cli) {
        this.cli = cli;
    }

    public void abrirVentana(ctrlPuntaje control) {
        vista = new frmPuntaje(control);
        estado = "abrir";
        interfaz = this;
        notificar();
    }

    @Override
    public String obtenerEstado() {
        return estado;
    }

    @Override
    public void notificar() {
        vista.actualizar(interfaz);
    }

    @Override
    public Jugador[] obtenerJugadores() {
        Jugador[] jugadores = cli.getPartidaCliente().getJugadores();

        // Filtrar jugadores no nulos
        List<Jugador> jugadoresNoNulos = new ArrayList<>();
        for (Jugador j : jugadores) {
            if (j != null) {
                jugadoresNoNulos.add(j);
            }
        }
        // Ordenar de mayor a menor por puntos
        jugadoresNoNulos.sort((j1, j2) -> Integer.compare(j2.getPuntos(), j1.getPuntos()));
        // Convertir la lista filtrada de vuelta a un arreglo
        return jugadoresNoNulos.toArray(new Jugador[0]);
    }

}
