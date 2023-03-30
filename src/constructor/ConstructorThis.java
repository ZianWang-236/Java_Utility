package constructor;

public class ConstructorThis {
    public static void main(String[] args) {
        customer a = new customer();
        customer b = new customer("zian");
        customer c = new customer(50, "0623", 24);
        customer d = new customer(true);
        System.out.println("name: " + a.name + " money: " + a.money + " accountNum: " + a.accountNum + " age: " + a.age
         + " isActive: " + a.isActive);
        System.out.println("name: " + b.name + " money: " + b.money + " accountNum: " + b.accountNum + " age: " + b.age
                + " isActive: " + b.isActive);
        System.out.println("name: " + c.name + " money: " + c.money + " accountNum: " + c.accountNum + " age: " + c.age
                + " isActive: " + c.isActive);
        System.out.println("name: " + d.name + " money: " + d.money + " accountNum: " + d.accountNum + " age: " + d.age
                + " isActive: " + d.isActive);
    }
}

class customer {
    String name;
    int money;
    String accountNum;
    int age;
    boolean isActive;

    public customer(){

    }

    public customer(String name){
        this.name = name;
    }

    public customer(int money, String accountNum, int age){
        this("defaultMoney");
        this.money = money;
//        this.accountNum = accountNum;
        this.age = age;
    }

    public customer(boolean isActive){
        this(0, "xxxx", 99);
        this.isActive = isActive;
    }
}