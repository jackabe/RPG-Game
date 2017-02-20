package com.main.game.item;

public class Item {
	
	
	public Item(String response, int itemId) {

		String itemName;
	    switch (itemId) {
	        case 1:  itemName = "Knife";
	                 break;
	        case 2:  itemName = "Rat Meat";
	                 break;
	        case 3:  itemName = "Boar Meat";
	                 break;
	        case 4:  itemName = "Chicken Meat";
	                 break;
	        case 5:  itemName = "Trout Meat";
	                 break;
	        case 6:  itemName = "Iron Sword";
	                 break;
	        case 7:  itemName = "Boots of Lightness";
	                 break;
	        case 8:  itemName = "Diamond Sword";
	                 break;

	        default: itemName = "Invalid item";
	                 break;
	    }
	    
		if (response == "yes") {
			
			System.out.println("The current item is : " + itemName + " and its damage is: ");

		}
		
        else {
        	System.out.println("You have chosen not to examine the item");

        }
	}
		
	}



