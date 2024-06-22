package org.example.striver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfRoundNumbers {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solve(sc);

    }

    public static void solve(Scanner sc){

        int t = sc.nextInt();

        while(t--  > 0){

            int digit = sc.nextInt();

            List<Integer> list = new ArrayList<>();
            int idx = 0;

            while(digit != 0){

                int c = digit % 10;
                digit = digit/10;

                if( c != 0){

                    if(idx == 0){
                        list.add(c);
                    }else{
                        int ans = c * (int) Math.pow(10,idx);
                        list.add( ans);
                    }

                }
                idx++;
            }

            System.out.println(list.size());
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }

    }
}
