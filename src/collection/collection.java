package collection;

import java.util.*;

public class collection {
    public static void main(String[] args) {
        /**
         * 集合分单例双例（键值对）
         * collection两个子接口list, set
         */
        ArrayList arrayList = new ArrayList();
        List arrayList1 = new ArrayList();


        HashMap hashMap = new HashMap<>();
        HashSet hashSet = new HashSet<>();
        Hashtable hashtable = new Hashtable();

        arrayList.add("zian");
        System.out.println(arrayList);

        Object ret = hashMap.put(null, 1);
        System.out.println("ret: " + ret);
        System.out.println(hashMap);
        hashMap.put(1, "b");
        ret = hashMap.put(1,"a");
        System.out.println("ret: " + ret);
        System.out.println(hashMap);



        hashSet.add(null);
        System.out.println(hashSet);

        hashtable.put("zian", 24);
        System.out.println(hashtable);


    }
}
