package thread_ex.multi_thread_ex;


class MyThreadA extends Thread {

    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.print("aaaaaaa");
        }
    }
}


class MyThreadB extends Thread {

    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.print("bbbbbb");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread a = new MyThreadA();
        Thread b = new MyThreadB();

        a.start();
        b.start();

        for(int i = 0; i < 100; i++) {
            System.out.print("CCCCCC");
        }
    }
}
