package com.jandvalue.exercise.player.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.jandvalue.exercise.player.model.vo.Player;

@Repository
public class PlayerDao {

	@Autowired SqlSessionTemplate sqlSession;
	
	public List<Player> selectPlayerList() {
		
		return sqlSession.selectList("playerMapper.selectPlayer");
	}

	public List<Player> searchATeamPlayers(String teamName) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("playerMapper.searchATeamPlayers", teamName);
	}
}
