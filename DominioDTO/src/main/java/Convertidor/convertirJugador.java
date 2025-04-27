package Convertidor;

import Objetos.Jugador;
import Objetos.JugadorDTO;

/**
 *
 * @author Equipo
 */
public class convertirJugador {

    public Jugador convertir_DTO_a_Dominio(JugadorDTO dto) {
        Jugador dominio = new Jugador(dto.getNombre(), dto.getAvatar(), dto.getPuntos());
        return dominio;
    }

    public JugadorDTO convertir_Dominio_a_DTO(Jugador dominio) {
        JugadorDTO dto = new JugadorDTO(dominio.getNombre(), dominio.getAvatar(), dominio.getPuntos());
        return dto;
    }
}
