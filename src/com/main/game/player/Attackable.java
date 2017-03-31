package com.main.game.player;

public interface Attackable {
	
    void setPlayerHit();
    
    int getPlayerHit();
    
    int getPlayerHealth();
    
    void setPlayerHealth(int playerHealth);
    
    int getNpcHit();
    
    int getNpcHealth();
   
    void setNpcHit(String npcName);
   
    void setNpcHealth(String npcName);
    
    void startCombat(String npcName);

    int getDrop();
    
    void setDrop(String npcName);
}
