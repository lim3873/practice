package thread;

public class ThreadAnonymousExample2 {
    public static void main(String[] args) {
        Thread thread4 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.print("#");
                }
            }
        };

        thread4.start();

        for (int i = 0; i < 100; i++) {
            System.out.print("@");
        }
    }
}

