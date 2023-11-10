package Threads;

class Message {
	String msg;
    public synchronized void writing(String message) throws InterruptedException {
    	msg = message;
        System.out.println("sending the message");
        wait();
    }

    public synchronized void reading() {
        System.out.println("Recieving the message");
        System.out.println(msg);
        notify();
    }
}

class Sender extends Thread {
    private Message m;

    public Sender(Message message) {
        this.m = message;
    }

    public void run() {
        try {
            m.writing("hello");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Receiver extends Thread {
    private Message m;

    public Receiver(Message message) {
        this.m = message;
    }

    public synchronized void run() {
    	try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        m.reading();
    }
}

public class EvaluationTaskThreads {
    public static void main(String[] args) {
        Message sharedMessage = new Message();

        Sender senderThread = new Sender(sharedMessage);
        Receiver receiverThread = new Receiver(sharedMessage);

        senderThread.start();
        receiverThread.start();
    }
}
