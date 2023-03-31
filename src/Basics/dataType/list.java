package Basics.dataType;

import java.util.*;


public class list {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(0);
        a.add(1);
        a.add(2);
        a.add(3);
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(-1);
        b.add(-2);
        b.add(-3);
        //
        a.add(2, 99);
        a.addAll(2, b);
        System.out.println("get index 1: " + a.get(1));
        System.out.println("if contains 99: " + a.contains(99));
        System.out.println("get index of 99: " + a.indexOf(99));
        System.out.println("check if empty: " + a.isEmpty());
        Collections.sort(a);
//        a.Algorithum.sort((p1, p2)->(p1.compareTo(p2)));
        System.out.println(a);
    }
}
