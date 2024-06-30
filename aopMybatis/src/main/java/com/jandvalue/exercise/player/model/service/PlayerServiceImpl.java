package com.jandvalue.exercise.player.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jandvalue.exercise.player.model.dao.PlayerDao;
import com.jandvalue.exercise.player.model.vo.Player;

@Service
public class PlayerServiceImpl implements PlayerService{
	
	@Autowired
	private PlayerDao playerDao;
	
	@Override
	public List<Player> selectPlayerList() {
		// TODO Auto-generated method stub
		return playerDao.selectPlayerList();
	}

	@Override
	public List<Player> searchATeamPlayers(String teamName) {
		// TODO Auto-generated method stub
		return playerDao.searchATeamPlayers(teamName);
	}



}
