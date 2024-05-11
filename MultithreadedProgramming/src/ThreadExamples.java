class loop1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Running loop 1.");
        }
    }
}

class loop2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Running loop 2.");
        }
    }
}

public class ThreadExamples extends Thread {

    public static void main(String[] args) {
        loop1 l1 = new loop1();
        loop2 l2 = new loop2();

        System.out.println("This is how it runs without special thread methods");
        l1.run();
        l2.run();

        System.out.println("This is how it runs with start() method");

        try {
            l1.start();
            l2.start();
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            System.out.println("Waiting for both processes to end.");
            l1.join();
            l2.join();
            System.out.println("Process Complete and joined to this current thread.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("This is Last Statement");

    }
}