package cz.vchirc.ircwars.base.repository;

import cz.vchirc.ircwars.base.entity.Player;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by David Pohan on 3/16/2015.
 */
public interface PlayerRepository extends CrudRepository<Player, Long> {
}
