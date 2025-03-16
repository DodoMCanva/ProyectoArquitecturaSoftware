/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Fer
 */
public class mdlLinea {
    private mdlPunto punto_1;
    private mdlPunto punto_2;
    private int limite;

    public mdlLinea(mdlPunto p1, mdlPunto p2, int lim){
        this.punto_1 = p1;
        this.punto_2 = p2;
        this.limite = lim;
    }

    public void setPunto1(mdlPunto punto){
        this.punto_1 = punto;
    }

    public void setPunto2(mdlPunto punto){
        this.punto_2 = punto;
    }

    public mdlPunto getPunto1(){
        return this.punto_1;
    }

    public mdlPunto getPunto2(){
        return this.punto_2;
    }

}
