package org.example.div2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductOfBinaryDecimals {

    static List<Integer> binary;

    public static void main(String[] args) {


        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        binary = new ArrayList<>();

        for(int i = 10 ; i <= (int) 1e5 ; i++){
            if(checker(i)){
                binary.add(i);
            }
        }

        while(t-- > 0) solveT(sc);


    }

    public static boolean checker(int x){
        while(x > 0){
            if(x % 10 == 0 || x % 10 == 1){
                x = x/10;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void solveT(Scanner sc){

        int x = sc.nextInt();
        int flag = 0;
        if(binary.contains(x)){
            System.out.println("YES");
        }else {
            while (x > 1) {
                boolean divided = false;
                for (int binaryNumber : binary) {
                    if (x % binaryNumber == 0) {
                        x /= binaryNumber;
                        divided = true;
                        break;
                    }
                }
                if (!divided) {
                    System.out.println("NO");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) System.out.println("YES");
        }


    }
}
