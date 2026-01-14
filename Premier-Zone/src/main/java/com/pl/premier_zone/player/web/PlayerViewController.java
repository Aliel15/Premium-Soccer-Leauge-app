package com.pl.premier_zone.player.web;

import com.pl.premier_zone.player.Player;
import com.pl.premier_zone.player.PlayerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/players")
public class PlayerViewController {

    private final PlayerService playerService;

    public PlayerViewController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public String listPlayers(Model model) {
        model.addAttribute("players", playerService.getPlayers());
        return "players";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("player", new Player());
        return "add-player";
    }

    @PostMapping("/save")
    public String savePlayer(@ModelAttribute Player player) {
        playerService.addPlayer(player);
        return "redirect:/players";
    }

    @GetMapping("/delete/{name}")
    public String deletePlayer(@PathVariable String name) {
        playerService.deletePlayer(name);
        return "redirect:/players";
    }

    @GetMapping("/edit/{name}")
    public String showEditForm(@PathVariable String name, Model model) {
        return playerService.getPlayersByName(name)
                .stream()
                .findFirst()
                .map(player -> {
                    model.addAttribute("player", player);
                    return "edit-player";
                })
                .orElse("redirect:/players");
    }

}

