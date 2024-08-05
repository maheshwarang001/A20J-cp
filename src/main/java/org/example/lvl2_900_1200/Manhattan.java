package org.example.lvl2_900_1200;

import java.util.Scanner;

public class Manhattan {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);
        sc.close();



    }


    public static void solveT(Scanner sc){


        int n = sc.nextInt();
        long k = sc.nextLong();

        long [] nums = new long[n+1];

        for(int i = 1 ; i <= n ; i++){
            nums[i] = i;
        }

        int left  = 1;
        int right = n;

        while(left <= right && k > 0){

            if(2 * (nums[left] - nums[right]) <= k){
                k -= 2 * (nums[left] - nums[right]);
                nums[left] = nums[left] ^ nums[right];
                nums[right] = nums[left] ^ nums[right];
                nums[left] = nums[left] ^ nums[right];

                left++;
                right--;
            }else{
                right--;
            }
        }

        if(k == 0){
            System.out.println("YES");
            for(int i = 1 ; i<=n ; i++) System.out.print(nums[i]+" ");
            System.out.println();
        }else{
            System.out.println("NO");
        }


    }

}
