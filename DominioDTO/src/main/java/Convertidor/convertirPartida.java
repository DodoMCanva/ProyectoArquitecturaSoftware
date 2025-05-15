package Convertidor;

import Objetos.Jugador;
import Objetos.JugadorDTO;
import Objetos.Partida;
import Objetos.PartidaDTO;
import Objetos.Tablero;
import Objetos.TableroDTO;

/**
 *
 * @author Equipo
 */
public class convertirPartida {

    public Partida convertir_DTO_a_Dominio(PartidaDTO dto) {
        if (dto == null) {
            throw new IllegalArgumentException("PartidaDTO es null");
        }
        if (dto.getTablero() == null) {
            throw new IllegalArgumentException("TableroDTO es null");
        }

        convertirJugador convertir = new convertirJugador();
        Tablero tablero = new Tablero(dto.getTablero().getTamano());
        Partida dominio = new Partida(tablero, dto.getNumeroJugadores());

        if (dto.getJugadores() != null) {
            for (JugadorDTO jugadorDTO : dto.getJugadores()) {
                if (jugadorDTO != null) {
                    dominio.agregarJugador(convertir.convertir_DTO_a_Dominio(jugadorDTO));
                }
            }
        }

        return dominio;
    }

    public PartidaDTO convertir_Dominio_a_DTO(Partida dominio) {
        if (dominio == null) {
            throw new IllegalArgumentException("Partida es null");
        }

        TableroDTO tableroDTO = new TableroDTO(dominio.getTablero().getTamano());
        PartidaDTO dto = new PartidaDTO(tableroDTO, dominio.getNumeroJugadores());

        convertirJugador convertir = new convertirJugador();

        Jugador[] jugadores = dominio.getJugadores();
        JugadorDTO[] jugadoresDTO = new JugadorDTO[jugadores.length];

        for (int i = 0; i < jugadores.length; i++) {
            jugadoresDTO[i] = convertir.convertir_Dominio_a_DTO(jugadores[i]);
        }

        dto.setJugadores(jugadoresDTO);

        return dto;
    }

}
