package com.jandvalue.exercise.team.model.vo;

public class Team {

	private String teamId;
	private String regionName;
	private String teamName;
	private String stadiumId;
	
	public Team() {}

	public Team(String teamId, String regionName, String teamName, String stadiumId) {
		super();
		this.teamId = teamId;
		this.regionName = regionName;
		this.teamName = teamName;
		this.stadiumId = stadiumId;
	}

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getStadiumId() {
		return stadiumId;
	}

	public void setStadiumId(String stadiumId) {
		this.stadiumId = stadiumId;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", regionName=" + regionName + ", teamName=" + teamName + ", stadiumId="
				+ stadiumId + "]";
	}
	
	
}
