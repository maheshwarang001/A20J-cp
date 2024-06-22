package org.example.striver;

import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solve(sc);

    }

    public static void solve(Scanner sc){

        int n = sc.nextInt();
        int m = sc.nextInt();

        int flag = 0;
        int dir = 0;
        for(int i  = 0 ; i < n ; i++ ){

            for(int j = 0 ; j < m ; j++){

                if(flag == 0){
                    System.out.print("#");
                }else{

                    if( dir == 0 &&  j == m-1){
                        System.out.print("#");
                    }else if(dir == 1 && j == 0){
                        System.out.print("#");
                    }else{
                        System.out.print(".");
                    }
                }
            }
            if(flag == 1){
                dir = 1-dir;
            }
            flag = 1 - flag;
            System.out.println();
        }

    }

}
