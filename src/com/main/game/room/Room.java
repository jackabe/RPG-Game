package com.main.game.room;

public class Room {
	
	private String direction;
	private String roomName;
	private static int roomNumber;

	public Room(String direction) {
		
		this.direction = direction;
			
	}
	
	public static String getRoom(int roomNumber) {

		switch (roomNumber) {
		
			case 1: return "Cave Entrance";
								
			case 2: return "Sewer";
			
			case 3: return "Graveyard";
			
			case 4: return "Church";
			
			case 5: return "Haunted Room";
			
			case 6: return "Volcano Entrance";
			
			case 7: return "Volcano Chamber";
			
			case 8: return "The Dragon's Lair";
			
		}
		return "";
		
		
		
	}
	
	public String getDirection() {
		return direction;
	}
	
	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	
	public void setRoom(String direction) {
		this.direction = direction;
	}
}
