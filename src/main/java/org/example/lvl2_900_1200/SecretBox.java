package org.example.lvl2_900_1200;

import java.util.Scanner;

public class SecretBox {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            long x = sc.nextLong();
            long y = sc.nextLong();
            long z = sc.nextLong();
            long vol = sc.nextLong();
            long ans = 0L;


            for(int a = 1 ; a <= x ; a++){
                for(int b = 1 ; b <= y ; b++){

                    boolean flag1 = false;
                    boolean flag2 = false;

                    //check vol%a*b == 0;

                    if(vol % (a*b) == 0){
                        flag1 = true;
                    }
                    //check vol/a*b is within z
                    if(vol / (a*b) <= z){
                        flag2 = true;
                    }
                    if(flag2 && flag1){
                        long side1 = a;
                        long side2 = b;
                        long side3 = vol/(side1*side2);


                        long distanceX = (x - side1+1);
                        long distanceY = (y - side2+1);
                        long distanceZ = (z - side3+1);

                        ans = Math.max(ans, distanceX * distanceY * distanceZ);
                    }
                }
            }
            System.out.println(ans);


        }

    }
}
