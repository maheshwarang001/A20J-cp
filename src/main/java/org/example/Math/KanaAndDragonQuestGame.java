package org.example.Math;

import java.util.Scanner;

public class KanaAndDragonQuestGame {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){


            int x = sc.nextInt();

            int x2= x;

            int n = sc.nextInt();
            int m = sc.nextInt();
            int n1 = n;
            int m1 = m;

            int flag = 0;

            while(n-- > 0 && x > 0){
                x = (x/2) + 10;

                if(x <= 0){
                 flag = 1;
                 break;
                }
            }
            while(m-- > 0 && x > 0){
                x = x - 10;

                if(x <= 0){
                    flag = 1;
                    break;
                }
            }

            while(m1-- > 0 &&  x2 > 0){
                x2 = x2 - 10;

                if(x2 <= 0){
                    flag = 1;
                    break;
                }
            }

            while(n1-- > 0 &&  x2 > 0){
                x2 = (x2/10) + 10;

                if(x2 <= 0){
                    flag = 1;
                    break;
                }
            }

            if(flag == 1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }



        }

    }
}
