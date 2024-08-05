package org.example.lvl2_900_1200;

import java.util.Scanner;

public class TwoMovies {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);
        sc.close();



    }
    public static void solveT(Scanner sc){


        int n = sc.nextInt();
        int[] person1 = new int[n];
        int[] person2 = new int[n];

        for(int i = 0  ; i < n  ;i++){
            person1[i] = sc.nextInt();
        }
        for(int i = 0  ; i < n  ;i++){
            person2[i] = sc.nextInt();
        }


        int x = 0;
        int y = 0;
        int neg = 0;
        int pos= 0;

        for(int i = 0 ; i < n ; i++){

            if(person1[i] < person2[i]){
                y+=person2[i];
            }else if(person1[i] > person2[i]){
                x+=person1[i];
            }
            else{

                if(person1[i] == -1){
                    neg++;
                }else if(person1[i] == 1){
                    pos++;
                }
            }
        }

        int ans = -2 * (int)1e5+1;

        for(int i = neg * -1; i <= pos ; i++){
            ans = Math.max(ans, Math.min(x+i , y + (pos-neg-i)));
        }

        System.out.println(ans);


    }
}
