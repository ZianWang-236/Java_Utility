package dataType;

import java.util.*;

public class hashSetTest {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();
        a.add(10);
        a.add(5);
        a.add(0);
        a.add(9);
        System.out.println(a);
        System.out.println(a.contains(5));
        a.remove(10);
        System.out.println("get size: " + a.size());

    }
}
