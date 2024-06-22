package org.example.lvl1;

import java.util.Scanner;

public class JeffAndDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int z = 0;
        int f = 0;
        for(int i = 0 ; i < n ; i++){

            int val = sc.nextInt();

            if(val == 0 ){
                z++;
            }else{
                f++;
            }
        }
        if( z == 0){
            System.out.println(-1);
        }
        else if(f < 9){
            System.out.println(0);
        }
        else{

            f = f - (f % 9);

            for(int i = 0 ; i < f ; i++ ){
                System.out.print(5);
            }

            for (int i = 0 ; i < z ; i++){
                System.out.print(0);
            }
        }
    }
}
