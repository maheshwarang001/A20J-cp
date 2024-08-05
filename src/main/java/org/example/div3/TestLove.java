package org.example.div3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TestLove  {


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

        int n = st.countTokens();
        int m = st.countTokens(); // can jump max
        int k = st.countTokens(); //can swim max

        st = new StringTokenizer(br.readLine().trim());

        String str = st.nextToken();

        char [] ch = str.toCharArray();



    }

//    public static boolean helper(int idx, char [] ch , int n, int m, int k){
//
//        if(idx == ch.length) return true;
//        if(idx >= ch.length+1 || ch[idx] == 'C' ) return false;
//
//
//
//
//
//
//
//
//
//    }






}
