package Basics;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "tom";
        p1.age = 24;
        p1.isMale = true;
        System.out.println("name is: " + p1.name);
        System.out.println("age is: " + p1.age);
        System.out.println("is male: " + p1.isMale);
        p1.eat();
        p1.sleep();
        System.out.println(p1.talk("Chinese"));
    }


}

class Person {
    String name;
    int age = 1;
    boolean isMale;
    public void eat() {
        System.out.println("eat");
    }
    public void sleep(){
        System.out.println("sleep");
    }
    public String talk(String lang){
        return "speaking " + lang + "!";
    }
}