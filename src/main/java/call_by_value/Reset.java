package call_by_value;

public class Reset {
    public void reset(Store store) {
        System.out.println("start reset");
        System.out.println(store);
        store = new Store();
        System.out.println();
        System.out.println(store);
        System.out.println(store.store);
    }

}
