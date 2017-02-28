package com.main.game.player;

import java.util.ArrayList;

public interface Attackable {
	
	boolean isCombat = true;
    int npcId = 1;
    int playerHit = 1;
    ArrayList<String> playerInventory = new ArrayList<>();
	
	String getIsCombat(boolean isCombat);

	void setIsCombat(boolean isCombat);

	void getPlayerStrength(int itemId);
}
