package org.example.striver;

import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solve(sc);

    }

    public static void solve(Scanner sc){

        int x = 0;

        int t = sc.nextInt();

        while(t-- > 0){

            String str = sc.next();

            if(str.equals("++X") || str.equals("X++")){
                x++;
            }else{
                x--;
            }
        }
        System.out.println(x);

    }


}
