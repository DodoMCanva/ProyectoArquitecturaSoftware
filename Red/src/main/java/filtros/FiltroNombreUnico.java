package filtros;

import Servidor.Servidor;

public class FiltroNombreUnico implements Filtro<Boolean, String> {
   

    @Override
    public Boolean aplicar(String nombre) {
        synchronized (Servidor.nombres) {
            return !Servidor.nombres.contains(nombre);
        }
    }

}
