package com.jandvalue.exercise.team.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jandvalue.exercise.team.model.dao.TeamDao;
import com.jandvalue.exercise.team.model.vo.Team;

@Service
public class TeamServiceImpl implements TeamService{

	@Autowired TeamDao teamDao;
	
	@Override
	public List<Team> selectTeamList() {
		// TODO Auto-generated method stub
		return teamDao.selectTeamList();
	}

}
