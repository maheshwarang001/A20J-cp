package org.example.lvl1;

import java.util.Arrays;
import java.util.Scanner;

public class QueueAtTheSchool {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int round = sc.nextInt();

        String ans = sc.next();

        char [] arr = ans.toCharArray();




        while( round > 0){

            for(int i = 0 ; i < len-1 ; i++){

                if(arr[i] == 'B' && arr[i+1] == 'G'){
                    char temp = arr[i];
                    arr[i] = arr[i+1] ;
                    arr[i+1] = temp;
                    i++;
                }
            }
            round--;
        }



        System.out.println(arr);
        sc.close();



    }


}
