package Filtros;

import Objetos.Linea;

/**
 *
 * @author User
 */
public class FiltroCaracteres implements IFiltro<String, String>{
    
    @Override
    public String aplicar(String nombre) {
         if (nombre == null || nombre.trim().isEmpty()) {
            return ""; // Devuelve un nombre vacío si el valor es inválido
        }

        // Eliminamos caracteres especiales y números, dejando solo letras y espacios
        return nombre.replaceAll("[^a-zA-Z\\s]", "").trim();
    }

    

    @Override
    public boolean esValido(String var) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
