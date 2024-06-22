package org.example.striver;

import java.util.Scanner;

public class ChewAndNumber {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solve(sc);

    }

    public static void solve(Scanner sc){

        long x = sc.nextLong();

        String str = String.valueOf(x);
        char [] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            int digit = ch[i] - '0';

            if (digit > 4 && !(i == 0 && digit == 9)) {
                digit = 9 - digit;
                ch[i] = (char) (digit + '0');
            }
        }
        str = new String(ch);
        System.out.println(str);


    }
}
