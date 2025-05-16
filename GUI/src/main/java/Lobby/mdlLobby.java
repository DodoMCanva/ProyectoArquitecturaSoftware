package Lobby;

import Cliente.Cliente;
import Interfaz.Observado;
import Interfaz.Observador;
import Objetos.Jugador;

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
        System.out.println("Antes del hilo");
        this.start();
        System.out.println("Despues de iniciar el hilo");

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
            System.out.println(activo);
            if (cli.partidaLista()) {
                activo = false;
                estado = "cambio";
                interfaz = this;
                vista.actualizar(interfaz);
            }
            if (cli.cambioLobby()) {
                estado = "datos";
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
}
