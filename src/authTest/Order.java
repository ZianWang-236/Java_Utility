package authTest;

public class Order {
    private int orderPrivate;
    int orderDefault;
    public int orderPublic;

    public void methodPublic(){
        orderPublic = 1;
        orderDefault = 2;
        orderPublic = 3;
    }
    void methodDefault(){
        orderPublic = 1;
        orderDefault = 2;
        orderPublic = 3;
    }
    private void methodPrivate(){
        orderPublic = 1;
        orderDefault = 2;
        orderPublic = 3;
    }
}
