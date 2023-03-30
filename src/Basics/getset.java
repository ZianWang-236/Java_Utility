package Basics;

public class getset {
    public static void main(String[] args) {
        Animal dog = new Animal();
        System.out.println(dog.getLeg());
        dog.setLeg(4);
        System.out.println(dog.getLeg());


    }
}

class Animal{
    private int age;
    private String name;
    private int leg;

    public void setAge(int age) {

        this.age = age;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public int getLeg() {
        return leg;
    }

    public String getName() {
        return name;
    }





}