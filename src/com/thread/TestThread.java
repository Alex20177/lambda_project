package com.thread;

public class TestThread {

	public static void main(String[] args) {
		
		Runnable r  = ()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("Child thread");
			}
		};
		
		Thread t = new Thread(r);
		
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");			
		}

		
	}//Close main
	
}//close TestThread class
