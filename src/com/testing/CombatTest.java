package com.testing;
import com.main.game.player.Combat;

import java.util.Scanner;

/**
 * Created by c1673107 on 21/02/2017.
 */
public class CombatTest {

    public static void main(String[] args) {

        System.out.println("Would you like to attack the NPC?");

        Scanner sc1 = new Scanner(System.in);
        String attack1 = sc1.nextLine();
        sc1.close();
        System.out.println("-------------------------------");

        Combat newattack = new Combat(attack1);
        newattack.attackNPC();



    }
}
