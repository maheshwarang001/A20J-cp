package org.example.div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CardGame {

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

        int n = 4;

        int [] pairA = new int[2];
        int [] pairB = new int[2];

        st = new StringTokenizer(br.readLine().trim());


        for(int i = 0 ; i  < 4 ; i++){
            if(i < 2){

                pairA[i] = Integer.parseInt(st.nextToken());
            }
            else{
                pairB[i%2] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] rounds =
                {
                {pairA[0], pairB[0], pairA[1], pairB[1]},
                {pairA[0], pairB[1], pairA[1], pairB[0]},
                {pairA[1], pairB[0], pairA[0], pairB[1]},
                {pairA[1], pairB[1], pairA[0], pairB[0]}
        };
        int c = 0;
        for(int [] round : rounds){
            int a = 0;
            int b = 0;

            if(round[0] > round[1]) a++;
            else if(round[0] < round[1])b++;

            if(round[2] > round[3])a++;
            else if(round[2] < round[3])b++;

            if(a>b)c++;
        }

        pw.println(c);






    }
}
