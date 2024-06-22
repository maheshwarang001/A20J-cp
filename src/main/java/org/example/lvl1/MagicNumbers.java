package org.example.lvl1;

import java.util.Scanner;

public class MagicNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        String str = String.valueOf(input);

        for (int i = 0; i < str.length(); ) {

            if (i <= str.length() - 3 && str.charAt(i) == '1' && str.charAt(i + 1) == '4' && str.charAt(i + 2) == '4') {
                i += 3;
            } else if (i <= str.length() - 2 && str.charAt(i) == '1' && str.charAt(i + 1) == '4') {
                i += 2;
            } else if (str.charAt(i) == '1') {
                i++;
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
