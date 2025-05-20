package Puntaje;

import Cliente.Cliente;
import Interfaz.Observado;
import Interfaz.Observador;
import Objetos.Jugador;
import Objetos.Partida;
import java.util.Arrays;
import java.util.Comparator;

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
        Jugador[] listaordenada = cli.getPartidaCliente().getJugadores();
        Arrays.sort(listaordenada, (j1, j2) -> Integer.compare(j2.getPuntos(), j1.getPuntos()));
        return listaordenada;

    }

}
