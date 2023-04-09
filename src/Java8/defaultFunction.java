package Java8;

public class defaultFunction implements interface1{
    public void method2(){
        System.out.println("this method2 is overwritten");
    }

    public static void main(String[] args) {
        defaultFunction de = new defaultFunction();
        interface1.method1();
        de.method2();
    }
}
