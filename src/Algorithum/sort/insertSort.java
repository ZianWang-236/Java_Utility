package Algorithum.sort;

import java.util.Arrays;

public class insertSort {
    public void insert(int[] nums){
        for(int i = 1; i < nums.length;i++){
            int j = i;
            while (j > 0 && nums[j] < nums[j - 1]) {
                int tmp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = tmp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] input = new int[]{1,8,7,4,2,3,6,4,9,8,0};
        insertSort sol = new insertSort();
        sol.insert(input);
        System.out.println(Arrays.toString(input));
    }
}
