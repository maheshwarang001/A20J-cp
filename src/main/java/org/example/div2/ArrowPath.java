package org.example.div2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrowPath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            solveT(sc);
        }

        sc.close();
    }
    static Map<String,Boolean> map;

    public static void solveT(Scanner sc) {
        int n = 2;
        int m = sc.nextInt();

        char[][] matrix = new char[n][m];

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < m; j++) {
                matrix[i][j] = str.charAt(j);
            }
        }



        boolean[][] visited = new boolean[n][m];
        boolean ans = helper(0, 0, matrix, visited,0);
        System.out.println(ans ? "YES" : "NO");
    }

    public static boolean helper(int i, int j, char[][] matrix, boolean[][] visited, int flag) {
        int n = matrix.length;
        int m = matrix[0].length;

        if (i == n - 1 && j == m - 1) {
            return true;
        }

        if (i < 0 || i >= n || j < 0 || j >= m || visited[i][j]) {
            return false;
        }

        visited[i][j] = true;
        boolean ans = false;

        if(flag == 0){
            ans = helper(i+1,j,matrix,visited,1) || helper(i-1,j,matrix,visited,1)
                    || helper(i,j-1,matrix,visited,1) || helper(i,j+1,matrix,visited,1);
        }else{

            if(matrix[i][j] == '>'){
                ans = helper(i,j+1,matrix,visited,0);
            }else{
                ans = helper(i,j-1,matrix,visited,0);
            }
        }

        //visited[i][j] = false;


        return ans;
    }

}
