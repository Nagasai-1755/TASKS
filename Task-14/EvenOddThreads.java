package Threads;

class even extends Thread{
	public void run() {
		for(int i=1; i<=10; i++) {
			if(i%2==0)
			System.out.println("Even numbers :" + i);
		}
	}
	}

class odd extends Thread{
	public void run() {
		for(int i=1; i<=10; i++) {
			if(i%2!=0)
				System.out.println("Odd numbers :" +i);
				
		}
	}
}

public class EvenOddThreads {
	public static void main(String[] args) {
		even e = new even();
		odd o = new odd();
		e.start();
		o.start();
	}

}
