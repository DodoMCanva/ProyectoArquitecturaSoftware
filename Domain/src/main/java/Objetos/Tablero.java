package Objetos;

/**
 *
 * @author Equipo
 */
public class Tablero {

    private int tamano;
    private Linea[][] horizontales;
    private Linea[][] verticales;
    private Caja[][] cajas;

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public Tablero(int tamano) {
        this.tamano = tamano;
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
            if (verificarCajaFormada(x, y, true, jugador)) {
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
            if (verificarCajaFormada(x, y, false, jugador)) {
                jugador.incrementarPuntos();
            }
            return true;
        }
        return false;
    }

    private boolean verificarCajaFormada(int x, int y, boolean esHorizontal, Jugador jugador) {
        boolean cajaFormada = false;

        if (esHorizontal && x > 0) {
            if (!cajas[x - 1][y].tienePropietario()
                    && horizontales[x - 1][y].estaDibujada()
                    && verticales[x - 1][y].estaDibujada()
                    && verticales[x - 1][y + 1].estaDibujada()) {
                cajas[x - 1][y].setPropietario(jugador);
                cajaFormada = true;
            }
        }
        if (!esHorizontal && y > 0) {
            if (!cajas[x][y - 1].tienePropietario()
                    && verticales[x][y - 1].estaDibujada()
                    && horizontales[x][y - 1].estaDibujada()
                    && horizontales[x + 1][y - 1].estaDibujada()) {
                cajas[x][y - 1].setPropietario(jugador);
                cajaFormada = true;
            }
        }

        if (esHorizontal && x < cajas.length) {
            if (!cajas[x][y].tienePropietario()
                    && horizontales[x + 1][y].estaDibujada()
                    && verticales[x][y].estaDibujada()
                    && verticales[x][y + 1].estaDibujada()) {
                cajas[x][y].setPropietario(jugador);
                cajaFormada = true;
            }
        }
        if (!esHorizontal && x < cajas.length && y < cajas[0].length) {
            if (!cajas[x][y].tienePropietario()
                    && verticales[x][y + 1].estaDibujada()
                    && horizontales[x][y].estaDibujada()
                    && horizontales[x + 1][y].estaDibujada()) {
                cajas[x][y].setPropietario(jugador);
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
