package com.testing;

import com.main.game.npc.NPC;

public class NPCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(NPC monsters: NPC.values()) {
			System.out.printf("%s\t%s\t%s\t%s\n", monsters, monsters.getDesc(), monsters.getHealth(), monsters.getDamage());
		}
		
	
		for(NPC monsters: NPC.values()) {
			System.out.println(monsters.getDesc());
		}
			
		System.out.println(NPC.generateRandomNPC());
		
		NPC rat = NPC.Rat;
		System.out.println(rat);
		
		System.out.println(NPC.fromIdHealth("Dragon"));
		System.out.println(NPC.fromIdHit("Dragon"));
	}

}
