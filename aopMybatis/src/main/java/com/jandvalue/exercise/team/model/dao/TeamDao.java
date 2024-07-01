package com.jandvalue.exercise.team.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jandvalue.exercise.team.model.vo.Team;

@Repository
public class TeamDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public List<Team> selectTeamList() {
		
		return sqlSession.selectList("teamMapper.selectTeamList");
	}
}
