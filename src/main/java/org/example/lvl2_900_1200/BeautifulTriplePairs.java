package org.example.lvl2_900_1200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class BeautifulTriplePairs {

    static BufferedReader br;
    static PrintWriter pw;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader( new InputStreamReader(System.in));
        pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0) solve();

        br.close();
        pw.close();

    }



    public static void solve() throws IOException {


        int n = Integer.parseInt(br.readLine().trim());

        int [] nums  =new int[n];

        st = new StringTokenizer(br.readLine().trim());

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Map<String, Long> map = new HashMap<>();

        long count =0;

        for(int i = 0 ; i < n - 2 ; i++){

            int a = nums[i];
            int b = nums[i+1];
            int c = nums[i+2];


            String one = a + " " + b + " "+ -1;
            String two = a + " " + -1 + " "+ c;
            String three = -1 + " " + b + " "+ c;
            String four = a + " " + b + " " + c;


            count +=
                    map.getOrDefault(one,0L) +
                            map.getOrDefault(two,0L)+
                            map.getOrDefault(three,0L)
                            - (3 *map.getOrDefault(four,0L)) ;


            map.put(one,map.getOrDefault(one,0L)+1);
            map.put(two,map.getOrDefault(two,0L)+1);
            map.put(three,map.getOrDefault(three,0L)+1);
            map.put(four,map.getOrDefault(four,0L)+1);
        }

        pw.println(count);
    }
}
