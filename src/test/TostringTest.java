package test;

import jdk.jfr.StackTrace;
import org.junit.Test;

import java.util.Date;

public class TostringTest {
    public static void main(String[] args) {
        String s1 = new String("mingze");
        System.out.println(s1);

        Date d1 = new Date();
        System.out.println(d1);

        Building stmathieu = new Building(1272);
        System.out.println(stmathieu.toString());
    }

    @Test
    public void testTest(){
        Integer a = new Integer("123456");
        System.out.println(a);
    }
}

class Building{
    int number;
    People people;

    @Override
    public String toString() {
        return "Building{" +
                "number=" + number +
                ", people=" + people +
                '}';
    }

    public Building(){};

    public Building(int number, People people) {
        this.number = number;
        this.people = people;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public Building(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

