package Basics.AbstractClass;

public class actualCalss extends abstractClass{

    public static void insideActual(){
        System.out.println("inside actual class");
    }

    public static void main(String[] args) {
        actualCalss.greeting();
        actualCalss.insideActual();
    }
}
