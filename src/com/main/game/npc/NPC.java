package com.main.game.npc;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.main.game.player.Combat;
import com.main.game.player.Player;

public class NPC {
	
	public static int npcHealth;
	public static int npcStrength;
	private static int npcHit;
	public static List<String> npcs = new ArrayList<String>();
	public static int MAX_NPC = 8;
	
	public static boolean addNPC(String npcId) {
		   if (npcs.size() < MAX_NPC) {
			   npcs.add(npcId);
		     return true;
		   } else {
		     return false;
		   }
		}

	
	public static boolean removeRoom(String npcId) {
		   if (npcs.size() > 1) {
			   npcs.remove(npcId);
		     return true;
		   } else {
		     return false;
		   }
		}
	
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
	
	public static void printNPCs() {
	    System.out.println(npcs);
	}
	
	public static int getNpcHealth() {
		
		return npcHealth;
		
	}
	
	public static int generateRandomNPC() {
		
		Random rand = new Random();
		int randomNPC = rand.nextInt(8) + 1;
		return randomNPC;
		
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
