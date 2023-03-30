package constructor;

public class constructor {
    public static void main(String[] args) {
        person a = new person();
        person b = new person("zian");
        System.out.println(b.name);
    }
}

class person{
    int age;
    String name;

    public person(){
        System.out.println("person()...");
    }

    public person(String n){
        name = n;
    }
}
