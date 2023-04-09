package Java8;

public interface interface1 {
    public static void method1(){
        System.out.println("static method1");
    }

    public default void method2(){
        System.out.println("default method2");
    }
}
