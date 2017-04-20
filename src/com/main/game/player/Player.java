package com.main.game.player;

public class Player {
	
	public int playerHealth = 100;
	public int playerEnergy = 100;
	
	private String playerName;
	
	// Constructor and Methods to get and set the players name
	
	public Player() {
		
		this.playerName = getPlayerName();
		
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
	
	public void setPlayerEnergy(int playerEnergy) {
		
		this.playerEnergy = playerEnergy;
		
	}
	
	public void decreasePlayerEnergy(int playerEnergy) {
		
		this.playerEnergy = playerEnergy - 10;
		System.out.println("================================");
		System.out.println("You use some energy to move rooms...");
		System.out.println("================================");
		printEnergyLevel();
		
	}
	
	public void increasePlayerEnergy(int playerEnergy) {
		
		this.playerEnergy = playerEnergy + 10;
		System.out.println("================================");
		System.out.println("You gain some energy from eating...");
		System.out.println("================================");
		printEnergyLevel();
		
	}

	public void printEnergyLevel() {
		
	    System.out.println("Your Current Energy Level is: " + getPlayerEnergy());
	    
}
	
	public void printHealthLevel() {
		
	    System.out.println("Your Current Health Level is: " + getPlayerHealth());
	    
}
	

	
}
