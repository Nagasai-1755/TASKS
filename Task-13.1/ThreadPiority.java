package Threads;

class A extends Thread{
	public A() {
		this.setPriority(1);
		System.out.println(this.getPriority());

	}
	public void run() {
		for(int i=1; i<5; i++) {
			System.out.println(i);			
		}
	}
}

class B extends Thread{
	public B() {
		this.setPriority(8);
		System.out.println(this.getPriority());
	}
	public void run() {
		for(int i=1; i<5; i++) {
			if(i%2==0) {
				System.out.println("even numbers :"+ i);

			}
		}
	}
}

class C extends Thread{
	public  C() {
		this.setPriority(6);
		System.out.println(this.getPriority());

	}
	public void run() {
		for(int i=0; i<5; i++) {
			if(i%2 != 0) {
				System.out.println("odd numbers :"+ i);
			}
		}
	}
}

public class ThreadPriority {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		a.start();
		b.start();
		c.start();
	}

}
