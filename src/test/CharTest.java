package test;

import java.util.Objects;

public class CharTest {
    public static void main(String[] args) {
        // char
        char a = 'B';
        System.out.println(a);
        System.out.println(a - 65);
        System.out.println((char) (a - 65 + 97));

        // string equal vs ==
        String s1 = "abc";
        String s2 = "ab";
        s2 = s2 + "c";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        // object equals
        People p1 = new People("mingze");
        People p2 = new People("mingze");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));
        System.out.println("number of instances: " + People.count);
        People p3 = new People("mingze");
        People p4 = new People("mingze");
        System.out.println("number of instances: " + People.count);

    }
}

class People{
    String name;

    public People(){}

    static int count = 0;
    public People(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        People people = (People) o;
//        return name.equals(people.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }

        @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj instanceof People){
            return Objects.equals(this.name, ((People) obj).name);
        }else{
            return false;
        }
    }
}


