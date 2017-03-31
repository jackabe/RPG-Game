package com.testing;

import java.util.Scanner;

import com.main.game.Welcome;
import com.main.game.npc.NPC;
import com.main.game.player.Player;
import com.main.game.room.Room;

public class TestRooms {

	
		public static void main(String[] args) {

	
		Room newRoom = new Room(); 

		newRoom.addRoom(newRoom.getRoom(1));
		newRoom.addRoom(newRoom.getRoom(2));
		newRoom.addRoom(newRoom.getRoom(3));
		newRoom.addRoom(newRoom.getRoom(4));
		newRoom.addRoom(newRoom.getRoom(5));
		newRoom.addRoom(newRoom.getRoom(6));
		newRoom.addRoom(newRoom.getRoom(7));
		newRoom.addRoom(newRoom.getRoom(8));
		
		newRoom.printRooms();
		
		newRoom.startingRoom();
		newRoom.createRoom();
		
		newRoom.createRoom();
		


	
		
		


		

		
	}
		
}




