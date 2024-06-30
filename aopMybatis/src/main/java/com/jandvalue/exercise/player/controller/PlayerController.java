package com.jandvalue.exercise.player.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jandvalue.exercise.player.model.service.PlayerService;



@Controller
public class PlayerController {
	
	@Autowired
	private PlayerService service;

	@RequestMapping(value="playerList.do")
	public String returnBoardList(Model model) {
		
		model.addAttribute("playerList", service.selectPlayerList());
		return "player/players";
	}
	@RequestMapping(value="searchAteamPlayers.do")
	public String searchAteamPlayers(@RequestParam(value="teamName")String teamName, Model model) {
		
		model.addAttribute("aTeamPlayers", service.searchATeamPlayers(teamName)).addAttribute("teamName", teamName);
		return "player/aTeamPlayers";
	}
}
