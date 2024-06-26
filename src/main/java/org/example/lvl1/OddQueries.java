package org.example.lvl1;

import java.util.Scanner;

public class OddQueries {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();
            int m = sc.nextInt();

            long [] nums = new long[n];
            long [] prefix =  new long[n];

            for(int i = 0 ; i < n ; i++){

                nums[i] = sc.nextLong();

                if(i == 0){
                    prefix[i] = nums[i];
                }else{
                    prefix[i] = prefix[i-1]+nums[i];
                }
            }

            for(int i = 0 ; i < m ; i++){

                int l = sc.nextInt();
                int r = sc.nextInt();
                long k = sc.nextLong();

                long prefixSum = 0L;

                if(l > 1){
                    prefixSum = prefix[n-1] - (prefix[r-1] - prefix[l-2]);
                }else{
                    prefixSum =  prefix[n-1] - prefix[r-1];
                }

                long mul = k * (r-l+1);

                if(((mul + prefixSum) & 1) != 0){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }





            }



        }

    }

}
