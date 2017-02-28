//package com.testing;
//import com.main.game.item.Item;
//import com.main.game.npc.NPC;
//
//import java.io.*;
//import com.main.game.player.Combat;
//import com.main.game.player.Inventory;
//import com.main.game.player.Player;
//
//import java.util.Scanner;
//
///**
// * Created by c1673107 on 21/02/2017.
// */
//
//public class CombatTest {
//
//    public static void main(String[] args) {
//
//    	// Testing the ability to decide to attack an NPC and for combat to initiate
//
//        // Add some items to the inventory
//
//        Item.addthis(1);
//        Item.addthis(9);
//        Item.addthis(12);
//        Item.addthis(13);
//
//        // Print Energy Level and Current Inventory
//
//        Player.printEnergyLevel();
//    	Inventory.printInventory();
//
//    	System.out.println("-------------------------------");
//
//    	// Scanner for users attack
//
//        System.out.println("Would you like to attack?");
//
//        Scanner sc1 = new Scanner(System.in);
//
//        String attack1 = sc1.nextLine();
//
//        // String converted to lower case
//        attack1 = attack1.toLowerCase();
//
//        sc1.close();
//
//        System.out.println("-------------------------------");
//
//        // Attacks NPC id 1, and also puts in escape room ID 1.
//
//        Combat newattack = new Combat(attack1);
//        newattack.attackNPC(1,1);
//        newattack.getPlayerStrength(13);
//
//		// Method that generates player damage according to items in inventory
//
//
//        System.out.println("The " + NPC.getNPC(1) + " has health of: " + NPC.getNpcHealth());
//
//
//
//    }
//}
