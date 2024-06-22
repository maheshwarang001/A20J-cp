package org.example.lvl1;

import java.util.Scanner;

public class Parallelepiped {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A1 = sc.nextInt();
        int A2 = sc.nextInt();
        int A3 = sc.nextInt();

        int a = (int) Math.sqrt((double) (A1 * A3) / A2);
        int b = (int) Math.sqrt((double) (A1 * A2) / A3);
        int c = (int) Math.sqrt((double) (A2 * A3) / A1);

        int surfaceArea = 4 * (a + b + c);

        System.out.println(surfaceArea);
    }
}
