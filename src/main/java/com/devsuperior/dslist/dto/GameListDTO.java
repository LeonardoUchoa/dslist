package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;
import org.springframework.beans.BeanUtils;

public class GameListDTO {
    private long id;
    private String name;

    public GameListDTO() {}
    public GameListDTO(GameList entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
