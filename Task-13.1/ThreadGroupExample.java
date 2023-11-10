package Threads;

class Thread11 extends Thread{
	Thread11(ThreadGroup tg , String name){
		super(tg,name);
	}
	public void run() {
		System.out.println("ThreadGroup Name:" +this.getThreadGroup().getName()+"  "+ " Thread Name:"+this.getName());	
	}
}
class Thread12 extends Thread{
	Thread12(ThreadGroup tg, String name){
		super(tg,name);
	}
	public void run() {
		System.out.println("ThreadGroup Name:" +this.getThreadGroup().getName()+"  "+ " Thread Name:"+this.getName());
		
	}
}
public class ThreadGroupExample  {
	public static void main(String[] args) {
		ThreadGroup TG = new ThreadGroup("Group-1");
		Thread11 T1 = new Thread11(TG,"sai");
		Thread12 T2 = new Thread12(TG,"mani");
		T1.start();
		T2.start();
		
	}

}
