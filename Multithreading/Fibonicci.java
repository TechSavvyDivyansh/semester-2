import java.util.*;

public class Fibonicci {
    public static void main(String[] args) {
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of elements to be generate in Fibonacci series: ");
        no = sc.nextInt();
        FibonacciThread f = new FibonacciThread(no);
        f.start();
        synchronized (f) {
            try {
                System.out.println(
                        "Parent Thread Waiting for Fibonacci Thread to generate all fibonacci Numbers and store the same in an array...");
                f.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(
                    "Fibonacci Thread has been Notified to Parent Class: Series has been generated Successfully.");
            System.out.println("Main Thread(parent Thread)Printing Fibonacci Elements from Array...");
            f.printFibonacci(no);
            System.out.println("Parent Thread(Main Thread) has completed its Process....");
        }
    }
}

class FibonacciThread extends Thread {
    int noOfElements, fib1 = 0, fib2 = 1, fib3, fib[];

    FibonacciThread(int no) {
        noOfElements = no;
    }

    public void run() {
        synchronized (this) {
            fib = new int[noOfElements];
            fib[0] = fib1;
            fib[1] = fib2;
            System.out.println("Fibonacci Thread processing to generate Series of" + noOfElements + "Elements...");
            for (int i = 2; i < noOfElements; i++) 
            {
                try {
                    fib3 = fib1 + fib2;
                    fib[i] = fib3;
                    fib1 = fib2;
                    fib2 = fib3;
                    System.out.println("...");
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                    System.out.println(ie);
                }
            }
            notify();
        }
    }

    public void printFibonacci(int n) {
        System.out.println("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + "\t");
        }
        System.out.println();
    }
}