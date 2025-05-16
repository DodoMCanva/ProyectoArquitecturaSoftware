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
}
