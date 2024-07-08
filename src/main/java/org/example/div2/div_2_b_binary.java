package org.example.div2;

import java.util.*;
import java.util.Scanner;

public class div_2_b_binary {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);


    }
    public static void solveT(Scanner sc){

        int x = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        while(x != 0){
            list.add(x&1);
            x = x >> 1;
        }

        for(int i = 0 ; i < list.size() ; i++){

            int b = list.get(i);

            if(b == 1){
                int j = i+1;

                while(j  < list.size()){
                    int c = list.get(j);
                    if(c == 0) break;
                    list.set(j,0);
                    j++;
                }
                if(j != i+1){
                    list.set(i,-1);

                    if(j == list.size()){
                        list.add(1);
                    }else{
                        list.set(j,1);
                    }


                }
                i = j-1;
            }
        }

        System.out.println(list.size());
        for(int i : list) System.out.print(i+" ");
        System.out.println();



    }
}
