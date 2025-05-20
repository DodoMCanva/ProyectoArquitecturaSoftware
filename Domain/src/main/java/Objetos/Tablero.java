package Objetos;

/**
 *
 * @author Equipo
 */
public class Tablero {

    private int tamano;
    public Linea[][] horizontales;
    private Linea[][] verticales;
    private Caja[][] cajas;
    private String[][] estructura;

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

     public Tablero(int tamano, String[][] estructura) {
        this.tamano = tamano;
        this.estructura = estructura;
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

        if (esHorizontal) {
            // Verificar caja arriba
            if (x > 0 && y < tamano - 1) {
                if (!cajas[x - 1][y].tienePropietario()
                        && horizontales[x - 1][y].estaDibujada()
                        && verticales[x - 1][y].estaDibujada()
                        && verticales[x - 1][y + 1].estaDibujada()) {
                    cajas[x - 1][y].setPropietario(jugador);
                    cajaFormada = true;
                }
            }

            // Verificar caja abajo
            if (x < tamano - 1 && y < tamano - 1) {
                if (!cajas[x][y].tienePropietario()
                        && horizontales[x + 1][y].estaDibujada()
                        && verticales[x][y].estaDibujada()
                        && verticales[x][y + 1].estaDibujada()) {
                    cajas[x][y].setPropietario(jugador);
                    cajaFormada = true;
                }
            }
        } else {
            // Verificar caja a la izquierda
            if (x < tamano - 1 && y > 0) {
                if (!cajas[x][y - 1].tienePropietario()
                        && verticales[x][y - 1].estaDibujada()
                        && horizontales[x][y - 1].estaDibujada()
                        && horizontales[x + 1][y - 1].estaDibujada()) {
                    cajas[x][y - 1].setPropietario(jugador);
                    cajaFormada = true;
                }
            }

            // Verificar caja a la derecha
            if (x < tamano - 1 && y < tamano - 1) {
                if (!cajas[x][y].tienePropietario()
                        && verticales[x][y + 1].estaDibujada()
                        && horizontales[x][y].estaDibujada()
                        && horizontales[x + 1][y].estaDibujada()) {
                    cajas[x][y].setPropietario(jugador);
                    cajaFormada = true;
                }
            }
        }

        return cajaFormada;
    }

    public int getTamano() {
        return tamano;
    }



    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public Linea[][] getHorizontales() {
        return horizontales;
    }


    public void setHorizontales(Linea[][] horizontales) {
        this.horizontales = horizontales;
    }


    public Linea[][] getVerticales() {
        return verticales;
    }


    public void setVerticales(Linea[][] verticales) {
        this.verticales = verticales;
    }

    public Caja[][] getCajas() {
        return cajas;
    }

    public void setCajas(Caja[][] cajas) {
        this.cajas = cajas;
    }
    
    

}
