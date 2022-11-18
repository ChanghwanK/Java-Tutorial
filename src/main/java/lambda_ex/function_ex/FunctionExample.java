package lambda_ex.function_ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class Student {
    private final String name;
    private final int englishScore;
    private final int mathScore;

    public Student(String name, int englishScore, int mathScore) {
        this.name = name;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    public String getName() {
        return name;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public int getMathScore() {
        return mathScore;
    }
}
public class FunctionExample {
    private static List<Student> arr = Arrays.asList(
        new Student("나서스", 23, 54),
        new Student("이즈", 52, 94),
        new Student("유미", 74, 64)
    );

    public static void printlnName(Function<Student, String> function) {
        /**
         * function의 apply 구현체가 들어옴
         */
        for(Student st : arr) {
            System.out.println(function.apply(st));
        }
    }

    public static void main(String[] args) {
        FunctionExample.printlnName(t-> t.getName());
    }
}
