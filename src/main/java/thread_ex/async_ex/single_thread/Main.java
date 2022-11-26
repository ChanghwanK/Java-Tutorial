package thread_ex.async_ex.single_thread;

import java.util.Scanner;

public class Main {
    // main method 하나인 경우
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println("s: " + s);
        System.out.println("Done: ");

        // 입력이 끝난 후 실행 가능
        for(int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println(i);
        }
    }

}
