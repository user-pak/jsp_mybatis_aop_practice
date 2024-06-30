package com.jandvalue.exercise.player.model.service;

import java.util.List;


import com.jandvalue.exercise.player.model.vo.Player;


public interface PlayerService {

	List<Player> selectPlayerList();

	List<Player> searchATeamPlayers(String teamName);
}
