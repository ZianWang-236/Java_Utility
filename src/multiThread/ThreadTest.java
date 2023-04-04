package multiThread;

public class ThreadTest {
    static int DEFAULT_THREAD_NUM = 3;

    public static void main(String[] args) {

//        for(int i = 0; i < 100; i++){
//            System.out.println("main: " + i);
//        }
        System.out.println("THIS IS THE MAIN THREAD");
        printNumber(0, 30000);
        System.out.println("THIS IS THE END OF MAIN THREAD");
    }

    public static void printNumber(int min, int max){
        myThread myThread1 = new myThread(min, min + (max - min) / 3);
        myThread myThread2 = new myThread(min + ((max - min) / 3), min + ((max - min) * 2 / 3));
        myThread myThread3 = new myThread(min + ((max - min) * 2 / 3), max);
        myThread1.start();
        myThread2.start();
        myThread3.start();
    }
}

class myThread extends Thread{
    static int COUNT = 0;
    private int num;
    private int bbound;
    private int ubound;
    public myThread(int bbound, int ubound){
        myThread.COUNT++;
        this.bbound = bbound;
        this.ubound = ubound;
        this.num = COUNT;
    }

    @Override
    public void run() {
        for(int i = this.bbound; i < this.ubound; i++){
            System.out.println("thread " + this.num + ": " + i);
        }
    }
}