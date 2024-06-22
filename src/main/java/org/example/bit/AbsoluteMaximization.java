package org.example.bit;

import java.util.Scanner;

public class AbsoluteMaximization {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();
            int min = 0;
            int max = 0;

            for(int i = 0 ; i < n ; i++){
                int val = sc.nextInt();
                if(i == 0) min = val;


                min = min & val;
                max = max | val;


            }

            System.out.println(max-min);







        }
    }
}
