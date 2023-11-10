package Threads;

class Alive extends Thread{
	Alive(){
		System.out.println(this.isAlive());
		
	}
	public void run() {
			System.out.println("The Thread is Alive");
			System.out.println(this.isAlive());
		}
	}



public class IsAliveThread {
	public static void main(String[] args) {
		Alive obj = new Alive();
		obj.start();
		System.out.println(obj.isAlive());
	}

}
