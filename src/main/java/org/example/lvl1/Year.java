package org.example.lvl1;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;


public class Year {

   public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int year = scanner.nextInt();
            int nextYear = findNextDistinctYear(year);
            System.out.println(nextYear);
        }

        public static int findNextDistinctYear(int year) {
            year++;
            while (!hasDistinctDigits(year)) {
                year++;
            }
            return year;
        }

        public static boolean hasDistinctDigits(int year) {
            String yearStr = String.valueOf(year);
            Set<Character> digits = new HashSet<>();
            for (char digit : yearStr.toCharArray()) {
                if (!digits.add(digit)) {
                    return false;
                }
            }
            return true;
        }
}


