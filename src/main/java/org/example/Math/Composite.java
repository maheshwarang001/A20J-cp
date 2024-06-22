package org.example.Math;

import java.util.*;


public class Composite {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n % 2 == 1){

            int div = n/2;
            System.out.println(div);
            System.out.print(3 + " ");
            for(int i = 0 ; i < div-1 ; i++){
                System.out.print(2 + " ");
            }
        }else{

            int div = n/2;
            System.out.println(div);
            //System.out.println(2+ " ");
            for(int i = 0 ; i < div ; i++){
                System.out.print(2 + " ");
            }
        }
    }


}
