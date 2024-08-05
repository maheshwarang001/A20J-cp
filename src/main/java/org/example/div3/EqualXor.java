package org.example.div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class EqualXor {

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
    public static void solve()throws Exception{

        st = new StringTokenizer(br.readLine().trim());

        int n = Integer.parseInt(st.nextToken());
        int k = 2* Integer.parseInt(st.nextToken());


        int[] left = new int[n];
        int[] right = new int[n];

        st = new StringTokenizer(br.readLine().trim());



        for(int i = 0 ; i < n ; i++){
            left[Integer.parseInt(st.nextToken())-1]++;
        }
        for(int i = 0 ; i < n ; i++){
            right[Integer.parseInt(st.nextToken())-1]++;
        }

        List<Integer> leftAns = new ArrayList<>();
        List<Integer> rightAns = new ArrayList<>();



        //loop for all twos;

        for(int i = 0 ; i < n ; i++){

            if(left[i] == 2){
                leftAns.add(i);
                leftAns.add(i);
            }

            if(right[i] == 2){
                rightAns.add(i);
                rightAns.add(i);
            }

        }
        //get all 1
        for(int i = 0 ; i < n ; i++){

            if(left[i] == 1){
                leftAns.add(i);
                rightAns.add(i);
            }
        }

        for(int i = 0 ; i < k ; i++){
            pw.print(leftAns.get(i)+1 + " ");
        }
        pw.println();
        for(int i = 0 ; i < k ; i++){
            pw.print(rightAns.get(i)+1 + " ");
        }
        pw.println();




    }
}
