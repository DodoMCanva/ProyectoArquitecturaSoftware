package Lobby;

import Cliente.Cliente;
import Interfaz.Observado;
import Interfaz.Observador;
import Objetos.Jugador;
import java.awt.Color;

/**
 *
 * @author Equipo
 */
public class mdlLobby extends Thread implements Observado, ImdlLobby {

    private Observador vista;
    private ImdlLobby interfaz;
    private String estado = "";
    private Cliente cli;
    private boolean activo = true;

    public mdlLobby(Cliente cli) {
        this.cli = cli;
    }

    public void abrirVentana(ctrlLobby control) {
        vista = new frmLobby(control);
        estado = "abrir";
        interfaz = this;
        notificar();
        this.start();
    }

    public void solicitarInicio() {
        cli.enviarServidor(true);
    }

    @Override
    public String obtenerEstado() {
        return estado;
    }

    @Override
    public Jugador[] obtenerJugadores() {
        return cli.getPartidaCliente().getJugadores();
    }

    public void notificar() {
        vista.actualizar(interfaz);
    }

    public void run() {
        while (activo) {
            if (cli.cambioLobby()) {
                estado = "datos";
                interfaz = this;
                vista.actualizar(interfaz);
                cli.setCambiograficoLobby(false);
            }

            if (cli.isPartidalista()) {
                activo = false;
                estado = "cambio";
                interfaz = this;
                vista.actualizar(interfaz);
                cli.setCambiograficoLobby(false);
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }

    void ajustarPreferencias(Color J1, Color J2, Color J3, Color j4) {
        cli.ajustarPreferencias(J1, J2, J3, j4);
    }
}
