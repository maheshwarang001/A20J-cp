package org.example.Math;

import java.util.Scanner;

public class MultiplyAndDivide {


    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){


            long x = sc.nextInt();

            if (x == 1){
                System.out.println(0);
                continue;
            }

            long prev = -1;
            long steps = 0;
            int flag = 0;

            while(x != 1){

                if(x % 6 != 0){
                    x = x * 2;
                }else{
                    x = x / 6;
                    if(prev == x){
                        flag = 1;
                        break;
                    };
                    prev = x;
                }
                steps++;
            }
            if (flag == 1) System.out.println(-1);
            else System.out.println(prev == -1 ? -1 : steps);
        }

    }
}
