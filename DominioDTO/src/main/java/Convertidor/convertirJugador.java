package Convertidor;

import Objetos.Jugador;
import Objetos.JugadorDTO;

/**
 *
 * @author Equipo
 */
public class convertirJugador {

    public Jugador convertir_DTO_a_Dominio(JugadorDTO dto) {
        Jugador dominio = new Jugador(dto.getAvatar(), dto.getNombre(), dto.getPuntos());
        return dominio;
    }

    public JugadorDTO convertir_Dominio_a_DTO(Jugador dominio) {
        JugadorDTO dto = new JugadorDTO(dominio.getAvatar(), dominio.getNombre(), dominio.getPuntos());
        return dto;
    }
}
