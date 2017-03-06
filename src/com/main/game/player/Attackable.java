package com.main.game.player;

import java.util.ArrayList;

public interface Attackable {
	
	String isCombat = "yes";
    int npcId = 1;
    int playerHit = 1;
    ArrayList<String> playerInventory = new ArrayList<String>();
	
	String getIsCombat();
	
	void setIsCombat(String isCombat);

	void attackNPC(int npcId, int roomNumber);
	
	void getPlayerStrength(int itemId);
}
