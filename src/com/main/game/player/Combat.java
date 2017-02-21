package com.main.game.player;
import com.main.game.npc.NPC;

/**
 * Created by c1673107 on 21/02/2017.
 */
public class Combat {

    public static int iscombat;
    private static int npcId;

    private Combat(int iscombat, int npcId) {

        this.iscombat = iscombat;
        this.npcId = npcId;

    }

    public int getIscombat() {
        return iscombat;
    }

    public static void setIscombat(int iscombat) {
        this.iscombat = iscombat;
    }

    public static void attackNPC() {

        if (iscombat == 1) {

            System.out.println("You attack: " + NPC.getNPC(npcId));

        }





    }

}
