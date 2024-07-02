package org.example.div2;

import java.util.Scanner;

public class SubstringAndSubsequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    public static void solve(Scanner sc) {
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {

            String a = sc.next();
            String b = sc.next();

            int min = (int)1e9;

            for(int i = 0 ; i  < b.length() ; i++){

                int temp = i;

                for(int j = 0 ; j < a.length() ; j++ ){

                    if(temp < b.length() && a.charAt(j) == b.charAt(temp) ){
                        temp++;
                    }
                }
                min = Math.min(min, a.length() + b.length() - temp+i);
            }
            System.out.println(min);
        }
    }
}
