package com.devsuperior.dslist.entities;

import jakarta.persistence.EmbeddedId;

import java.util.Objects;

public class Belonging {
    @EmbeddedId
    private BelongingPK id = new BelongingPK();

    private Integer Posistion;

    public Belonging() {}
    public Belonging(Game game, GameList list, Integer Posistion) {
        id.setGame(game);
        id.setList(list);
        this.Posistion = Posistion;
    }

    public BelongingPK getId() {
        return id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public Integer getPosistion() {
        return Posistion;
    }

    public void setPosistion(Integer posistion) {
        Posistion = posistion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
