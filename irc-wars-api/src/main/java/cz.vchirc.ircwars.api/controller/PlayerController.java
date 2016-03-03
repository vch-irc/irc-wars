package cz.vchirc.ircwars.api.controller;

import cz.vchirc.ircwars.base.entity.Player;
import cz.vchirc.ircwars.base.repository.PlayerRepository;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by David Pohan on 3/16/2015.
 */
@Controller
@RequestMapping("/player")
public class PlayerController {
    @Autowired
    private PlayerRepository playerRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public @ResponseBody Iterable<Player> getPlayersAction() {
        return playerRepository.findAll();
    }

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public @ResponseBody Player newPlayerAction() {
        Player player = new Player();
        player.setCreated(new DateTime());
        return playerRepository.save(player);
    }
}
