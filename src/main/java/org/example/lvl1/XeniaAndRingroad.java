package org.example.lvl1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class XeniaAndRingroad {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int [] task = new int[m];

        for(int i = 0 ; i < m ; i++){
            task[i] = sc.nextInt();
        }

        long count = 0;
        long steps = 1;

        for(int i = 0 ; i < m ; i++){

            if( steps <= task[i]){
                count +=  task[i] - steps;
            }
            else{
                count += n - ( steps - task[i]);
            }
            steps = task[i];
        }
        System.out.println(count);

    }
}
