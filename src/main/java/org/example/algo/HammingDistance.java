package org.example.algo;

import java.util.Scanner;

public class HammingDistance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a1 = sc.next();
        String a2 = sc.next();

        if (a1.length() != a2.length()) {
            System.out.println("Error: Strings must be of equal length");
            sc.close();
            return;
        }

        int hammingDistance = 0;
        for (int i = 0; i < a1.length(); i++) {
            if (a1.charAt(i) != a2.charAt(i)) {
                hammingDistance++;
            }
        }

        System.out.println(hammingDistance);
        sc.close();
    }
}
