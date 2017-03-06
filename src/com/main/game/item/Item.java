package com.main.game.item;

import java.util.Random;

import com.main.game.player.Inventory;
import com.main.game.player.Player;

public class Item {
	
	private int itemId;
	private int itemDamage;

	public Item() {

	    this.itemId = itemId;
        this.itemDamage = itemDamage;

    }

	public String getItem(int itemId) {

	    switch (itemId) {
	    
	    	case 0: return "There is no random item in here, bad luck!";
	    
	        case 1:  return "Diamond";
	        
	        case 2:  return "Healing Potion";
	         
	        case 3:  return "Boar Meat";
	         
	        case 4:  return "Chicken Meat";
	          
	        case 5:  return "Trout Meat";
	           
	        case 6:  return "Gold";
	         
	        case 7:  return "Apple";
	       
	        case 8:  return "Energy Potion";   
	        
	        case 9:  return "Knife";
	        
	        case 10:  return "Rat Meat";
	         
	        case 11:  return "Pork Meat ";
	         
	        case 12:  return "Iron Sword";
	          
	        case 13:  return "Diamond Sword";
	           
	        case 14:  return "Boots of Lightness"; 

		}
	    
		return "";
	    

	}
	
	public int setItem(int itemId) {
		return itemId;
		
	}
	
	
	public int setItemDamage(int itemId) {
		
	    switch (itemId) {
	    
    	case 1: return 2;
             
        case 12:  return 5;
          
        case 13:  return 10;
          
	}
	return 0;
	

	}

	public int getRandomItem() {
		
		double d = Math.random();
		
		if (d < 0.4) {
	
			Random rand = new Random();
			int randomItem = rand.nextInt(8) + 1;
			return randomItem;
			
		}
		
		else {
			
			return 0;
			
		}
		
	}
	
//    public void addThis(int itemId) {
//
//        Item newitem = new Item();
//    	int item = newitem.setItem(itemId);
//    	
//		Inventory newItem = new Inventory (newitem.getItem(item));
//		newItem.setItem(newitem.getItem(item));
//		Inventory.addtoInventory(newItem.getItem());
//        Inventory.printInventory();
//    		
//    }
//	

}



