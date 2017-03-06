package com.main.game.npc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum NPC {
	
	// Name, health and damage capability of each monster
	
	Rat("It's just a small Rat", 1, 1),
	Spider("Quite big, for a Spider", 2, 2),
	Skeleton("This thing needs to eat...", 10, 3),
	Zombie("The Walking Dead", 10, 4),
	Ghost("A Trapped Soul..", 15, 5),
	Demon("A Devil, hits quite hard..", 40, 7),
	Giant("This Giant is tough...", 80, 8),
	Dragon("The King Dragon, Food and Anti-Fire Shield strongly recommened ", 150, 10);
	
	private final String desc;
	private final int health;
	private final int damage;
	
	private static final List<NPC> npcs = Collections.unmodifiableList(Arrays.asList(values()));
	private static final int size = 5;
	private static final Random RANDOM = new Random();
	
	NPC(String desc, int health, int damage) {
		
		this.desc = desc;
		this.health = health;
		this.damage = damage;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public static NPC generateRandomNPC() {
		
		return npcs.get((RANDOM.nextInt(size)));
		
	}
	
}

