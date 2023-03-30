package sort;

import java.util.*;


public class fasatsort {
    public static void sw(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    public static void sort(int[] rand, int l,int r) {
        if (l == r) {
            return;
        }
        int lbound = l - 1;
        int rbound = r;
        while (lbound + 1 < rbound) {
            if (rand[lbound + 1] <= rand[r]) {
                lbound++;
            } else {
                sw(rand, lbound + 1, --rbound);
            }
        }
        sw(rand, rbound, r);
        if (lbound != -1) {
            sort(rand, l, lbound); // 有可能呢left bound 从来没有移动过，默认的是出界的
        }
        sort(rand, rbound, r);
    }

    public static void main(String[] args) {
        int[] rand = new int[20];
        for (int i = 0; i < rand.length; i++) {
            rand[i] = (int) (Math.random() * 10);
        }
//        int[] rand = new int[]{1, 7, 5, 5, 2, 1, 5, 1, 5, 0}; // 手动输入
        System.out.println(Arrays.toString(rand));
        sort(rand, 0, rand.length - 1);
        System.out.println(Arrays.toString(rand));

    }
}

