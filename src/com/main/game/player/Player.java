package com.main.game.player;

import java.util.Random;

public class Player {
	
	Random rand;
	final String[] directions = {"North", "East", "South", "West"};
	private int playerHealth = 100;
	public int playerEnergy = 100;
	
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
	
	public int getPlayerHealth() {
		return playerHealth;
	}
	
	public int getPlayerEnergy() {
		return playerEnergy;
	}
	
	public void setPlayerHealth(int playerHealth) {
		this.playerHealth = playerHealth;
	}
	
	public void setPlayerEnergy(int playerEnergy) {
		this.playerEnergy = playerEnergy;
	}
	
	public void decreasePlayerEnergy(int playerEnergy) {
		this.playerEnergy = playerEnergy - 25;
	}
	
	public void increasePlayerEnergy(int playerEnergy) {
		this.playerEnergy = playerEnergy + 25;
	}

	public void printEnergyLevel() {
	    System.out.println("Your Current Energy Level is: " + getPlayerEnergy());
}
	

	
}
