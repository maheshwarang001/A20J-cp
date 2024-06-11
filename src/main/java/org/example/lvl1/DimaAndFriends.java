package org.example.lvl1;

import java.util.Scanner;

public class DimaAndFriends {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int totalSteps  = 0;

        for(int i = 0 ; i < n  ; i++){
            totalSteps += sc.nextInt();
        }

        int p = totalSteps % (n +1 ) ;


        int count = 0;

        for(int i = 1 ; i <= 5 ; i++){

            p += 1;

            if(p > n +1){
                p = 1;
            }
            else if(p != 1){
                count++;
            }
        }

        System.out.println(count);
    }
}
