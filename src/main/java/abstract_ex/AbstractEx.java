package abstract_ex;

abstract class ParentEx {
    public String parentName;

    public void methodA() {
        System.out.println("Parent A");
    }

//    public abstract void methodB() {
//        System.out.println("abstract method doesn't impl");
//    }
    public abstract void methodB();
}

class ChildEx extends ParentEx {

    public ChildEx() {
//        super.
////        this.parentName = name;
    }

    @Override
    public void methodB() {
        System.out.println("추상 메서드는 반드시 재정의 해주어야 한다.");
    }

//    public String getName() {
//        return super.
//    }
}

public class AbstractEx {
    public static void main(String[] args) {
        ChildEx childEx = new ChildEx();
        childEx.parentName = "";
    }
}
