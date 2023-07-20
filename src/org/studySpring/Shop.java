package org.studySpring;

import org.studySpring.shop.Door;

public class Shop {

	public static void main(String[] args) {
		 Door door = new Door();
		 
		  door.statusoFShop();
		  door.getLock().setLocked(false);
		  door.statusoFShop();
		  
		 

	}

}
