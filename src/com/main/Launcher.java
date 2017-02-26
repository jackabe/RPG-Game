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
		
        Player.printEnergyLevel();
        
        // Give player knife
        Item.addthis(9);
    	Inventory.printInventory();
    	
		System.out.println("================================");
		
		System.out.println("You find yourself next to a " + Room.getRoom(1));
		
		System.out.println("There are 2 rooms you can now go to. Would you like to go North into the Sewer or West into the GraveYard?");
        Scanner sc1 = new Scanner(System.in);
        String direction = sc1.nextLine();
        sc1.close();
        System.out.println("-------------------------------");
        
        // New instance of direction created
        
        gene
		

	}

}
