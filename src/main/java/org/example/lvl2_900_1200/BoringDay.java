package org.example.lvl2_900_1200;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BoringDay {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();

            long low = sc.nextLong();
            long high = sc.nextLong();

            long [] nums =new long[n];

            for(int i =  0 ; i < n ; i++){
              nums[i] = sc.nextLong();
            }

            int j = 0;
            int i = 0;
            long sum = 0;
            int count = 0;

            while(j < n){

                if(nums[j] > high){
                    sum = 0;
                    i= j+1;
                    j++;
                    continue;
                }

                sum += nums[j];

                while( i <= j && sum > high){
                    sum -= nums[i];
                    i++;
                }

                if(sum >= low){
                    count++;
                    sum = 0;
                    i = j+1;
                }
                j++;

            }

            System.out.println(count);

        }

    }
}
