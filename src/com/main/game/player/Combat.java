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
public class Combat implements Attackable {

    public String isCombat;
    public int npcId;
    public int playerHit;
    public ArrayList<String> playerInventory;

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
        	
        	Room prevroom = new Room();
        	System.out.println("You choose not to attack and go back to the room: " + prevroom.getRoom(roomNumber));
        	
        }
        
    }
    
    @SuppressWarnings("rawtypes")
	public void getPlayerStrength(int itemId) {
    	
    	playerInventory = Inventory.getInventory(); 
    	List playerInventoryList = Arrays.asList(playerInventory);
    	
    	String item = Item.getItem(itemId);
    
    	if (playerInventoryList.toString().matches("\\[.*\\b" + item + "\\b.*]")) {
	
    		System.out.println("Due to the " + Item.getItem(itemId) + " in your Inventory, Your player strength is: " + Item.setItemDamage(itemId));
    	}
    		
  	  
    }
    
    public Combat(String isCombat) {

        this.isCombat = isCombat;

    }
    
    public Combat(int npcId) {

        this.npcId = npcId;

    }


}
