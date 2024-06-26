package org.example.lvl1;

import java.util.Scanner;

public class DoremyPaint3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solveT(sc);
    }

    public static void solveT(Scanner sc) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int prev = 0;
            int flag = 0;
            for (int i = 0; i < n; i++) {

                if(i ==  0 ){
                    prev += sc.nextInt();
                }
                else{

                    int next = sc.nextInt();

                    if(prev != next){
                        System.out.println("NO");
                        flag = 1;
                        break;
                    }else{
                        prev += next;

                    }
                }

            }
            if(flag!=1)System.out.println("YES");


        }
    }
}
