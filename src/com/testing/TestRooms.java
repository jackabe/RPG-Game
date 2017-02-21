package com.testing;

import java.util.Scanner;

import com.main.game.Welcome;
import com.main.game.npc.NPC;
import com.main.game.player.Player;
import com.main.game.room.Room;

public class TestRooms {

	
		public static void main(String[] args) {


			// Testing the rooms
			
//			System.out.println(Room.getRoom(1));
//			System.out.println(Room.getRoom(2));
//			System.out.println(Room.getRoom(3));
//			System.out.println(Room.getRoom(4));
//			System.out.println(Room.getRoom(5));
//			System.out.println(Room.getRoom(6));
//			System.out.println(Room.getRoom(7));
//			System.out.println(Room.getRoom(8));
			
			// Testing NPC's
			
//			System.out.println("================================");
//			
//			System.out.println(NPC.getNPC(1));
//			System.out.println(NPC.getNPC(2));
//			System.out.println(NPC.getNPC(3));
//			System.out.println(NPC.getNPC(4));
//			System.out.println(NPC.getNPC(5));
//			System.out.println(NPC.getNPC(6));
//			System.out.println(NPC.getNPC(7));
//			System.out.println(NPC.getNPC(8));
			
			// Testing Room with an NPC
			
			System.out.println("================================");
			
			System.out.println("You enter the " + Room.getRoom(1) + ", where there is a " + NPC.getNPC(1));
			
			System.out.println("================================");
			
			// Testing ability to move rooms
			
			System.out.println("There are 2 rooms you can now go to. Would you like to go North into the Sewer or West into the GraveYard?");
	        Scanner sc1 = new Scanner(System.in);
	        String direction = sc1.nextLine();
	        sc1.close();
	        System.out.println("-------------------------------");
	        
	        // New instance of direction created
	        
			Room Direction1 = new Room(direction);
			Direction1.setDirection(direction);
			String playerDirection = Direction1.getDirection(); 
			System.out.println("You have chosen to go: " + Direction1.getDirection());
			
			if (playerDirection == "North") {
				
				System.out.println("You enter the " + Room.getRoom(2) + ", where there is a " + NPC.getNPC(2));

				
				
			}
			
			else {
				
				System.out.println("You enter the " + Room.getRoom(3) + ", where there is a " + NPC.getNPC(3));
				
			}
			

		}

	}



