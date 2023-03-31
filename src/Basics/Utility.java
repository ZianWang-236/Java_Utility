package Basics;

import java.util.ArrayList;

class Utility {
    public int tribonacci(int n) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        res.add(0);
        res.add(1);
        res.add(1);
        if (n < 3){
            return res.get(n);
        }
        for (int i=3; i < n + 1; i++){
            int tmp = res.get(0) + res.get(1) + res.get(2);
            res.set(0, res.get(1));
            res.set(1, res.get(2));
            res.set(2, tmp);
        }
        return res.get(2);
    }


    public static void main(String[] args){
        Utility Sol = new Utility();
        int ans = Sol.tribonacci(10);
        System.out.println(ans);
    }
}