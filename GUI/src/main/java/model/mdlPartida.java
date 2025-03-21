package model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.List;
import view.frmPartida;
import java.lang.Math;

/**
 *
 * @author Equipo
 */
public class mdlPartida implements iVista {

    //Listas de atributos del juego
    private List<mdlPunto> puntos = new ArrayList<>();
    private List<mdlLinea> lineas = new ArrayList<>();
    private mdlJugador propietario = new mdlJugador("", "", true, true, 0, "");
    private mdlJugador[] jugadores = new mdlJugador[4];
    int Jugadoractual = 0;
    //Variables Auxiliares
    private mdlPunto aux1, aux2;
    private boolean c = false;

    //Variables de Configuracion
    private int tmn = 10;
    private int tmnTablero = 635;
    private int separador = 0;

    // Se agrega una referencia al frmPartida
    private frmPartida frm;

    // Constructor que recibe la referencia de frmPartida
    public mdlPartida(frmPartida frm) {
        this.frm = frm;  // Se guarda la referencia de frmPartida
        separador = tmnTablero / tmn;
    }

    @Override
    public void update() {

    }

    // Método para pintar el círculo
    public static void pintarCirculo(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillOval(x, y, 15, 15);  // Dibuja el círculo
    }

    // Método para agregar los puntos
    public void agregarPuntos() {
        int separador = tmnTablero / tmn;
        System.out.println(separador);

        int x = 20;
        int y = 20;

        puntos.clear();
        for (int j = 0; j < tmn; j++) {
            for (int i = 0; i < tmn; i++) {
                mdlPunto c = new mdlPunto(x, y);
                puntos.add(c);
                x = x + separador;
            }

            x = 20;
            y = y + separador;
        }
        pintarPuntos();
        // Imprime todos los puntos para depurar
        for (mdlPunto punto : puntos) {
            System.out.println(punto.toString());
        }
    }

    public void pintarPuntos() {
        for (mdlPunto punto : puntos) {
            pintarCirculo(frm.pnlDibujo.getGraphics(), punto.getX(), punto.getY());
        }

    }

    public static void pintarLinea(Graphics g, int x1, int y1, int x2, int y2) {
        int xAux = 0;
        int yAux = 0;
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(2);
        ((Graphics2D) g).setStroke(stroke);
        ((Graphics2D) g).drawLine(x1 + 10, y1 + 10, x2 + 10, y2 + 10);

        if (x1 <= x2) {
            xAux = ((x2 - x1) / 2) + x1;
        }
        if (x1 > x2) {
            xAux = ((x1 - x2) / 2) + x2;
        }
        if (y1 < y2) {
            yAux = ((y2 - y1) / 2) + y1;
        }
        if (y1 >= y2) {
            yAux = ((y1 - y2) / 2) + y2;
        }
    }

    public void verificarPunto(int x, int y) {
        int d = 20;
        for (mdlPunto punto : puntos) {
            if ((x <= (punto.getX() + d) && x >= (punto.getX() - d)) && ((y <= (punto.getY() + d) && (y >= (punto.getY() - d))))) {
                System.out.println("Si es punto wens");
                if (!c) {
                    aux1 = punto;
                    c = true;
                } else {
                    if (aux1 != punto) {
                        aux2 = punto;
                        verificarLinea(aux1, aux2);
                        c = false;
                    }else{
                        System.out.println("Es el mismo punto wens");
                    }

                }
            }
        }
    }

    public void verificarLinea(mdlPunto aux1, mdlPunto aux2) {

        int distancia = 0;
        if (aux1.getX() == aux2.getX()) {
            System.out.println("Equis iguales");
            distancia = Math.abs(aux1.getY() - aux2.getY());
            System.out.println(distancia);
            if (distancia <= separador) {
                mdlLinea linea = new mdlLinea(aux1, aux2, jugadores[Jugadoractual]);
                lineas.add(linea);
                pintarLinea(frm.pnlDibujo.getGraphics(), aux1.getX(), aux1.getY(), aux2.getX(), aux2.getY());
                cambiarTurno();
            } else {
                System.out.println("Linea Invalida");
            }
        }
        if (aux1.getY() == aux2.getY()) {
            System.out.println("Yes iguales");
            distancia = Math.abs(aux1.getX() - aux2.getX());
            System.out.println(distancia);
            if (distancia <= separador) {
                mdlLinea linea = new mdlLinea(aux1, aux2, jugadores[Jugadoractual]);
                lineas.add(linea);
                pintarLinea(frm.pnlDibujo.getGraphics(), aux1.getX(), aux1.getY(), aux2.getX(), aux2.getY());
                cambiarTurno();
            } else {
                System.out.println("Linea Invalida");
            }
        }

    }

    public void cambiarTurno() {

        //Esto no se quedara asi, es solo mock
        System.out.println("Turno jugador que jugó: " + (Jugadoractual + 1));

        //jugadores[Jugadoractual].setTurno(false);
        if (Jugadoractual < jugadores.length - 1) {
            Jugadoractual++;
        } else {
            Jugadoractual = 0;
        }

        //jugadores[Jugadoractual].setTurno(true);
        System.out.println("Turno jugador que sigue: " + (Jugadoractual + 1));
        //propietario false
    }

    public boolean verficarTurno() {
        return propietario.getTurno();
    }

    public void refrescar() {
        pintarPuntos();
    }
}
