package Basics.dataType;

import java.util.*;

public class hashmapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> a = new HashMap<>();
        a.put(1,"1");
        a.put(2,"2");
        a.put(3,"3");
        a.put(4,"4");
        System.out.println("Hashmap: " + a);
        System.out.println("value for 3: " + a.get(3));
        a.remove(1);
        System.out.println("remove 1: " + a);
        System.out.println("get size: " + a.size());
        System.out.println("------------loop through keys------------");
        for(int i : a.keySet()){
            System.out.println(i);
        }
        System.out.println("------------loop through values------------");
        for(String j : a.values()){
            System.out.println(j);
        }
        System.out.println("--------loop through key-value pair--------");
        for(int k : a.keySet()){
            System.out.println(k + "-->" + a.get(k));
        }

    }
}
