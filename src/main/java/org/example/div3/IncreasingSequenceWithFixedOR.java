package org.example.div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IncreasingSequenceWithFixedOR {


    static BufferedReader br;
    static PrintWriter pw;
    public static void main(String[] args) throws Exception {

        br = new BufferedReader( new InputStreamReader(System.in));
        pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0) solve();

        br.close();
        pw.close();

    }
    public static void solve() throws Exception{

        long n = Long.parseLong(br.readLine().trim());

        List<Long> list = new ArrayList<>();
        list.add(n);

        for(int i = 0 ; i <= 60 ; i++){

            if((n & (1L << i)) != 0){

                long t = (1L <<i);

                if(n - t  > 0){
                    list.add(n-t);
                }

            }
        }
        Collections.sort(list);

        pw.println(list.size());

        for(long i : list){
            pw.print(i + " ");
        }
        pw.println();



    }
}
