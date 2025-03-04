package control;

import model.mdlPartida;
import view.frmPartida;

/**
 *
 * @author Fer
 */
public class ctrlPartida{
 public void iniciar(){
     
      mdlPartida a= new mdlPartida();
      frmPartida b= new frmPartida();
      b.setVisible(true);
      a.agregarPuntos();
      
 }   
  

}
