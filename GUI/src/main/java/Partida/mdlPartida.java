package Partida;

import Cliente.Cliente;
import Convertidor.convertirJugador;
import Interfaz.Observado;
import Interfaz.Observador;
import Objetos.Jugador;
import Objetos.Movimiento;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Equipo
 */
public class mdlPartida extends Thread implements Observado, ImdlPartida {

    //Datos de mdl
    private Observador vista;
    private ImdlPartida interfaz;
    private String estado = "";

    //Datos de logica
    private boolean Terminada = true;
    private List<punto> puntos = new ArrayList<>();
    private List<linea> lineas = new ArrayList<>();

    //private List<linea> lineas = new ArrayList<>();
    private linea linea;

    //Variables Auxiliares
    convertirJugador convertir = new convertirJugador();
    private punto aux1, aux2;
    private boolean c = false;

    //Variables de Configuracion
    private int tmn;
    private int tmnTablero = 635;
    private int separador = 0;
    private Color[] colores;
    private int turno;

    //RED
    private Cliente cli;

    public mdlPartida(Cliente cli) {
        this.cli = cli;
    }

    public void abrirVentana(ctrlPartida control) {
        tmn = cli.getPartidaCliente().getTablero().getTamano();
        separador = tmnTablero / tmn;
        tmn = this.cli.getPartidaCliente().getTablero().getTamano();
        colores = cli.getPreferencias();
        agregarPuntos();
        vista = new frmPartida(control);
        estado = "abrir";
        interfaz = this;
        notificar();
        this.start();
    }

    public void clickPanel(int x, int y) {
        System.out.println("Entro");
        int d = 20;
        for (punto punto : puntos) {
            if ((x <= (punto.getX() + d) && x >= (punto.getX() - d)) && ((y <= (punto.getY() + d) && (y >= (punto.getY() - d))))) {
                System.out.println("Si es punto wens");
                if (!c) {
                    aux1 = punto;
                    c = true;
                } else {
                    if (aux1 != punto) {
                        aux2 = punto;
                        procesarLinea(aux1, aux2);
                        c = false;
                    } else {
                        System.out.println("Es el mismo punto wens");
                    }

                }
            }
        }
    }

    public void Terminar() {

    }

    public void abandonar() {

    }

    //Metodos no directos 
    public void procesarLinea(punto aux1, punto aux2) {
        int distancia;
        if (aux1.getX() == aux2.getX()) {
            // Línea vertical
            distancia = Math.abs(aux1.getY() - aux2.getY());
            if (distancia <= separador) {
                int fila = Math.min(aux1.getY(), aux2.getY()) / separador;
                int col = aux1.getX() / separador;
                System.out.println("se envio una linea");
                cli.enviarServidor(new Movimiento(fila, col, false, convertir.convertir_Dominio_a_DTO(cli.getJugadorCliente())));
            }
        } else if (aux1.getY() == aux2.getY()) {
            // Línea horizontal
            distancia = Math.abs(aux1.getX() - aux2.getX());
            if (distancia <= separador) {
                int fila = aux1.getY() / separador;
                int col = Math.min(aux1.getX(), aux2.getX()) / separador;
                System.out.println("se envio una linea");
                cli.enviarServidor(new Movimiento(fila, col, true, convertir.convertir_Dominio_a_DTO(cli.getJugadorCliente())));
            }
        } else {
            System.out.println("No es una línea válida");
        }
    }

    public void agregarPuntos() {
        separador = tmnTablero / tmn;
        System.out.println(separador);
        int x = 20;
        int y = 20;
        puntos.clear();
        for (int j = 0; j < tmn; j++) {
            for (int i = 0; i < tmn; i++) {
                punto c = new punto(x, y);
                puntos.add(c);
                x = x + separador;
            }
            x = 20;
            y = y + separador;
        }
    }

    @Override
    public Jugador[] obtenerJugadores() {
        return cli.getPartidaCliente().getJugadores();
    }

    @Override
    public String obtenerEstado() {
        return estado;
    }

    @Override
    public List<punto> obtenerPuntos() {
        return puntos;
    }

    @Override
    public List<linea> obtenerLineas() {
        return lineas;
    }

    @Override
    public linea obtenerLinea() {
        return linea;
    }

    @Override
    public String obtenerTurnoActual() {
        return cli.getJugadorTurnoActual();
    }

    @Override
    public void notificar() {
        vista.actualizar(interfaz);
    }

    @Override
    public void run() {
        while (Terminada) {
            if (cli.cambioPartida()) {
                interpretarMovimiento(cli.getUltimo());
                cli.setCambiograficoPartida(false);
            }

            estado = "refrescar";
            interfaz = this;
            vista.actualizar(interfaz);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }

    }

    private void interpretarMovimiento(Movimiento ultimo) {
        if (ultimo != null) {
            int x = ultimo.getColumna() * separador;
            int y = ultimo.getFila() * separador;

            punto p1, p2;

            if (ultimo.isEsHorizontal()) {
                p1 = new punto(x, y);
                p2 = new punto(x + separador, y);
            } else {
                p1 = new punto(x, y);
                p2 = new punto(x, y + separador);
            }
            linea = new linea(p1, p2, convertir.convertir_DTO_a_Dominio(ultimo.getJugador()), colores[turno]);

            linea nuevaLinea = new linea(p1, p2, convertir.convertir_DTO_a_Dominio(ultimo.getJugador()), colores[turno]);
            this.linea = nuevaLinea;
            this.lineas.add(nuevaLinea);

            turno = (turno + 1) % 3;
        }
    }

}
