package aysnc_ex;

import java.util.ArrayList;

class AClass implements Runnable {

    @Override
    public void run() {
        System.out.println("A Class Run");
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }
}

class BClass implements Runnable {

    @Override
    public void run() {
        System.out.println("B Class Run");
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("===== start ======");
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        ArrayList<Integer> arr = new ArrayList<>();
        Runnable a = new AClass();
        Runnable b = new BClass();
        Thread aThread = new Thread(a);
        Thread bThread = new Thread(b);

        aThread.start();
        bThread.start();


        for(int i = 0; i < 500; i++) {
            arr.add(i);
        }




    }
}
