package org.example.lvl1;

import java.util.Scanner;

public class ILoveUsername {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int min = 0;
        int max = 0;

        int count = 0;

        for(int i = 0 ; i < n ; i++ ){

            int val = sc.nextInt();

            if(i == 0){
                min = val;
                max = val;
            }
            else{

                if( val < min){
                    min = val;
                    count++;
                }
                else if(max < val){
                    max = val;
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
