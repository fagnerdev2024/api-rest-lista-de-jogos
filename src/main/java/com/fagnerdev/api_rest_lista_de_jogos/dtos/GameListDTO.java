package com.fagnerdev.api_rest_lista_de_jogos.dtos;

import com.fagnerdev.api_rest_lista_de_jogos.entities.GameList;

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
