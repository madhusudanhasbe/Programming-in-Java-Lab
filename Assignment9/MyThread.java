package Assignment9;

public class MyThread extends Thread {
    private int threadNumber;

    MyThread(int number) {
        this.threadNumber = number;
        System.out.println("Creating thread " + threadNumber);
    }

    public void run() {
        System.out.println("Thread " + threadNumber + " is running.");

        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Thread " + threadNumber + ": Count " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadNumber + " interrupted.");
        }

        System.out.println("Thread " + threadNumber + " exiting.");
    }
}

