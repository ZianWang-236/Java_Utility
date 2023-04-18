package StringClass;

public class stringTest {
    public static void main(String[] args) {
//        people tom1 = new people();
//        people tom2 = new people();
//
//        tom1.setName(new String("tom"));
//        tom2.setName(new String("tom"));
//
//        System.out.println(tom1.getName() == tom2.getName());
//        System.out.println(tom1.getName().equals(tom2.getName()));

        String a = "abcdefgcd";
        System.out.println(a.lastIndexOf("cd"));
    }
}

class people{
    private int age;
    private String name;

    public people(String name) {
        this.name = name;
    }

    public people() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
