package com.main.game.item;
import com.main.game.player.Player;

import java.util.Random;

public class Item extends Player {
	
	private int itemDamage;
	public String[] foods = {"Healing Potion", "Chicken Meat", "Rotten Meat", "Apple", "Rat Meat", "Grapes"};


	public String getItem(int itemId) {

	    switch (itemId) {
	    
	    	case 0: return "There is no random item in here, bad luck!";
	    
	        case 1:  return "Diamond";
	        
	        case 2:  return "Healing Potion";
	         
	        case 3:  return "Emerald";
	         
	        case 4:  return "Chicken Meat";
	          
	        case 5:  return "Rotten meat";
	           
	        case 6:  return "Gold";
	         
	        case 7:  return "Apple";
	       
	        case 8:  return "Energy Potion";   
	        
	        case 9:  return "Knife";
	        
	        case 10:  return "Rat Meat";
	         
	        case 11:  return "Grapes";
	         
	        case 12:  return "Iron Sword";
	          
	        case 13:  return "Diamond Sword";
	           
	        case 14:  return "Boots of Lightness"; 
	        
	        case 15:  return "Bones"; 

		}
	    
		return "";
	    

	}
	
	public int setItem(int itemId) {
		return itemId;
		
	}
	
	
	public void setItemDamage(int itemId) {
		
	    switch (itemId) {
	    
    	case 9: this.itemDamage = 15;
    			break;
             
        case 12: this.itemDamage = 20;
        		break;
          
        case 13: this.itemDamage = 27;
        		break;
          
	}

	}
	
	public int getItemDamage() {
		
		return itemDamage;
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



