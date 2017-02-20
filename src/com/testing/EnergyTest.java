package com.testing;

import java.util.Scanner;

import com.main.game.npc.NPC;
import com.main.game.player.Player;
import com.main.game.room.Room;

public class EnergyTest {

	
		public static void main(String[] args) {
			
			
			Player.setPlayerEnergy(100);
			
			System.out.println(Player.getPlayerEnergy());
			
	        Scanner sc1 = new Scanner(System.in);
	        String direction = sc1.nextLine();
	        sc1.close();
	        System.out.println("-------------------------------");
	        
	        // New instance of direction created
			
			Room Direction1 = new Room(direction);
			Direction1.setDirection(direction);
			String playerDirection = Direction1.getDirection(); 
			System.out.println("You have chosen to go: " + Direction1.getDirection());
			
			if (playerDirection.equals("North")) {
				
				System.out.println("You enter the " + Room.getRoom(2) + ", where there is a " + NPC.getNPC(2));
				Player.decreasePlayerEnergy(Player.getPlayerEnergy());
		
				System.out.println("You use some energy overcoming an obstacle. Your energy level is now " + Player.getPlayerEnergy());
				
				
			}
			
			else {
				
				System.out.println("You enter the " + Room.getRoom(3) + ", where there is a " + NPC.getNPC(3));
				Player.decreasePlayerEnergy(Player.getPlayerEnergy());		
				System.out.println("You use some energy overcoming an obstacle. Your energy level is now " + Player.getPlayerEnergy());
				
			}
			

		}

	}



