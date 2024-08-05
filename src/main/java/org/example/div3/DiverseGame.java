package org.example.div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DiverseGame {

    static BufferedReader br;
    static PrintWriter pw;

    static StringTokenizer st;

    public static void swapDigit(int a, int b, int[][] nums, int i){
        nums[i][a] = nums[i][a]^nums[i][b];
        nums[i][b] = nums[i][a]^nums[i][b];
        nums[i][a] = nums[i][a]^nums[i][b];
    }
    public static void main(String[] args) throws Exception {

        br = new BufferedReader( new InputStreamReader(System.in));
        pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0) solve();

        br.close();
        pw.close();

    }
    public static void solve() throws Exception{

        st = new StringTokenizer(br.readLine().trim());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] a = new int[n][m];
        int [][]b = new int[n][m];

        for(int i = 0 ; i < n ; i++){
            st = new StringTokenizer(br.readLine().trim());
            for(int j = 0 ; j  < m ; j++ ){
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n-1; i++) {
            int temp = a[i+1][0];
            for (int j = 0; j < m-1; j++) {
                b[i][j] = a[i+1][j+1];
            }
            b[i][m-1] = temp;
        }
        for (int i = 0; i < 1; i++) {
            int temp = a[i][0];
            for (int j = 0; j < m-1; j++) {
                b[n-1][j] = a[i][j+1];
            }
            b[n-1][m-1] = temp;
        }


        if(Arrays.deepEquals(a, b)) pw.println(-1 );
        else {

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    pw.print(b[i][j] + " ");
                }
                pw.println();
            }


        }



    }
}
