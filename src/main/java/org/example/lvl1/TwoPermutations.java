package org.example.lvl1;

import java.util.Scanner;

public class TwoPermutations {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(n == x && x == y ){
                System.out.println("YES");
            }else{

                int sum = n - (x+y);

                if(sum >= 2){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }


        }

    }
}
