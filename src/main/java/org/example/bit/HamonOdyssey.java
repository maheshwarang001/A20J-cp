package org.example.bit;

import java.util.Scanner;

public class HamonOdyssey {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            long n = sc.nextLong();

            long count = 0;
            long a = -1;

            if(n == 1){
                System.out.println(1);
            }
            else {

                for (long i = 0; i < n; i++) {
                    if (a == -1) {
                        a = sc.nextLong();
                    } else {
                        a = a & sc.nextLong();

                        if (a == 0) {
                            count++;
                            if(i+1 < n){
                                a = -1;
                            }else{
                                a = 0;
                            }

                        }
                    }
                }

                System.out.println(count == 0 ? 1 : count);
            }
        }
    }
}
