package thread;

public class ThreadExample1 {
    public static void main(String[] args) {
//        Runnable task1 = new ThreadTask1();
//
//        Thread thread1 = new Thread(task1);

        Thread thread1 = new Thread(new ThreadTask1()); // 한줄로 가능
        thread1.start();
        for(int i = 0; i < 100; i++){
            System.out.print("@");
        }


    }
}

class ThreadTask1 implements Runnable {
    public void run(){
        for(int i = 0; i < 120; i++){
            System.out.print("*");
        }
    }
}