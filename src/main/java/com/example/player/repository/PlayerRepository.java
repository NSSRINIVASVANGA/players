package com.example.player.repository;

import com.example.player.model.*;
import java.util.*;

public interface PlayerRepository {
    ArrayList<Player> getPlayers();

    Player addPlayer(Player player);

    Player getPlayerById(int playerId);

    Player updatePlayer(int playerId, Player player);

    void deletePlayer(int playerId);
}