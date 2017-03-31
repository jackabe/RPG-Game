package com.main.game.player;

import java.util.Random;
import java.util.Scanner;

import com.main.game.npc.NPC;
import com.main.game.player.Inventory;
import com.main.Capitalize;

/**
 * Created by c1673107 on 21/02/2017.
 */

public class Combat extends Inventory implements Attackable {

    Scanner in = new Scanner(System.in);
    Random rand = new Random();
    
    private int npcHit;
    private int playerHit;
    private int npcHealth;
    private int drop;
	private int randomitem = getRandomItem();
	
    public Combat(){

    }
    
	@Override 
	public void setPlayerHit() {
		
    	if (inventory.contains("Knife") && !inventory.contains("Iron Sword") && !inventory.contains("Diamond Sword")) {
    			
    		setItemDamage(9);
        	this.playerHit = getItemDamage();
     
    		System.out.println("Due to the Knife in your Inventory, Your player strength is: " + getItemDamage());
		
    	}
    	
    	else if (inventory.contains("Iron Sword") && inventory.contains("Knife") && !inventory.contains("Diamond Sword")) {
			
    		setItemDamage(12);
        	this.playerHit = getItemDamage();
     
    		System.out.println("Due to the Iron Sword in your Inventory, Your player strength is: " + getItemDamage());
		
    	}
    	
    	else if (inventory.contains("Diamond Sword") && inventory.contains("Iron Sword") && inventory.contains("Knife"))  {
			
    		setItemDamage(13);
        	this.playerHit = getItemDamage();
     
    		System.out.println("Due to the Diamond Sword in your Inventory, Your player strength is: " + getItemDamage());
		
    	}
    	
    	else {
    		
    		this.playerHit = 1;
    		addtoInventory("Knife");
    		
    	}
    	
	}
   

	@Override
	public int getPlayerHit() {
    	
    	return playerHit;
    	
    }
    	
	
	@Override
	public void setNpcHit(String npcName) {

		this.npcHit = NPC.fromIdHit(npcName);
		
	}
	

	@Override
	public int getNpcHit() {

		return npcHit;

	}

	
	@Override
	public void setNpcHealth(String npcName) {
		
		this.npcHealth = NPC.fromIdHealth(npcName);
		
	}

	
	@Override
	public int getNpcHealth() {

		return npcHealth;
		
	}

	
	@Override
	public void setPlayerHealth(int playerHealth) {
		
		this.playerHealth = playerHealth;

	}

	
	@Override
	public int getPlayerHealth() {

		return playerHealth;
		
	}
	
	@Override
	public int getDrop() {

		return drop;
		
	}
	
	@Override
	public void setDrop(String npcName) {

		this.drop = NPC.fromIdDrop(npcName);
		
	}
	
	public void eatFood() {
		
		System.out.println("Which food would you like to eat?");
		printInventory();
		
		String input = in.nextLine();
		
		input = Capitalize.setStringCase(input);
		System.out.println(input);
		
		if (input.contains("Energy Potion")) {
			
			 if (playerEnergy < 0) {
					
			        throw new IllegalArgumentException();
			     
				}
				
				else if (playerEnergy >= 85) {
					
					setPlayerEnergy(100);
			     
				}
				
				
				else if (playerEnergy > 0 && playerEnergy < 85) {
					
					increasePlayerEnergy(playerEnergy);
			     
				}
				
		}

		
		else if (playerHealth < 0) {
			
	        throw new IllegalArgumentException();
	     
		}
		
		else if (playerHealth >= 90 && !input.contains("Rotten meat") && inventory.contains(input)) {
			
	        this.playerHealth = 100;
	        System.out.println("You eat the food...");
	        Inventory.removeFromInventory(input);
	     
		}
		
		else {
			
			if (input.contains("Rotten meat") && inventory.contains(input)) {
			
				this.playerHealth -= 10;
				System.out.println("You eat rotten meat, you are poisoned and lose 10 health");
				Inventory.removeFromInventory(input);
				
			}
				
			else if (!input.contains("Rotten meat") && inventory.contains(input)) {  
					
				this.playerHealth += 20;
				System.out.println("You eat the food...");
				Inventory.removeFromInventory(input);
					
			}
			
			else{
	
				System.out.println("You choose not to eat");

			}

		    
		}

					
	}
		
	@Override
	public void startCombat(String npcName) {

		System.out.println("You begin to fight the " +npcName);
		
		setNpcHealth(npcName);
		setNpcHit(npcName);
		setPlayerHit();
		
		while (npcHealth > 0) {
			
			System.out.println("\t Your Health: " + playerHealth);
			System.out.println("\t Your Energy: " + playerEnergy);
			System.out.println("\t " + npcName + " Health: " + npcHealth);
			System.out.println("What action would you like to carry out?");
			System.out.println("\t1. Attack");
			System.out.println("\t2. Run!");
			System.out.println("\t3. Eat Food / Consume Health Potion");
			
			String input = in.nextLine();
			
			if (input.equals("1")) {
				
				int	randomDamage = rand.nextInt(playerHit);
				int	randomNPCDamage = rand.nextInt(npcHit);
				
				playerHealth -= randomNPCDamage;
				npcHealth -= randomDamage;
				
				System.out.println("\t> You strike the " +npcName + " and " + randomDamage + " is dealt");
				System.out.println("\t> The Enemy dealt " + randomNPCDamage);
				System.out.println("========================");	
				
				if (playerHealth < 1 ) {
					
					System.out.println("You have died...");
					break;
					
				}
				
				else if (playerEnergy < 1 ) {
					
					System.out.println("You have run out of energy and are consumed by the darkness...");
					break;
					
				}
				
				else if (playerEnergy == 1 || playerHealth == 1 ) {
					
					System.out.println("Quick eat food or you will die!!!!!");
					break;
					
				}
			}
			
			
			else if (input.equals("2")) {
				
				System.out.println("You have decided to run");
				System.out.println("Your game is over...");
				printScore();
				System.exit(0);
				
			}	
			
			else if (input.equals("3")) {
				
				eatFood();
				continue;
				
			}	
							
			else {
				
			System.out.println("Invalid command");
				
			}
			
		
		if (playerHealth > 1 && npcHealth < 1) {
				
			System.out.println("You leave the dungeon");	
			System.out.println(" # " + npcName + " was defeated! # ");
			System.out.println("Your Health level is " +playerHealth);
			
			setDrop(npcName);
			
			addtoInventory(getItem(getDrop()));

			if (randomitem != 0) {
				
				System.out.println("You are lucky and find a random item in the room!");
				addtoInventory(getItem(randomitem));
				
			}
			
			else {
				
				getItem(0);
				
			}


		}
		

		
		}
		

		

			
		}



	}








