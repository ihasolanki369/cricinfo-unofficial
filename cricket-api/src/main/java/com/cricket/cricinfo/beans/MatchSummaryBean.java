package com.cricket.cricinfo.beans;

import com.cricket.annotations.SimpleSelector;
import com.cricket.annotations.TextSelector;

@SimpleSelector
public class MatchSummaryBean {

	@TextSelector(selector=".space-top-bottom-5:has(a[href*=series]):first-child")
	private String tournament;
	
	@TextSelector(selector=".team-1-name .teamLink:eq(0), .team-1-name", regex="[a-zA-z ]+(?= v)|[a-zA-z ]+")
	private String team1;
	
	@TextSelector(selector=".team-1-name .teamLink:eq(1), .team-2-name", regex="[a-zA-z ]+(?= v)|[a-zA-z ]+")
	private String team2;
	
	@TextSelector(selector=".innings-information .innings-requirement")
	private String matchStatus;
	
	@TextSelector(selector=".space-top-bottom-5 a[href*=ground]")
	private String ground;
	
	@TextSelector(selector=".space-top-bottom-5:last-child")
	private String info;

	public String getTournament() {
		return tournament;
	}

	public void setTournament(String tournament) {
		this.tournament = tournament;
	}

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public String getMatchStatus() {
		return matchStatus;
	}

	public void setMatchStatus(String matchStatus) {
		this.matchStatus = matchStatus;
	}

	public String getGround() {
		return ground;
	}

	public void setGround(String ground) {
		this.ground = ground;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
}
