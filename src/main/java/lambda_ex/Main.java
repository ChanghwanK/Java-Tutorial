package lambda_ex;

public class Main {
    public static void main(String[] args) {
        /**
         * 익명 구현체를 정의
         * 따로 구현체인 Impl 클래스를 만들 필요없음
         */
        MyLambdaEx myLambdaEx = () -> {
            System.out.println("익명 구현체 구현");
        };
        myLambdaEx.methodA();
    }
}
