package lambda_ex.runnable_ex;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Runnable 구현체를 이렇게 람다로 할 수 있음");
        };
        Thread thread = new Thread(runnable);
        thread.start();

        // 위의 코드를 아래처럼 짤 수도 있음

        Thread th2 = new Thread(() -> {
            System.out.println("구현체를 직접 매개변수로 던져줄 수 있음");
        });
    }
}
