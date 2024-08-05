package org.example.div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Scale {

    static BufferedReader br;
    static PrintWriter pw;

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            solve();
        }

        br.close();
        pw.close();
    }

    public static void solve() throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        char[][] grid = new char[n][n];

        for (int i = 0; i < n; i++) {
            String in = br.readLine().trim();
            for (int j = 0; j < n; j++) {
                grid[i][j] = in.charAt(j);
            }
        }

        for (int i = 0; i < n; i += k) {
            for (int j = 0; j < n; j += k) {
                pw.print(grid[i][j]);
            }
            pw.println();
        }
    }
}
