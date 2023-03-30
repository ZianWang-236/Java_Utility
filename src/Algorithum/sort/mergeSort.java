package Algorithum.sort;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        mergeSort sol = new mergeSort();
        int[] nums = new int[]{-10,5,0,1,3,5,0,7,4,9,-1,-8};
        System.out.println("original: " + Arrays.toString(nums));
        int[] res = sol.split(nums);
        System.out.println("sorted: " + Arrays.toString(res));
    }
    public int[] split(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }else{
            int[] a = split(Arrays.copyOfRange(nums, 0, (nums.length - 1) / 2 + 1));
            int[] b = split(Arrays.copyOfRange(nums, (nums.length - 1) / 2 + 1, nums.length));
            // Algorithum.sort here
            return merge(a, b);
        }
    }
    static int[] merge(int[] a, int[] b){
        int[] res = new int[a.length + b.length];
        int alen = a.length;
        int blen = b.length;
        int astart = 0;
        int bstart = 0;
        int rstart = 0;
        while(rstart < res.length && astart < alen && bstart < blen){
            if(a[astart] < b[bstart]){
                res[rstart] = a[astart];
                astart++;
            }else{
                res[rstart] = b[bstart];
                bstart++;
            }
            rstart++;
        }
        // handle remaining
        while(astart < alen){
            res[rstart]=a[astart];
            rstart++;
            astart++;
        }
        while(bstart < blen){
            res[rstart]=b[bstart];
            rstart++;
            bstart++;
        }
        return res;
    }
}
