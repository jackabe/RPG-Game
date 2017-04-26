package com.main.game.player;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.main.game.npc.NPC;
import com.main.Capitalize;
import com.main.game.room.Room;

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
    private int randomItem = getRandomItem();
    // Instance singelton idea - http://stackoverflow.com/questions/43393196/java-arraylist-is-returning-empty?noredirect=1#comment73848343_43393196
    private ArrayList<String> playerInventory = getInstance().getInventory();
    private Inventory inventory = Inventory.getInstance();

    public Combat() {

    }

    @Override public void setPlayerHit() {
        if (playerInventory.contains("Knife") && !playerInventory.contains("Iron Sword") && !playerInventory.contains("Diamond Sword")) {
            setItemDamage(9);
            this.playerHit = getItemDamage();
            System.out.println("Due to the Knife in your Inventory, Your player strength is: " + getItemDamage());
        }

        else if (playerInventory.contains("Iron Sword") && playerInventory.contains("Knife") && !playerInventory.contains("Diamond Sword")) {
            setItemDamage(12);
            this.playerHit = getItemDamage();
            System.out.println("Due to the Iron Sword in your Inventory, Your player strength is: " + getItemDamage());
        }

        else if (playerInventory.contains("Diamond Sword") && playerInventory.contains("Iron Sword") && playerInventory.contains("Knife")) {
            setItemDamage(13);
            this.playerHit = getItemDamage();
            System.out.println("Due to the Diamond Sword in your Inventory, Your player strength is: " + getItemDamage());
        }

        else {
            this.playerHit = 9;
        }
    }

    @Override
    public int getPlayerHit() {
        return playerHit;
    }


    @Override
    public void setNpcHit(String npcName) {
        this.npcHit = NPC.getHit(npcName);
    }


    @Override
    public int getNpcHit() {
        return npcHit;
    }


    @Override
    public void setNpcHealth(String npcName) {
        this.npcHealth = NPC.getHealth(npcName);
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
        this.drop = NPC.getDrop(npcName);
    }

    public void inventoryChoice() {
        System.out.println("Which food would you like to eat?");
        printInventory();

        String input = in.nextLine();

        input = Capitalize.setStringCase(input);
        System.out.println(input);

        if (input.contains("Energy Potion")) {
            if (playerEnergy < 0) {
                throw new IllegalArgumentException();
            } else if (playerEnergy >= 85) {
                setPlayerEnergy(100);
            } else if (playerEnergy > 0 && playerEnergy < 85) {
                increasePlayerEnergy(playerEnergy);
            }

        } else if (playerHealth < 0) {
            throw new IllegalArgumentException();
        } else if (playerHealth >= 90 && !input.contains("Rotten meat") && playerInventory.contains(input)) {
            this.playerHealth = 100;
            System.out.println("You eat the food...");
            inventory.removeFromInventory(input);
        } else {
            if (input.contains("Rotten meat") && playerInventory.contains(input)) {
                this.playerHealth -= 10;
                System.out.println("You eat rotten meat, you are poisoned and lose 10 health");
                inventory.removeFromInventory(input);

            } else if (!input.contains("Rotten meat") && playerInventory.contains(input)) {
                this.playerHealth += 20;
                System.out.println("You eat the food...");
                inventory.removeFromInventory(input);
            } else {
                System.out.println("You choose not to eat");
            }
        }
    }

    @Override
    public void startCombat(String npcName) {
        System.out.println("You begin to fight the " + npcName);

        setNpcHealth(npcName);
        setNpcHit(npcName);
        setPlayerHit();

        while (npcHealth > 0) {
            System.out.println("\t Your Health: " + playerHealth);
            System.out.println("\t Your Energy: " + playerEnergy);
            System.out.println("\t " + npcName + " Health: " + npcHealth);
            System.out.println("What would you like to do now?");
            System.out.println("\t1. Attack");
            System.out.println("\t2. Run Away");
            System.out.println("\t3. Access Inventory - Eat Food / Consume Health Potion");

            String input = in.nextLine();

            if (input.equals("1")) {
                int randomDamage = rand.nextInt(playerHit);
                int randomNPCDamage = rand.nextInt(npcHit);

                playerHealth = playerHealth - randomNPCDamage;
                npcHealth -= randomDamage;

                System.out.println("\t> You hit the " + npcName + " and " + randomDamage + " is dealt");
                System.out.println("\t> The Enemy hit " + randomNPCDamage);
                System.out.println("========================");

                if (playerHealth < 1) {
                    System.out.println("You have died...");
                    break;
                } else if (playerEnergy < 1) {
                    System.out.println("You have run out of energy and are consumed by the darkness...");
                    break;
                } else if (playerEnergy == 1 || playerHealth == 1) {
                    System.out.println("Quick eat food or you will die!!!!!");
                    break;
                }
            } else if (input.equals("2")) {
                System.out.println("You have decided to run");
                System.out.println("Your game is over...");
                printScore();
                System.exit(0);
            } else if (input.equals("3")) {
                inventoryChoice();
                continue;
            } else {
                System.out.println("Invalid command");
            }

            if (playerHealth > 1 && npcHealth < 1) {
                System.out.println("You leave the dungeon");
                System.out.println(" ```` " + npcName + " was defeated! ```` ");
                System.out.println("Your Health level is " + playerHealth);
                setDrop(npcName);
                getInstance().addToInventory(getItem(getDrop()));

                if (randomItem != 0) {
                    System.out.println("\t !!!!!!!! You are lucky and find a random item in the room !!!!!!!!");
                    getInstance().addToInventory(getItem(randomItem));
                } else {
                    getItem(0);
                }
            }
        }
    }
}










