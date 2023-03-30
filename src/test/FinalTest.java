package test;

public class FinalTest {

    public static void main(String[] args) {
        Human p = new Human();
        System.out.println(p.age);
        System.out.println(Human.age);
    }
}

class Human{
    static int age;

    String name;

    static{
        age = 99;
    }
}
