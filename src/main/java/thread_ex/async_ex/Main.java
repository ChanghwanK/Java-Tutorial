package thread_ex.async_ex;

import java.util.Scanner;

class JobA extends Thread {

    @Override
    public void run() {
        try {
            methodA();
        } catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void methodA() throws InterruptedException {
        System.out.println();
        System.out.println();
        System.out.print("Thread Name: ");
        System.out.println(Thread.currentThread().getName());
        System.out.println("Start");
        System.out.println("====================");

        for(int i = 0; i < 15; i++) {
            Thread.sleep(1000);
            System.out.println(i);
        }

        System.out.println();
        System.out.println("======" + Thread.currentThread().getName() + "STOP" + "======");
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.print("Thread Name: ");
        System.out.println(Thread.currentThread().getName());
        System.out.println("Start");
        System.out.println("====================");
        System.out.println();


        Thread a = new JobA();
        a.start();

        System.out.print("문자 입력: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("입력된 문자: " + s);

        System.out.println();
        System.out.println("========== Done =============");
    }

}
