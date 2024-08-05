package org.example.lvl2_900_1200;

import java.io.*;
import java.util.StringTokenizer;

public class Ingenuity2 {

    static BufferedReader br;
    static PrintWriter pw;
    public static void main(String[] args) throws IOException {

        br = new BufferedReader( new InputStreamReader(System.in));
        pw = new PrintWriter(System.out);


        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0) solveT();

        br.close();
        pw.close();


    }

    public static void solveT() throws IOException {

        int p = Integer.parseInt(br.readLine().trim());
        String str = br.readLine().trim();

        int x = 0;
        int y = 0;
        for(char c: str.toCharArray()){

            if(c == 'N') y++;
            else if(c == 'E') x++;
            else if( c == 'S') y--;
            else x--;
        }

        if(Math.abs(x) % 2 == 1 || Math.abs(y) % 2 == 1) pw.println("NO");
        else if(p == 2 && x == 0 && y == 0) pw.println("NO");
        else{



            int n = 0;
            int s = 0 ;
            int e = 1;
            int w = 1;

            char []options = new char[]{'R','H'};
            StringBuilder ans  = new StringBuilder();
            for(char c: str.toCharArray()){

                if(c == 'N'){
                    ans.append(options[n]);
                    n = 1- n;
                }
                else if(c == 'E'){
                    ans.append(options[e]);
                    e = 1- e;
                }
                else if( c == 'S'){
                    ans.append(options[s]);
                    s = 1- s;
                }
                else{
                    ans.append(options[w]);
                    w = 1- w;
                }
            }

            pw.println(ans);
        }

    }


}