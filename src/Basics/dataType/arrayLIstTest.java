package Basics.dataType;

import  java.util.*;

public class arrayLIstTest {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        System.out.println(a);
        System.out.println(a.get(1));
        a.set(0, 99);
        System.out.println(a);
        System.out.println(a.get(0));
        a.remove(0);
        System.out.println(a);
        System.out.println(a.size());
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
    }
}
