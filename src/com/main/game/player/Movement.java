package com.main.game.player;

import com.main.game.npc.NPC;
import com.main.game.room.Room;

public class Movement {
	
    String playersDirection;
	
	public void getDirection() {
		
		// As regards to whether they choose north, south, east or west, a random room and npc is generated.
		
		if (playersDirection.toLowerCase().equals("north")) {
			
			Room.generateRandomRoom();
			NPC.generateRandomNPC();
				
		}
		
		else if (playersDirection.toLowerCase().equals("west")) {
			
			Room.generateRandomRoom();
			NPC.generateRandomNPC();
				
		}
		
		else if (playersDirection.toLowerCase().equals("east")) {
			
			Room.generateRandomRoom();
			NPC.generateRandomNPC();
				
		}
		
		else if (playersDirection.toLowerCase().equals("south")) {
			
			Room.generateRandomRoom();
			NPC.generateRandomNPC();
				
		}
		
		
		
		
		
		
		
		
	}

}
