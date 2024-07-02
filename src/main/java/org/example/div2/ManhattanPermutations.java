package org.example.div2;

import java.util.Scanner;

public class ManhattanPermutations {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);


    }
    public static void solveT(Scanner sc){
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] nums = new long[n];
        long max = 0;

        for(int i = 0 ; i < n ; i++){
            max += (n-i + (i+1));
            nums[i] = (long)i+1;
        }
        if(k > max){
            System.out.println("NO");
        }else {

            int l = 0, r = n - 1;

            while (l <= r && k > 0) {

                if (2 * (nums[r] - nums[l]) <= k) {
                    k -= 2 * (nums[r] - nums[l]);

                    nums[l] = nums[l] ^ nums[r];
                    nums[r] = nums[l] ^ nums[r];
                    nums[l] = nums[l] ^ nums[r];

                    l++;
                    r--;
                } else {
                    r--;
                }
            }
            if (k == 0) {
                System.out.println("YES");
                for (long it : nums) {
                    System.out.print(it + " ");
                }
                System.out.println();
            } else {
                System.out.println("NO");
            }
        }

    }
}
