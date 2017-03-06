package com.main.game.room;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.main.game.npc.NPC;


public class Room {
	
	Random rand = new Random();
	final String[] directions = {"North", "East", "South", "West"};
	private List<String> rooms;
	final int MAX_ROOMS = 8;
	private String info[];
	

	public Room() {
		
		this.rooms = new ArrayList<>();
			
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
		
		if(rooms.contains(newRoom.getRoom(1))) {
			 
			rooms.remove(getRoom(1));
			System.out.println("You are currently in the " + getRoom(1) + ", look around and find some new rooms");
			return "";
			
		}
		
		else if(rooms.contains(newRoom.getRoom(2)) || rooms.contains(newRoom.getRoom(3)) || rooms.contains(newRoom.getRoom(4))  || rooms.contains(newRoom.getRoom(5)) ) {
						
			int randnum = newRoom.randomRoomNumber();
			String temproom = newRoom.getRoom(randnum);
			
			while (!rooms.contains(temproom)) {
				
				return generateRoom();
								
			}
			
			rooms.remove(temproom);
			return "";
				
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



	public String[] giveOptions() {
		
		String room1 = genTempRoom();
		String room2 = genTempRoom();
		String direction1 = randomDirection();
		String direction2 = randomDirection();
		
		while (true) {
			
			if (!rooms.contains(room1) || !rooms.contains(room2) || room1 == room2 || direction1 == direction2){
		
				giveOptions();
				break;
								
			}
		
			else {
			
				return new String[] {room1, direction1, room2, direction2};
			
		    }
			
		}
		
		return giveOptions();
			
	}
		

	public void startRoom(String roomName) {
		
		System.out.println("========================");	
		
		System.out.println("You are now in the " + roomName);
		System.out.println("You are approached by a " + NPC.generateRandomNPC());
		
	}
		
	public void givePlayerOptions() {
		
	    String options[] = giveOptions();
	    String room1 = (options[0]);
	    String room2 = (options[2]);
	    String direction1 = (options[1]);
	    String direction2 = (options[3]);
	    
	    System.out.println("To your " +direction1 + " is the " +room1 + " and to your " +direction2 + " is the " +room2);
	    
		System.out.println("Where would you like to go?");
		Scanner sc1 = new Scanner(System.in);	
		String response = sc1.nextLine();
		
//	    while (true) {
//	    	
//	    	response = sc1.nextLine();
//	    	
//	    	if (!response.contains(direction1) || !response.contains(direction2)) {
//	    		
//	    		System.out.println("Not a valid answer");
//	    		continue;
//	    		
//	    	}
//	    	
//	    	break;
//	    	
//	    }	
		
	    
		if (response.contains(direction1)) {
			
			startRoom(room1);
			
		}
		
		else if (response.contains(direction2)) {
		
			startRoom(room2);
			
		}
		
	}
		
	
	public void printRooms() {
	    System.out.println(rooms);
	}
	
}
	
