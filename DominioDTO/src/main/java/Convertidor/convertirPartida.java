package Convertidor;

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
        convertirJugador convertir = new convertirJugador();
        Tablero tablero = new Tablero(dto.getTablero().getTamano());
        Partida dominio = new Partida(tablero, dto.getNumeroJugadores());
        dominio.agregarJugador(convertir.convertir_DTO_a_Dominio(dto.getCreador()));
        return dominio;
    }

    public PartidaDTO convertir_Dominio_a_DTO(Partida dominio) {
        TableroDTO tablero = new TableroDTO(dominio.getTablero().getTamano());
        PartidaDTO dto = new PartidaDTO(tablero, dominio.getNumeroJugadores());
        return dto;
    }

}
