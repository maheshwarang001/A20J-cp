package org.example.bit;

import java.util.Scanner;

public class TavasAndSaDDas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);





            int x = sc.nextInt();

            String str = String.valueOf(x);

            int len  = str.length();

            int gp = (1<<len) - 2;
            int count = 0;
            for(int i = len - 1 ; i >= 0 ; i--){

                if(str.charAt(i) == '7'){

                    gp += (1<<count);
                }
                count++;

            }
            System.out.println(gp+1);


    }
}
