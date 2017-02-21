package com.main.game.player;
import com.main.game.npc.NPC;

/**
 * Created by c1673107 on 21/02/2017.
 */
public class Combat {

    public String isCombat;
    public int npcId;

    public Combat(String isCombat) {

        this.isCombat = isCombat;

    }

    public String getIsCombat() {
        return isCombat;
    }

    public void setIsCombat(String isCombat) {
        this.isCombat = isCombat;
    }

    public void attackNPC() {

        if (isCombat.equals("Yes")) {

            System.out.println("You attack: " + NPC.getNPC(npcId));

        }





    }

}
