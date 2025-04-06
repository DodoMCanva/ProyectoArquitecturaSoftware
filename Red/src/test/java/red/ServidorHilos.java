/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package red;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author delll
 */
public class ServidorHilos extends Thread {
      private Socket cliente;
    private ObjectOutputStream out;
    private ObjectInputStream in;
    private SocketCliente sc = SocketCliente.getInstance();
    private ArrayList<ServidorHilos> listaOutputs = new ArrayList<>();

    /**
     * Crea socket hilos para datos salientes o entrantes
     */
     public ServidorHilos(Socket cliente) {
        this.cliente = cliente;
        try {
            in = new ObjectInputStream(cliente.getInputStream());
            out = new ObjectOutputStream(cliente.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(ServidorHilos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
      /**
     * Obtiene al cliente
     *
     * @return devuelve al cliente
     */
    public Socket getCliente() {
        return cliente;
    }

    /**
     * Lista de salidas
     * @param listaOutputs
     */
    public void setListaOutputs(ArrayList<ServidorHilos> listaOutputs) {
        this.listaOutputs = listaOutputs;
    }

}
