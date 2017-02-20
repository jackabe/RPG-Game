package com.main.game.player;
import java.util.ArrayList;
import com.main.game.item.Item;

public class Inventory {
	
	public static ArrayList<String> inventory = new ArrayList<String>();
	String item;
	
	public Inventory(String item) {
		this.item = item;
	}
	
	public String getItem() {
		return item;
	}
	
	public void setItem(String item) {
		this.item = item;
	}
	
	public static void addtoInventory(String item) {
		inventory.add(item);
		
	}
	
	public static void printInventory() {
		    System.out.println("In your inventory you now have: " + inventory);
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


