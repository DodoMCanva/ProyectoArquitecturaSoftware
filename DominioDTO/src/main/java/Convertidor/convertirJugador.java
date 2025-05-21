package Convertidor;

import Objetos.Jugador;
import Objetos.JugadorDTO;

/**
 *
 * @author Equipo
 */
public class convertirJugador {

    public Jugador convertir_DTO_a_Dominio(JugadorDTO dto) {
        if (dto != null) {
            Jugador dominio = new Jugador(dto.getNombre(), dto.getAvatar(), dto.getPuntos());
            return dominio;
        }
        return null;
    }

    public JugadorDTO convertir_Dominio_a_DTO(Jugador dominio) {
        if (dominio != null) {
            JugadorDTO dto = new JugadorDTO(dominio.getNombre(), dominio.getAvatar(), dominio.getPuntos());
            return dto;
        }
        return null;
    }
     public Jugador[] mapear(JugadorDTO[] jugadoresDTO) {
       
    if (jugadoresDTO == null) {
        throw new IllegalArgumentException("El arreglo jugadoresDTO es null.");
    }

    Jugador[] jugadores = new Jugador[jugadoresDTO.length];
    for (int i = 0; i < jugadoresDTO.length; i++) {
        if (jugadoresDTO[i] == null) {
            System.out.println("Advertencia: jugadoresDTO[" + i + "] es null.");
            jugadores[i] = null; // O asigna un jugador vacío si es necesario
        } else {
            jugadores[i] = new Jugador(jugadoresDTO[i].getNombre(), jugadoresDTO[i].getAvatar(), jugadoresDTO[i].getPuntos());
        }
    }
    return jugadores;
}
    
}
