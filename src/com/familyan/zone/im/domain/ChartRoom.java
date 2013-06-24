package com.familyan.zone.im.domain;

import java.util.List;

import com.familyan.zone.undercover.domain.GamePlayer;

public class ChartRoom {

	private String code;
	private String name;
	private String roomNumber;
	private List<GamePlayer> players;
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getRoomNumber() {
		return roomNumber;
	}
	
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public List<GamePlayer> getPlayers() {
		return players;
	}
	
	public void setPlayers(List<GamePlayer> players) {
		this.players = players;
	}
	
}
