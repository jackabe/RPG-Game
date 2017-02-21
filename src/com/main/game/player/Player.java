package com.main.game.player;

public class Player {
	
	private static int playerHealth;
	public static int playerEnergy = 100;
	
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
	
	public static void decreasePlayerEnergy(int playerEnergy) {
		Player.playerEnergy = playerEnergy - 25;
	}
	
	public static void increasePlayerEnergy(int playerEnergy) {
		Player.playerEnergy = playerEnergy + 25;
	}

	public static void printEnergyLevel() {
	    System.out.println("Your Current Energy Level is: " + getPlayerEnergy());
}

	

}
