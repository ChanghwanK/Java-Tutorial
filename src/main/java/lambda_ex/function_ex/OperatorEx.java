package lambda_ex.function_ex;

import java.util.function.IntBinaryOperator;

public class OperatorEx {
    public static int [] scores = {92,56, 89};
    public static int maxOfMin(IntBinaryOperator operator) {
        int result = scores[0];
        for(int score : scores) {
            result = operator.applyAsInt(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        int max = OperatorEx.maxOfMin(
            (a, b) -> {
                if (a >= b) return a;
                else return b;
            }
        );

        int min = OperatorEx.maxOfMin(
            (a,b) -> {
                if (a <= b) return a;
                else return b;
            }
        );
//        System.out.println("Max Result >>> " + max);
        System.out.println("Min Result >>> " + min);
    }
}
