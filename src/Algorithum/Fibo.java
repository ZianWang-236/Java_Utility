package Algorithum;

public class Fibo {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
        int ans = sol.lenLongestFibSubseq(arr);
        System.out.println(ans);
    }
}


class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int l = 0;
        int r = 0;
        int start = 0;
        int i = 0;
        while(i < arr.length - 2){
            boolean f = false;
            while(arr[i + 2] == arr[i] + arr[i + 1]){
                i++;
                f = true;
            }
//            System.out.println(i);
            if(i +2- 1 - start > r - l){
                l = i;
                r = i - 1;
            }
            start = i + 2;
            i += 2;
            if(!f) {
                i++;
            }
        }
        if(r != 0){
            return r - l;
        }else{
            return 0;
        }
    }
}