package org.example.div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class AngryMonk {

    static BufferedReader br;
    static PrintWriter pw;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) solve();

        br.close();
        pw.close();
    }

    public static void solve() throws IOException {

        st = new StringTokenizer(br.readLine().trim());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine().trim());

        for (int i = 0; i < k; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }


        Collections.sort(list);


        int count = 0;

        for (int i = 0; i < k-1 ; i++) {
            if (list.get(i) == 1 ) {
                count++;
            } else {
                count += (2 * list.get(i))-1;
            }
        }


        pw.println(count);
    }
}
