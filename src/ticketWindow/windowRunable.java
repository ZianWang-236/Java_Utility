package ticketWindow;

/**
 * 1.创建一个实现了runnable接口的实现类
 * 2.实现类去实现runnable中的抽象方法：run()
 * 3.创建实现类的对象
 * 4.将此对象作为参数传递到thread类的构造器中，创建thread类的对象
 * 5.通过thread对象调用start()
 */
public class windowRunable implements Runnable{

    private int TICKET = 100;
    Object obj = new Object();

    @Override
    public void run() {
        while (true){
            synchronized (this) {
                if (TICKET > 0) {
                    System.out.println(Thread.currentThread().getName() + ": 卖出了第" + TICKET + "张票");
                    TICKET--;
                } else {
                    System.out.println(Thread.currentThread().getName() + ": 票卖光了");
                    break;
                }
            }
        }
    }
}
