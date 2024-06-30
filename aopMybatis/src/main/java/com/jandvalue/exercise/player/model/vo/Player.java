package com.jandvalue.exercise.player.model.vo;

import java.sql.Timestamp;

public class Player {

	private String playerId;
	private String playerName;
	private String teamId;
	private String ePlayerName;
	private String nickname;
	private String joinYear;
	private String position;
	private int backNo;
	private String nation;
	private Timestamp birthDate;
	private String solar;
	private int height;
	private int weight;
	
	public Player() {}
	
	public Player(String playerId, String playerName, String teamId, String ePlayerName, String nickname,
			String joinYear, String position, int backNo, String nation, Timestamp birthDate, String solar, int height,
			int weight) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.teamId = teamId;
		this.ePlayerName = ePlayerName;
		this.nickname = nickname;
		this.joinYear = joinYear;
		this.position = position;
		this.backNo = backNo;
		this.nation = nation;
		this.birthDate = birthDate;
		this.solar = solar;
		this.height = height;
		this.weight = weight;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public String getePlayerName() {
		return ePlayerName;
	}

	public void setePlayerName(String ePlayerName) {
		this.ePlayerName = ePlayerName;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getJoinYear() {
		return joinYear;
	}

	public void setJoinYear(String joinYear) {
		this.joinYear = joinYear;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getBackNo() {
		return backNo;
	}

	public void setBackNo(int backNo) {
		this.backNo = backNo;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public Timestamp getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Timestamp birthDate) {
		this.birthDate = birthDate;
	}

	public String getSolar() {
		return solar;
	}

	public void setSolar(String solar) {
		this.solar = solar;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", teamId=" + teamId + ", ePlayerName="
				+ ePlayerName + ", nickname=" + nickname + ", joinYear=" + joinYear + ", position=" + position
				+ ", backNo=" + backNo + ", nation=" + nation + ", birthDate=" + birthDate + ", solar=" + solar
				+ ", height=" + height + ", weight=" + weight + "]";
	}
	
	
}
