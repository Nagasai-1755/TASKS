package Threads;

class Message {
    public synchronized void writing() throws InterruptedException {
        System.out.println("sending the message");
        wait();
    }

    public synchronized void reading() {
        System.out.println("Recieving the message");
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
            m.writing();
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
			Thread.currentThread().sleep(7000);
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
