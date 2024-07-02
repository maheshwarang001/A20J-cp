package org.example.div2;

import java.util.*;

public class MinPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solveT(sc);
    }

    public static void solveT(Scanner sc) {
        int t = sc.nextInt();
        while (t-- > 0) {
            String str = sc.next();
            Map<Character, Integer> map = new HashMap<>();
            Set<Character> set = new TreeSet<>();

            for (int i = 0; i < str.length(); i++) {
                map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
                set.add(str.charAt(i));
            }

            char[] arr = new char[str.length()];

            int idx = 0;

            for (Character ch : set) {
                int count = map.get(ch);
                if (count == 1) {
                    arr[idx] = ch;
                    idx++;
                } else {
                    while (count > 0) {
                        if (count == 1) {
                            arr[idx] = ch;
                            count--;
                        } else {
                            arr[idx] = ch;
                            arr[str.length() - idx - 1] = ch;
                            count -= 2;
                        }
                        idx++;
                    }
                }
            }

            for (char ch : arr) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
