package cz.vchirc.ircwars.base.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by David Pohan on 3/16/2015.
 */
@Entity
public class PlayerAlias extends AbstractEntity {
    private String name;
    @ManyToOne
    private Player player;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
