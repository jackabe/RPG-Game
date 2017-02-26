package com.main.game.room;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Room {
	
	Random rand = new Random();
	final String[] directions = {"North", "East", "South", "West"};
	private List<String> rooms;
	private List<String> temprooms;
	final int MAX_ROOMS = 8;
	

	public Room() {
		
		this.rooms = new ArrayList<String>();
		this.temprooms = new ArrayList<String>();
			
	}
	
	public String getRoom(int roomNumber) {
 
		switch (roomNumber) {
		
			case 0: return "You can't access here yet, you still have other rooms to discover!";
		
			case 1: return "Cave Entrance";
								
			case 2: return "Sewer";
			
			case 3: return "Graveyard";
			
			case 4: return "Church";
			
			case 5: return "Haunted Room";
			
			case 6: return "Volcano Entrance";
			
			case 7: return "Volcano Chamber";
			
			case 8: return "The Dragon's Lair";
			
			case 9: return "You have already been here, try somewhere else!";
			
		}
		return "";
		
	}
	
	public boolean addRoom(String roomId) {
		   if (rooms.size() < MAX_ROOMS) {
			   rooms.add(roomId);
		     return true;
		   } else {
		     return false;
		   }
		}
	
	public boolean removeRoom(String roomId) {
		   if (rooms.size() > 1) {
			   rooms.remove(roomId);
		     return true;
		   } else {
		     return false;
		   }
		}

	public int randomRoomNumber() {
		
		int randomRoom = rand.nextInt(4) + 2;
		return randomRoom;
	}
	

	public String generateRoom() {
		
		Room newRoom = new Room();
		
		if(rooms.contains("Cave Entrance")) {
			 
			rooms.remove(getRoom(1));
			System.out.println("You are currently in the " + getRoom(1) + ", look around and find some new rooms");
			giveOptions();
			return "";
			
		}
		
		else if(rooms.contains("Sewer") || rooms.contains("Church") || rooms.contains("Graveyard")  || rooms.contains("Haunted Room") ) {
						
			int randnum = newRoom.randomRoomNumber();
			String temproom = newRoom.getRoom(randnum);
			
			while (!rooms.contains(temproom)) {
				
				return generateRoom();
								
			}
			
			rooms.remove(temproom);
			return temproom;
				
			}
		

		else if (rooms.contains("Volcano Entrance")) {
			
			rooms.remove(getRoom(6));
			return newRoom.getRoom(6);
		
		}
		
		else if (rooms.contains("Volcano Chamber") && !rooms.contains("Volcano Entrance")) {
			
			rooms.remove(getRoom(7));	
			return newRoom.getRoom(7);
		
		}
		
		else if (rooms.contains("The Dragon's Lair") && !rooms.contains("Volcano Entrance") && !rooms.contains("Volcano Chamber")) {
			
			rooms.remove(getRoom(8));	
			return newRoom.getRoom(8);
		
		}
		
		else {
		return "UH OH Problems";
		
		}
		
	}
	
	public String randomDirection() {
		
		 int index = rand.nextInt(directions.length);
		 String randomDirection = directions[index];
			
		 return randomDirection;
		
	}
	
	public String genTempRoom() {
		
		Room newRoom = new Room();
		
		int randnum = newRoom.randomRoomNumber();
		String temproom = newRoom.getRoom(randnum);
		return temproom;
		
	}



	public void giveOptions() {
		
		temprooms.add(genTempRoom());
		if (temprooms.contains(genTempRoom())) {
		
			System.out.println("You have already been here, but you can go to your " +randomDirection() + " where there is the " +genTempRoom());
						
		}
		
		
		else {
			
			System.out.println("To your " +randomDirection() + " is the " +genTempRoom() + " and to your " +randomDirection() + " is the " +genTempRoom());
		}
		

	}
	
	
//	public int test1() {
//		
//		int max = 8;
//		int min = 6;
//		
//		int test1 = min+ rand.nextInt(max - min + 1);
//		return test1;
//	}
	
	public void printRooms() {
	    System.out.println(rooms);
	}
	
}
	
