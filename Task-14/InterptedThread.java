package Threads;
class interpt1 extends Thread {
	public void run() {
		
		for(int i=1; i<100; i++) {
			try {
				Thread.sleep(100);
			}
			catch(Exception e) {
				System.out.println("Exception occured");
				
			}
			
			System.out.println(i+"Thread Executing");
		}
	}
}


public class InterptedThread {
	public static void main(String[] args) {
		interpt1 i = new interpt1();
		i.start();
		
		
	}

}
