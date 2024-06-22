package org.example.Math;

import java.util.Scanner;

public class FloorNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    public static void solve(Scanner sc) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int rooms = sc.nextInt();
            int roomsPerFloor = sc.nextInt();

            int ans = 0;


            if (rooms <= roomsPerFloor) {
                ans = 1;
            } else {
                rooms -= roomsPerFloor;
                ans = 1 + (int) Math.ceil((double) rooms / roomsPerFloor);
            }

            System.out.println(ans);
        }
    }
}
