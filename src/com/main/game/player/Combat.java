package com.main.game.player;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.main.game.item.Item;
import com.main.game.npc.NPC;
import com.main.game.room.Room;
import com.main.game.player.Inventory;

/**
 * Created by c1673107 on 21/02/2017.
 */
public class Combat {

    public String isCombat;
    public int npcId;
    public static int playerHit;
    public static ArrayList<String> playerInventory;

    public Combat(String isCombat) {

        this.isCombat = isCombat;

    }
    
    public Combat(int npcId) {

        this.npcId = npcId;

    }

    public String getIsCombat() {
        return isCombat;
    }

    public void setIsCombat(String isCombat) {
        this.isCombat = isCombat;
    }

    public void attackNPC(int npcId, int roomNumber) {

        if (isCombat.equals("yes")) {
        	
            System.out.println("You have chosen to attack the " + NPC.getNPC(npcId));

        }
        
        else {
        	
        	System.out.println("You choose not to attack and go back to the room: " + Room.getRoom(roomNumber));
        	
        }
        
    }
    
    @SuppressWarnings("rawtypes")
	public static void getPlayerStrength(int itemId) {
    	
    	playerInventory = Inventory.getInventory(); 
    	List playerInventoryList = Arrays.asList(playerInventory);
    	
    	String item = Item.getItem(itemId);
    
    	if (playerInventoryList.toString().matches("\\[.*\\b" + item + "\\b.*]")) {
	
    		System.out.println("Due to the " + Item.getItem(itemId) + " in your Inventory, Your player strength is: " + Item.setItemDamage(itemId));
    	}
    		
  	  
    }

}
