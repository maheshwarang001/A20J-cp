package org.example.div2;

import java.util.Scanner;

public class LonelyArray {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);


    }
    public static void solveT(Scanner sc){

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0 ; i <n ; i++){
         nums[i] = sc.nextInt();
        }

        if(n == 1){
            System.out.println(1);
        }else{


            int i = 1;
            int j = n;
            int ans=1;

            while(i <= j){
                int mid = i + (j-i)/2;
                if(check(mid,nums)){
                    j = mid-1;
                    ans = mid;
                }else{
                    i = mid+1;
                }
            }

            System.out.println(ans);
        }
    }

    public static boolean check(int k, int[] nums){

        int[] freq = new int[22];

        for(int i = 0 ; i < k ; i++){
            decimalToBinary(nums[i],freq);
        }
        int[] bits = freq.clone();

        for(int i = k ; i < nums.length ; i++){
            int x = nums[i];

            decimalToBinary(x,bits); //add freq to window
            x= nums[i-k];
            removeDecimalToBinary(x,bits); //remove freq from window

            for(int j = 0 ; j < 22 ; j++){

                if(freq[j] == 0 && bits[j] != 0) return false;
                if(freq[j] != 0 && bits[j] == 0) return false;
            }
        }

        return true;

    }

    public static void decimalToBinary(int x, int[] freq){
        int i = 0;
        while(x > 0){
            if(x % 2 == 1){
                freq[i]++;
            };
            i++;
            x = x/2;
        }
    }

    public static void removeDecimalToBinary(int x, int[] freq){
        int i = 0;
        while(x > 0){
            if(x % 2 == 1){
                freq[i]--;
            };
            i++;
            x = x/2;
        }
    }
}
