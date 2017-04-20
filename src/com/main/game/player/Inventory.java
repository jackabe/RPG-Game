package com.main.game.player;
import java.util.ArrayList;
import com.main.game.item.Item;

public class Inventory extends Item {
	
	private ArrayList<String> inventory;
    private static Inventory instance = new Inventory();

//    Instance singelton idea - http://stackoverflow.com/questions/43393196/java-arraylist-is-returning-empty?noredirect=1#comment73848343_43393196

	public Inventory() {
		this.inventory = new ArrayList<>();
	}

    public static Inventory getInstance() {
        return instance;
    }


    public void addToInventory(String item) {
		inventory.add(item);
		System.out.println("A " + item + " has been added to your inventory");
		printInventory();
	}
	
	public void removeFromInventory(String item) {
		inventory.remove(item);
	}
	
	
	public void printInventory() {
		    System.out.println("In your inventory you have: " + instance.getInventory());
	}

	public ArrayList<String> getInventory() {
		return inventory;
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

