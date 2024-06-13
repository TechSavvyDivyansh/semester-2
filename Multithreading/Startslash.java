import java.util.*;

class MultiThreading implements Runnable {
    public void run() {
        if (Thread.currentThread().getName().equals("star")) {
            for (int i = 1; i <= 10; i++) {
                try {
                    System.out.print("*");
                    Thread.sleep(90);
                } catch (Exception ie) {
                    System.out.println(ie);
                }
            }
        }
        if (Thread.currentThread().getName().equals("slash")) {
            for (int i = 1; i <= 10; i++) {
                try {
                    System.out.print("/");
                    Thread.sleep(90);
                } catch (InterruptedException ie) {
                    System.out.println(ie);
                }
            }
        }
    }
}

class Starslash
{
    public static void main(String args[]) {
        Thread t1, t2;
        t1 = new Thread(new MultiThreading());
        t2 = new Thread(new MultiThreading());
        t1.setName("slash");
        t2.setName("star");
        t1.start();
        t2.start();
    }
}