package org.example.lvl1;

import java.util.Scanner;

public class UltraFastMathematician {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        for(int i = 0 ; i <s1.length() ; i++){
            if(s1.charAt(i) == s2.charAt(i)){
                System.out.print("0");
            }else{
                System.out.print("1");
            }
        }
    }
}
