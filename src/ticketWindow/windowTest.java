package ticketWindow;

public class windowTest {
    public static void main(String[] args) {

//         直接通过thread创建线程
        window w1 = new window();
        window w2 = new window();
        window w3 = new window();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();

//        // 通过runnable创建线程
//        windowRunable windowRunable = new windowRunable();
//        Thread t1 = new Thread(windowRunable);
//        Thread t2 = new Thread(windowRunable);
//        Thread t3 = new Thread(windowRunable);
//        t1.setName("窗口1");
//        t2.setName("窗口2");
//        t3.setName("窗口3");
//        t1.start();
//        t2.start();
//        t3.start();
    }
}
