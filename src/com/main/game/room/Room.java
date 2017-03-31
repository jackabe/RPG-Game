package com.main.game.room;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.main.Capitalize;
import com.main.game.npc.NPC;
import com.main.game.player.Combat;
import com.main.game.player.Inventory;


public class Room extends Combat{
	
	Random rand = new Random();
	final String[] directions = {"North", "East", "South", "West"};
	private List<String> rooms;
	final int MAX_ROOMS = 8;
	final int MIN_ROOMS = 5;

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
	
	public boolean hasVisited(String room) {
		
		if (rooms.contains(room)) {
			return false;
		}
		return true;
		
	}
	
	public boolean checkRoomSize() {
		
		if (rooms.size() < MIN_ROOMS) {
			return true;
		}
		return false;
		
	}
	
	public void startingRoom() {
		
		rooms.remove(getRoom(1));
		System.out.println("You are currently in the " + getRoom(1) + ", look around and find some new rooms");
		
	}
	
	
	public void printRooms() {
		
		System.out.println(rooms);
	}
	
	
	public String[] randomDirections() {

		int index1 = rand.nextInt(directions.length);
		int index2 = rand.nextInt(directions.length);
		
		String direction1 = directions[index1];
		String direction2 = directions[index2];

		
		if (index1 == index2) {
			
			if (index1 >= 1 ) {
				
				direction1 = directions[index1-1];
				
			}
			
			else if (index1 <= 1) {
				
				direction1 = directions[index1+1];
				
			}
			 	 
		}
		
		return new String[] {direction1, direction2};
		
	}
	
	public String[] randomRooms() {
		
		int index1 = rand.nextInt(4) + 2;
		String room1 = getRoom(index1);
		
		int index2 = rand.nextInt(4) + 2;
		String room2 = getRoom(index2);
		
		if (index1 == index2) {
			
			if (index1 > 2 ) {
				
				index1 = index1-1;
				room1 = getRoom(index1);
			}
			
			else if (index1 == 2) {
				
				index1 = index1+1;
				room1 = getRoom(index2);
				
			}
			 	 
		}
		
		
		else if (rooms.size() < MIN_ROOMS) {
			
			return new String[] {room1};
			
		}
		
		while (hasVisited(room1) || hasVisited(room2) == true) {

			return randomRooms();
			
		}
		
		return new String[] {room1, room2};
		
	}
	
	public void giveOptions() {
		
		if (rooms.size() >= 5) {
			
			String directions[] = randomDirections();
			String direction1 = (directions[0]);
			String direction2 = (directions[1]);
		
			String rooms[] = randomRooms();
			String room1 = (rooms[0]);
			String room2 = (rooms[1]);
		
			System.out.println("To the " +direction1 + " is the " + room1 + " and to the " +direction2 + " is the " + room2);
		
			System.out.println("Where would you like to go?");
			@SuppressWarnings("resource")
			Scanner sc1 = new Scanner(System.in);	
			String response = sc1.nextLine();
			response = Capitalize.setStringCase(response);

			if (response.contains(direction1)) {
			
			removeRoom(room1);
			startRoom(room1);
			
			}
		
			else if (response.contains(direction2)) {
		
				removeRoom(room2);
				startRoom(room2);
			
			}
			
			else {
	
				while (!response.contains(direction1) && !response.contains(direction2)) {
					
					System.out.println("Please enter a proper direction");
					response = sc1.nextLine();
					response = Capitalize.setStringCase(response);
					
					if (response.contains(direction1)) {
						
						removeRoom(room1);
						startRoom(room1);
						break;
						
					}
					
					else if(response.contains(direction2)) { 
						
						removeRoom(room1);
						startRoom(room1);
						break;
						
					}
					
					else {
						
						continue;
						
					}
				
				}
				
			}
		
		}

		
		else if (rooms.size() == 4) {
			
			String rooms[] = randomRooms();
			String room1 = (rooms[0]);
			
			System.out.println("After defeating the room you spot only one exit...");
			System.out.println("You walk through to the next room..");
			removeRoom(room1);
			startRoom(room1);

		}
		
		else if (rooms.size() == 3) {
			
			String room = getRoom(6);
			
			System.out.println("After defeating the room you spot an entrance to a volcano..");
			System.out.println("You squeeze through the gap...");
			removeRoom(room);
			startRoom(room);

		}
		
		else if (rooms.size() == 2) {
			
			String room = getRoom(7);
			
			System.out.println("After defeating the room you move towards the volcano...");
			System.out.println("You pass the lava door...");
			removeRoom(room);
			startRoom(room);

		}
		
		else if (rooms.size() == 1) {
			
			String room = getRoom(8);
			
			System.out.println("After defeating the room hear fire burning..");
			System.out.println("The floor below you crumbles and you land on a very hot floor..");
			removeRoom(room);
			startRoom(room);

		}
		
		
	}
	
	public void startRoom(String roomName) {
		
		decreasePlayerEnergy(playerEnergy);
		
		System.out.println("========================");	
		
		if (rooms.size() > 3 ) {
		
		NPC npc = NPC.generateRandomNPC();
		
		System.out.println("You are now in the " + roomName);
		System.out.println("You are approached by a " +npc  );
		
		startCombat(npc.toString());
		
		
		}
		
		else if (rooms.size() == 3 ) { 
			
			NPC giant = NPC.Giant;
			System.out.println("You are approached by a " +giant);
			System.out.println("==============================");
			System.out.println(giant.getDesc());
			startCombat("Giant");
			
		}
	
		else if (rooms.size() == 2 ) {
		
			NPC demon = NPC.Demon;
			System.out.println("You are approached by a " +demon);
			System.out.println("==============================");
			System.out.println(demon.getDesc());
			startCombat("Demon");
		
		}

		else if (rooms.size() == 1 ) {
	
			NPC dragon = NPC.Dragon;
			System.out.println("You are approached by a " +dragon);
			System.out.println("==============================");
			System.out.println(dragon.getDesc());
			startCombat("Dragon");
			
			System.out.println("Congratulations you have escaped the dungeon");

			printScore();
			
			System.exit(0);
	
		}
		
		else {
			

	
		}

		
	}
	
}

	
	
