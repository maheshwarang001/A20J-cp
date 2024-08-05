package org.example.lvl2_900_1200;

import java.util.Scanner;

public class MathematicalProblem {


    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);
        sc.close();



    }
    public static void solveT(Scanner sc){


        int n = sc.nextInt();

        String str = sc.next();

        //zeros

        long ans = (int)1e9+7;
        int flag = 0;

        if(n == 2){
            System.out.println(Integer.parseInt(str));
        }
        else{

            for(int i = 0 ; i < n-1 ; i++){


                // take the 2 digit
                int v = (10 * Character.getNumericValue(str.charAt(i)))  + Character.getNumericValue(str.charAt(i+1));
                //System.out.println(v);
                int sum = 0;

                for(int j = 0 ; j  < i ; j++){


                    if(Character.getNumericValue(str.charAt(j)) == 0){
                        System.out.println(0);
                        flag = 1;
                        break;
                    }

                    if(Character.getNumericValue(str.charAt(j)) >= 2){
                        sum += Character.getNumericValue(str.charAt(j));
                    }
                }


                if(flag == 1) break;


                for(int j = i+2 ; j < n ; j++){


                    if(Character.getNumericValue(str.charAt(j)) == 0){
                        System.out.println(0);
                        flag = 1;
                        break;
                    }

                    if(Character.getNumericValue(str.charAt(j)) >= 2){
                        sum += Character.getNumericValue(str.charAt(j));
                    }
                }


                if(flag == 1) break;

               // System.out.println(sum);
                if(v == 1 && sum > 0) v = sum;
                else v += sum;
                ans = Math.min( ans,v );

            }
            if(flag == 0)System.out.println(ans);
        }






    }
}
