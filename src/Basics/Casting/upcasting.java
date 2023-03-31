package Basics.Casting;

public class upcasting {
    public static void main(String[] args) {
        People people = new People();
        people.fun();
        people.p();

        // upCasting
        People man = new Man();
        man.fun();
        man.p();
        System.out.println(man.age);
        System.out.println("------------------------------");

        // downCasting
//        People people = new People();
        Man man2 = (Man) man;
        man2.fun();
        man2.m();
        man2.p();

        System.out.println("------------------------------");
        Man man3 = new Man();
        People p2 = man3;
        p2.fun();

        System.out.println(man3.age);
        System.out.println(p2.age);

    }
}

class People{
    String name;
    int age = 0;

    public void fun(){
        System.out.println("i'm a people");
    }

    public void p(){
        System.out.println("people 独有");
    }

}

class Man extends People{
    boolean isSmoke;
    int age = 1;

    @Override
    public void fun(){
        System.out.println("i'm a man");
    }

    public void m(){
        System.out.println("Man 独有");
    }

    public Man(){

    }

    public Man(boolean isSmoke){
        this.isSmoke = isSmoke;
    }
}