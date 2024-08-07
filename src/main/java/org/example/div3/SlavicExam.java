package org.example.div3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class SlavicExam {
    static BufferedReader br;
    static PrintWriter pw;
    static StringTokenizer st;

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

        String a = br.readLine();
        String b = br.readLine();

        if (a.length() < b.length()) {
            pw.println("NO");
            return;
        }

        StringBuilder aBuilder = new StringBuilder(a);
        int c = 0;
        for (int i = 0; i < aBuilder.length() && c < b.length(); i++) {
            if (aBuilder.charAt(i) == b.charAt(c)) {
                c++;
            } else if (aBuilder.charAt(i) == '?') {
                aBuilder.setCharAt(i, b.charAt(c));
                c++;
            }
        }

        if (c == b.length()) {
            pw.println("YES");
            for (int i = 0; i < aBuilder.length(); i++) {
                pw.print((aBuilder.charAt(i) == '?') ? 'x' : aBuilder.charAt(i));
            }
            pw.println();
        } else {
            pw.println("NO");
        }
    }
}
