package static_ex;

/**
 * static은 JVM의 Method Area중 Static Area에 올라간다.
 * 시스템이 종료될 때 까지 사라지지 않음
 */
public class StaticEx {
    public static int num = 10;

    /**
     * static은 static으로만
     */
    public static void setNum() {
        num = 10;
    }

    public static void setNum2() {
        // this.num = 10 <= this 키워드로도 붙을 수 없음
    }
    public static void main(String[] args) {
        var data = StaticEx.num;
        StaticEx staticEx = new StaticEx();
        // staticEx.num 안됨 자바는 기본적으로 static 키워드가 붙으면 static으로만 접근가능
        StaticEx.num = 15;
    }
}
