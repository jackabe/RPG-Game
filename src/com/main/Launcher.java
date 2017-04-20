package com.main;
import com.main.game.room.Room;
import com.main.game.Welcome;
import com.main.game.item.Item;
import com.main.game.player.Inventory;
import com.main.game.player.Player;

import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {

        Welcome welcome;
	    welcome = new Welcome();
        Player newPlayer;
        newPlayer = new Player();
        Item item;
        item = new Item();
        Inventory playerInventory;
        Room newRoom = new Room();

        System.out.println(welcome.getWelcome());

		System.out.println("================================");
		
		System.out.println("What would you like your player name to be?");
		Scanner sc1 = new Scanner(System.in);
        String playerName = sc1.nextLine();
        
        while (true) { 
        	
        	if (playerName.length() >= 1) {
                playerName = Capitalize.setStringCase(playerName);
                System.out.println("Good luck, " +playerName);
                System.out.println("================================");
        	}
        	
        	else {
        		while (playerName.length() < 1) {
            		System.out.println("Invalid Player Name. Please ensure your name is greater than 1 character/digit.");
                    playerName = sc1.nextLine();
            		
                	if (playerName.length() >= 1) {
                        playerName = Capitalize.setStringCase(playerName);
                        System.out.println("Good luck, " +playerName);
                        System.out.println("================================");
                        break;
                	}
        		}
        	}
        	break;
        }

		newPlayer.setPlayerName(playerName);
		newPlayer.printEnergyLevel();
		newPlayer.printHealthLevel();
		
		System.out.println("================================");
        // Give player knife
		Inventory.getInstance().addToInventory(item.getItem(9));

		System.out.println("================================");
		// Rooms generated

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

