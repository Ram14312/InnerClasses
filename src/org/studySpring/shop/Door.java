package org.studySpring.shop;

public class Door {
	public Lock lock;
	
	public Door() {
		lock = new Lock(true);
		

	}
	
	public Lock getLock() {
		return lock;
	}

	public void statusoFShop() {
		if(lock.isLocked()) {
			System.out.println("shop is closed pls visit tmrw");
		}
		else {
			System.out.println("shop is open");
		}
	}
	
	public class Lock{
	 private boolean Locked;

	public Lock(boolean locked) {
		Locked = locked;
	}

	public boolean isLocked() {
		return Locked;
	}

	public void setLocked(boolean locked) {
		Locked = locked;
	}
	
	 
	}
	

	
	 
}

