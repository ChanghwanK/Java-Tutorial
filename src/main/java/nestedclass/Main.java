package nestedclass;

import java.util.Optional;
import nestedclass.OuterClass.InnerClass;

class OuterClass {
    private String name;

     static class InnerClass {
        private int age;
         public String getOuterClassName() {
             return new OuterClass().name;
         }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.new InnerClass();
        String name = innerClass.
    }
}
