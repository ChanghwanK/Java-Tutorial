package 짬통;

import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> arr;

    static void arrayListInit() {
        if(arr == null) arr = new ArrayList<>();

        for(int i = 0; i < 800; i++) {
            arr.add((int) (Math.random() * 800)+ 1 );
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("ArrayList Init");
        arrayListInit();
        int size = arr.size();
        System.out.println();
        int cnt = 0;
        System.out.println("======== Case 1 Start ========");

        long caseOneStartTime = System.currentTimeMillis();
        for(int i = 0; i < size; i++) {
            cnt += 0;
        }
        long caseOneEndTime = System.currentTimeMillis();
        System.out.println("실행시간: " + (caseOneEndTime - caseOneStartTime)+ "ms");
        System.out.println("===== Case 1 End ========");
        System.out.println();

        Thread.sleep(5000);

        System.out.println("======== Case 2 Start ========");
        cnt = 0;
        long caseTwoStartTime = System.currentTimeMillis();
        for(int i = 0; i < arr.size(); i++) {
            cnt+=i;
        }
        long caseTwoEndTime = System.currentTimeMillis();
        long l = caseTwoEndTime - caseTwoStartTime;
        System.out.println("실행시간: " + (l) + "ms");
        System.out.println("===== Case 2 End ========");
    }
}
