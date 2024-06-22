package org.example.Math;

import java.util.Scanner;

public class Lcm {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solve(sc);

    }

    public static void solve(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            long a = sc.nextLong();
            long b = sc.nextLong();

            if(a * 2 <= b){
                b = 2 * a;
            }else{
                a = -1;
                b = -1;
            }
            System.out.println(a + " " + b);

        }

    }

    static long gcd(long a, long b){

        while(b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


}
