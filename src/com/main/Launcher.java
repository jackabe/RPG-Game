package com.main;
import com.main.game.room.Room;

import java.util.Scanner;

import com.main.game.Welcome;
import com.main.game.item.Item;
import com.main.game.player.Inventory;
import com.main.game.player.Player;
import com.main.game.room.Room;

public class Launcher {

	public static void main(String[] args) {


		System.out.println(Welcome.getWelcome());

		System.out.println("================================");
		
		System.out.println("What would you like your player name to be?");
        Scanner sc1 = new Scanner(System.in);
        String playername = sc1.nextLine();
        
        System.out.println("Good luck, " +playername);
        System.out.println("================================");
		
		Player newPlayer = new Player(playername);

		newPlayer.printEnergyLevel();
		newPlayer.printHealthLevel();
		
		System.out.println("================================");

        // Give player knife
		Inventory inventory = new Inventory();
		Item item = new Item();
		inventory.addtoInventory(item.getItem(9));
    	inventory.printInventory();

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
		
		newRoom.generateRoom();
		newRoom.givePlayerOptions();
		
		System.out.println("========================");	
		
		newRoom.generateRoom();
		newRoom.givePlayerOptions();
		
		System.out.println("========================");	
		
		newRoom.generateRoom();
		newRoom.givePlayerOptions();
		
		System.out.println("========================");	
		
		newRoom.generateRoom();
		newRoom.givePlayerOptions();

		
		
		







	}

}
