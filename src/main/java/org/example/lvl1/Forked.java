package org.example.lvl1;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Forked {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solveT(sc);
        sc.close();
    }

    public static void solveT(Scanner sc) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int kx = sc.nextInt();
            int ky = sc.nextInt();
            int qx = sc.nextInt();
            int qy = sc.nextInt();

            int[][] dirs = {{a, b}, {a, -b}, {-a, b}, {-a, -b}, {b, a}, {b, -a}, {-b, a}, {-b, -a}};

            Set<Position> set = new HashSet<>();
            Set<Position> set2 = new HashSet<>();

            int count = 0;

            // King moves
            for (int[] dir : dirs) {
                int x = dir[0] + kx;
                int y = dir[1] + ky;
                set.add(new Position(x, y));

                x = dir[0] + qx;
                y = dir[1] + qy;
                set2.add(new Position(x, y));

            }

            for(Position p : set){
                if(set2.contains(p)){
                    count++;
                }
            }

            System.out.println(count);


        }
    }


    static class Position {
        int x, y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
