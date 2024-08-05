package org.example.div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Sort {

    static BufferedReader br;
    static StringTokenizer st;
    static PrintWriter pw;

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) solve();

        br.close();
        pw.close();
    }

    public static void solve() throws Exception {
        st = new StringTokenizer(br.readLine().trim());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        String a = br.readLine();
        String b = br.readLine();

        int[][] p = new int[a.length() + 1][27];
        int[][] q = new int[a.length() + 1][27];

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < 26; j++) {
                p[i + 1][j] = p[i][j];
                q[i + 1][j] = q[i][j];
            }
            p[i + 1][a.charAt(i) - 'a']++;
            q[i + 1][b.charAt(i) - 'a']++;
        }

        while (k-- > 0) {
            st = new StringTokenizer(br.readLine().trim());
            int l = Integer.parseInt(st.nextToken()) - 1;
            int r = Integer.parseInt(st.nextToken()) - 1;

            int count = 0;

            int[] x = new int[26];
            int[] y = new int[26];

            for (int i = 0; i < 26; i++) {
                x[i] = p[r + 1][i] - p[l][i];
                y[i] = q[r + 1][i] - q[l][i];
            }

            for (int i = 0; i < 26; i++) {
                count += Math.abs(x[i] - y[i]);
            }

            pw.println(count / 2);
        }
    }
}
