package call_by_value;

public class Main {

    public static void main(String[] args) {
        System.out.println("====== call by value ========");
        Store store = new Store();
        store.store.add("Hi");
        store.store.add("Hello");

        System.out.println();
        System.out.println("===== Check Store ====");
        System.out.println(store.store);

        System.out.println();

        System.out.println("======== Reset =========");
        Reset reset = new Reset();
        reset.reset(store);

        System.out.println("===== Check  After Reset ====");
        System.out.println(store.store);
    }

}
