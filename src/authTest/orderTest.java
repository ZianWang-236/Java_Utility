package authTest;

public class orderTest {
    public static void main(String[] args) {
        Order order = new Order();

        order.orderDefault = 1;//same package
        order.orderPublic = 2;
//        order.orderPrivate = 3;

        order.methodDefault();
        order.methodPublic();
//        order.methodPrivate();
    }

}
