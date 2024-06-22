package org.example.Math;

import java.util.Scanner;

public class OddDivisor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0 ){

            long in = sc.nextLong();

            if((in & in-1 ) != 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
