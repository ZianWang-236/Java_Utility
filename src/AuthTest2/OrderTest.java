package AuthTest2;

import authTest.Order;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

//        order.orderDefault = 1;//outside package
        order.orderPublic = 2;
//        order.orderPrivate = 3;//outside

//        order.methodDefault();
        order.methodPublic();
//        order.methodPrivate();
    }
}
