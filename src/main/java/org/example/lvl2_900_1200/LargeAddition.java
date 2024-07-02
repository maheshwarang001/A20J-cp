package org.example.lvl2_900_1200;

import java.util.Scanner;

public class LargeAddition {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            String a = sc.next();
            int n = a.length();
            if(a.charAt(n-1) == '9' || a.charAt(0) != '1'){
                System.out.println("NO");

            }else{

                int flag = 1;

                for(int i = 0 ; i  < n-1 ; i++ ){
                    if (a.charAt(i) == '0') {
                        flag = 0;
                        break;
                    }
                }

                System.out.println(flag == 1 ? "YES":"NO");

            }


        }

    }
}
