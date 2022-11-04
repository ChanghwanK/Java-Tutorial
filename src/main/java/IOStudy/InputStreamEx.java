package IOStudy;

import java.io.IOException;

public class InputStreamEx {

    public static void main(String[] args) throws IOException {
        Thread02 thread02 = new Thread02();
        thread02.start();

        try {
            System.out.println("Thread 1 입력");
            var data = System.in.read();
            System.out.println();
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

    static class Thread01 extends Thread {
        @Override
        public void run() {

            try {
                System.out.println("Thread 1 입력");
                var data = System.in.read();
                System.out.println();
            } catch(IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static class Thread02 extends Thread {

        @Override
        public void run() {
            for(int i = 0; i < 30; i++) {
                System.out.println("+");
            }
//            try {
//                System.out.println("Thread 2 입력");
//                var data = System.in.read();
//                System.out.println();
//            } catch(IOException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}
