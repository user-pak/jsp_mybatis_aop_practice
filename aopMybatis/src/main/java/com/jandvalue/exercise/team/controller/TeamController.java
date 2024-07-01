package com.jandvalue.exercise.team.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.jandvalue.exercise.team.model.service.TeamService;

@Controller
public class TeamController {

	@Autowired TeamService teamService;
	
	@ResponseBody
	@RequestMapping(value="teamList.do", produces = "application/json; charset=utf8")
	public String selectTeamList() {
		
		return new Gson().toJson(teamService.selectTeamList());
	}
}
