package com.main.game.player;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import com.main.game.item.Item;

public class Inventory implements Runnable, KeyListener {
	
	private ArrayList<String> inventory;
	String item;
	
	public Inventory() {
		this.inventory = new ArrayList<>();
	}
	
	public String getItem() {
		return item;
	}
	
	public void addtoInventory(String item) {
		inventory.add(item);
		System.out.println( "A " + item + " has been added to your inventory");
		
	}
	
	public void printInventory() {
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
	
	
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//    int count;
 
//     public Inventory() {
//       items = new Item[20];
//       count=0;
//    }
// 
//     public void add(Item item){
//       items [count] = item;
//       count++;
////       if(count==items.length);
////          increaseSize();
//    }
//
//		
//	
//	
//	
//}


