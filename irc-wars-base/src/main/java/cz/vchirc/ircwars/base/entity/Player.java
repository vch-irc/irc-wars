package cz.vchirc.ircwars.base.entity;

import org.hibernate.annotations.BatchSize;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by David Pohan on 3/15/2015.
 */
@Entity
public class Player extends AbstractEntity {
    private Integer name;
    private Integer health;
    private Integer attack;
    private Integer defense;
    private Integer money;
    @BatchSize(size = 128)
    @OneToMany(mappedBy = "player", fetch = FetchType.EAGER)
    private List<PlayerAlias> aliases;

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public List<PlayerAlias> getAliases() {
        return aliases;
    }

    public void setAliases(List<PlayerAlias> aliases) {
        this.aliases = aliases;
    }
}
