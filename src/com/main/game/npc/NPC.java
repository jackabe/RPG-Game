package com.main.game.npc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum NPC {
	
	// Name, health and damage capability of each monster
	
	Rat("Rat", "It's just a small Rat", 1, 1, 10),
	Spider("Spider", "Quite big, for a Spider", 2, 3, 7),
	Skeleton("Skeleton", "This thing needs to eat...", 10, 5, 8),
	Zombie("Zombie", "The Walking Dead", 10, 5, 5),
	Ghost("Ghost", "A Trapped Soul..", 15, 6, 11),
	Giant("Giant", "This Giant is very big...", 40, 7, 12),
	Demon("Demon", "A Devil, it hits quite hard..", 80, 10, 13),
	Dragon("Dragon", "The King Dragon, The Hardest and most Terrifying of foes.. ", 110, 15, 1);
	
	private final String npcName;
	private final String desc;
	private int npcHealth;
	private final int damage;
	private final int drop;

//	http://stackoverflow.com/questions/16356232/unmodifiable-list-in-java
//	https://www.tutorialspoint.com/java/util/collections_unmodifiablelist.htm
	private static final List<NPC> npcs = Collections.unmodifiableList(Arrays.asList(values()));
	private static final int size = 5;
	private static final Random random = new Random();
	
	NPC(String npcName, String desc, int npcHealth, int damage, int drop) {
		
		this.desc = desc;
		this.npcHealth = npcHealth;
		this.damage = damage;
		this.npcName = npcName;
		this.drop = drop;
		
	}
	
	public String getDesc() {
		return desc;
	}
	
	public String getName() {
		return npcName;
	}
	
	public int getHealth() {
		return npcHealth;
	}
	
	public void setHealth(int npcHealth) {
		this.npcHealth = npcHealth;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public int getDrop() {
		return drop;
	}
	
	public static NPC generateRandomNPC() {
		
		return npcs.get((random.nextInt(size)));
		
	}
	
	public static int getHealth(String npcName) {
        try {
            for (NPC npc : NPC.values()) {
                if (npc.npcName.equals(npcName)) {
                    return npc.getHealth();
                }
            }
            throw new IllegalArgumentException("Error at Npc");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an error..." + e.getMessage());
        }
        return 0;
    }

	
	public static int getDrop(String npcName) {
        for (NPC npc : NPC.values()) {
            if (npc.npcName.equals(npcName)) {
                return npc.getDrop();
            }
        }
        throw new IllegalArgumentException();
	}
	
	public static int getHit(String npcName) {
        for (NPC npc : NPC.values()) {
            if (npc.npcName.equals(npcName)) {
                return npc.getDamage();
            }
        }
        throw new IllegalArgumentException();
	}
	

}

