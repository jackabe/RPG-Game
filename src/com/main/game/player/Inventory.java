package com.main.game.player;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import com.main.game.item.Item;

public class Inventory extends Item implements Runnable, KeyListener {
	
	public static ArrayList<String> inventory = new ArrayList<>();

	
	public static void addtoInventory(String item) {
		
		Inventory.inventory.add(item);
		System.out.println(item + " has been added to your inventory");
		printInventory();
		
	}
	
	public static void removeFromInventory(String item) {
		
		Inventory.inventory.remove(item);
		
	}
	
	
	public static void printInventory() {
		    System.out.println("In your inventory you have: " + inventory);
	}
	
	public ArrayList<String> getInventory() {
		
		ArrayList<String> playerInventory = inventory;
		return playerInventory;
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		switch(e.getKeyCode()) {
		
		case KeyEvent.VK_SPACE:
			
			printInventory();
		
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	public int getScore() {
		
		int score = 0;
		int inventorySize = inventory.size();
		int diamondCount = 0;
		int emeraldCount = 0 ;
		
		if (inventory.contains("Diamond")) {

		    for (String Diamond : inventory) {
		    	
		        if (inventory.contains(Diamond)) {
		        	
		        	diamondCount++;
		        	
		        }

		     }
		 }
		    
		 if (inventory.contains("Emerald")) {
		    
		    for (String Emerald : inventory) {
		    	
		        if (inventory.contains(Emerald)) {
		        	
		        	emeraldCount++;
		        	
		        }
		        	
		    }
		 }
			

		return score + inventorySize + playerHealth + playerEnergy + diamondCount*50 + emeraldCount*20;
	
	}
	
	public void printScore() {
		
		System.out.println("================================");
		
		System.out.println("Your Final Score has been calculated from whats in your inventory and your health and energy level combined...");
		
		System.out.println("==============================");
		
		System.out.println("Diamonds and Emeralds increase your score too!!");
		
		System.out.println("==============================");
		
		System.out.println("Your Score is: " + getScore());
		
	}
	
	
}

