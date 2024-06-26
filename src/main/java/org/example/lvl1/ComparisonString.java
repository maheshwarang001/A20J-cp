package org.example.lvl1;

import java.util.Scanner;

public class ComparisonString {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();

            String str = sc.next();


            int len = 1;
            int ans = 0;

            for(int i = 1 ; i < n ; i++){

                if(str.charAt(i-1) == str.charAt(i)){
                    len++;
                }else{
                    len = 1;
                }
                ans = Math.max(len,ans);
            }
            System.out.println(ans+1);




        }

    }

}
