package org.example.div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class SplitTheSet {


    static BufferedReader br;
    static PrintWriter pw;

    static StringTokenizer st;
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

        int element = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());


       List<Integer> nums = new ArrayList<>();

       nums.add(element);
       int count= 0;


       while(nums.size() < element){
           int cur = nums.remove(nums.size()-1);

           for (int i = 0; i < Math.min(d-1 , cur-1 ); i++) {
               nums.add(1);
           }
           nums.add(cur - d + 1);
           count++;
       }
       pw.println(count);

    }


}
