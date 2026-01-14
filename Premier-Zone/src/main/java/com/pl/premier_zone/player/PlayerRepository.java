package com.pl.premier_zone.player;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface PlayerRepository extends JpaRepository<Player,String> {
    void deleteByName(String name);
    Optional<Player> findByName(String name);
}
