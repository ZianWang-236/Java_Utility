package ticketWindow;

/**
 * 1.创建一个继承于thread类的子类
 * 2.重写thread类的run()
 * 3.创建thread类的子类的对象
 * 4.通过对象调用start()
 */
public class window extends Thread{
    private static int ticket = 100;
    private static Object obj = new Object();

    @Override
    public void run() {
        while(true){
            synchronized (window.class) {
                if (window.ticket > 0) {
                    System.out.println(getName() + ": 卖出第" + window.ticket + "张票");
                    window.ticket--;
                } else {
                    System.out.println(getName() + ": 票已经卖完了");
                    break;
                }
            }
        }
    }
}
