package Objetos;

/**
 *
 * @author Equipo
 */
public class Tablero {

    private Linea[][] horizontales;
    private Linea[][] verticales;
    private Caja[][] cajas;

    public Tablero(int tamano) {
        horizontales = new Linea[tamano][tamano - 1];
        verticales = new Linea[tamano - 1][tamano];
        cajas = new Caja[tamano - 1][tamano - 1];

        for (int i = 0; i < tamano - 1; i++) {
            for (int j = 0; j < tamano - 1; j++) {
                cajas[i][j] = new Caja();
            }
        }

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano - 1; j++) {
                horizontales[i][j] = new Linea();
            }
        }

        for (int i = 0; i < tamano - 1; i++) {
            for (int j = 0; j < tamano; j++) {
                verticales[i][j] = new Linea();
            }
        }
    }

    public boolean dibujarLineaHorizontal(int x, int y, Jugador jugador) {
        if (x < 0 || x >= horizontales.length || y < 0 || y >= horizontales[0].length) {
            return false;
        }

        Linea linea = horizontales[x][y];
        if (!linea.estaDibujada()) {
            linea.dibujar(jugador);
            if (verificarCajaFormada(x, y)) {
                jugador.incrementarPuntos();
            }
            return true;
        }
        return false;
    }

    public boolean dibujarLineaVertical(int x, int y, Jugador jugador) {
        if (x < 0 || x >= verticales.length || y < 0 || y >= verticales[0].length) {
            return false;
        }

        Linea linea = verticales[x][y];
        if (!linea.estaDibujada()) {
            linea.dibujar(jugador);
            if (verificarCajaFormada(x, y)) {
                jugador.incrementarPuntos();
            }
            return true;
        }
        return false;
    }

    private boolean verificarCajaFormada(int x, int y) {
        boolean cajaFormada = false;

        if (x < horizontales.length - 1 && y < verticales[0].length - 1) {
            Caja caja = cajas[x][y];
            if (!caja.tienePropietario()
                    && horizontales[x][y].estaDibujada()
                    && // Arriba
                    verticales[x][y].estaDibujada()
                    && // Izquierda
                    horizontales[x + 1][y].estaDibujada()
                    && // Abajo
                    verticales[x][y + 1].estaDibujada()) { // Derecha
                caja.setPropietario(verticales[x][y].getJugador());
                cajaFormada = true;
            }
        }

        return cajaFormada;
    }

    public void imprimirTablero() {
        for (int i = 0; i < horizontales.length; i++) {
            for (int j = 0; j < horizontales[i].length; j++) {
                System.out.print(horizontales[i][j].estaDibujada() ? " _ " : "   ");
            }
            System.out.println();

            for (int j = 0; j < verticales[i].length; j++) {
                System.out.print(verticales[i][j].estaDibujada() ? "| " : "  ");
            }
            System.out.println();
        }

        for (int i = 0; i < verticales[verticales.length - 1].length; i++) {
            System.out.print(" _ ");
        }
        System.out.println();
    }
}


