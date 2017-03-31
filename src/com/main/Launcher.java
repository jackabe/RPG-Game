package com.main;
import com.main.game.room.Room;
import com.main.game.Welcome;
import com.main.game.item.Item;
import com.main.game.player.Inventory;
import com.main.game.player.Player;

import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {


		System.out.println(Welcome.getWelcome());

		System.out.println("================================");
		
		System.out.println("What would you like your player name to be?");
        @SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
        String playername = sc1.nextLine();
        
        while (true) { 
        	
        	if (playername.length() >= 1) {
        		
        		playername = Capitalize.setStringCase(playername);
                System.out.println("Good luck, " +playername);
                System.out.println("================================");
   
        	}
        	
        	else {
        		
        		while (playername.length() < 1) {
        			
            		System.out.println("Invalid Player Name. Please ensure your name is greater than 1 character/digit.");
            		playername = sc1.nextLine();
            		
                	if (playername.length() >= 1) {
                		
                		playername = Capitalize.setStringCase(playername);
                        System.out.println("Good luck, " +playername);
                        System.out.println("================================");
                        break;
           
                	}
        			
        		}
        		          
        	}
        	break;
        	
        }
        	
        	
        	
		Player newPlayer = new Player();
		newPlayer.setPlayerName(playername);

		newPlayer.printEnergyLevel();
		newPlayer.printHealthLevel();
		
		System.out.println("================================");

        // Give player knife
		
		Item item = new Item();
		
		Inventory.addtoInventory(item.getItem(9));

		System.out.println("================================");
		
		// Rooms generated

		Room newRoom = new Room(); 

		newRoom.addRoom(newRoom.getRoom(1));
		newRoom.addRoom(newRoom.getRoom(2));
		newRoom.addRoom(newRoom.getRoom(3));
		newRoom.addRoom(newRoom.getRoom(4));
		newRoom.addRoom(newRoom.getRoom(5));
		newRoom.addRoom(newRoom.getRoom(6));
		newRoom.addRoom(newRoom.getRoom(7));
		newRoom.addRoom(newRoom.getRoom(8));
		
		newRoom.startingRoom();
		newRoom.giveOptions();
		
		System.out.println("========================");	
		
		newRoom.giveOptions();
		
		System.out.println("========================");	
		
		newRoom.giveOptions();

		System.out.println("========================");	
		
		newRoom.giveOptions();
		
		System.out.println("========================");	
		
		
		newRoom.giveOptions();
		
		System.out.println("========================");	

		
		newRoom.giveOptions();
		
		System.out.println("========================");	

		
		newRoom.giveOptions();
		
		System.out.println("========================");	

	}

}

