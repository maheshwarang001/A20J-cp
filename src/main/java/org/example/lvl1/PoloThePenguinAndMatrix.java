package org.example.lvl1;

import java.util.*;

public class PoloThePenguinAndMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        int total = n * m ;

        int[] nums = new int[total];

        Set<Integer> set = new HashSet<>();

        boolean flag = true;

        for(int i = 0 ; i < total ; i++){
            nums[i] = sc.nextInt();
            set.add(nums[i] % d);
        }

        if(set.size() > 1) flag = false;

        if(!flag){
            System.out.println(-1);
            return;
        }
        Arrays.sort(nums);
        int middle = nums.length/2;
        int median = nums[middle];

        int steps = 0;

        for(int i = 0 ; i < total ; i++){

            steps += Math.abs(nums[i] -  median) / d;
        }
        System.out.println(steps);





    }
}
