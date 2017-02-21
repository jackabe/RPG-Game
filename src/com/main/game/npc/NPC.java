package com.main.game.npc;
import com.main.game.player.Combat;
import com.main.game.player.Player;

public class NPC {
	
	public static int npcHealth;
	public static int npcStrength;
	private static int npcHit;


	public static String getNPC(int npcId) {

		switch (npcId) {
		
			case 1: return "Rat";
								
			case 2: return "Spider";
			
			case 3: return "Skeleton";
			
			case 4: return "Zombie";
			
			case 5: return "Ghost"; 
			
			case 6: return "Demon";
			
			case 7: return "Lesser Dragon";
			
			case 8: return "King Dragon";
			
		}
		return "";
			
	}
	
	public static int getNpcHealth() {
		
		return npcHealth;
		
	}
//	
//	
//	public static int getNpcHit() {
//		
//		return npcHit;
//		
//		
//		
//	}
//	


}
