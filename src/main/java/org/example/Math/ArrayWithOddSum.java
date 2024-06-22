package org.example.Math;

import java.util.Scanner;

public class ArrayWithOddSum {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solve(sc);

    }

    public static void solve(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();

            long sum = 0;

            int odd = 0;
            int even = 0;

            while(n-- > 0 ){
                int val = sc.nextInt();
                sum+=val;

                if( (val&1) != 0){
                    odd++;
                }else{
                    even++;
                }



            }

            if(sum % 2 != 0 || sum == 1){
                System.out.println("YES");
            }else{

                if(odd!= 0 && even != 0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");

                }
            }

        }

    }
}
