
package model;

/**
 *
 * @author Equipo
 */
public class mdlLinea {
    private mdlPunto punto_1;
    private mdlPunto punto_2;
    private mdlJugador jgdr;

    public mdlLinea(mdlPunto p1, mdlPunto p2, mdlJugador j){
        this.punto_1 = p1;
        this.punto_2 = p2;
        this.jgdr = j;
      
    }

    public void setPunto1(mdlPunto punto){
        this.punto_1 = punto;
    }

    public void setPunto2(mdlPunto punto){
        this.punto_2 = punto;
    }

    public void setJugador(mdlJugador jugador){
        this.jgdr = jugador;
    }

    public mdlPunto getPunto1(){
        return this.punto_1;
    }

    public mdlPunto getPunto2(){
        return this.punto_2;
    }

    public mdlJugador getJugador(){
        return this.jgdr;
    }

}
