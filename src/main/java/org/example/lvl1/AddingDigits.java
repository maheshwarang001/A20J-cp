package org.example.lvl1;

import java.util.Scanner;

public class AddingDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        long a = x;
        int b = sc.nextInt();
        int n = sc.nextInt();

        int prev = -1;

        for(int i = 0 ; i < n ; i++){

            boolean found  = false;

            for (int j = 0 ; j <= 9 ; j++){

                if(((a * 10 )+j) % b == 0 && prev != j){
                    prev = j;
                    a = (a * 10)+ j;
                    found = true;
                    break;
                }
            }
            if(!found) break;
        }

        System.out.println( (a == x ) ? -1  : a);
    }
}
