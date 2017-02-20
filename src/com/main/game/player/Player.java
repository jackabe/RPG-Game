package com.main.game.player;

public class Player {
	
	private static int playerHealth;
	private static int playerEnergy;
	
	private String playerName;
	
	// Constructor and Methods to get and set the players name
	
	public Player(String playerName) {
		this.playerName = playerName;
	}
	
	
	public String getPlayerName() {
		return playerName;
	}
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	// Getters and setters for the players health, inventory and energy
	
	public static int getPlayerHealth() {
		return playerHealth;
	}
	
	public static int getPlayerEnergy() {
		return playerEnergy;
	}
	
	public static void setPlayerHealth(int playerHealth) {
		Player.playerHealth = playerHealth;
	}
	
	public static void setPlayerEnergy(int playerEnergy) {
		Player.playerEnergy = playerEnergy;
	}
	

	

}
