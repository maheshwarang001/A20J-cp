package org.example.div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Shower {
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
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());


        if( m > d){
            pw.println("NO");
        }else {

            int[][] record = new int[n][2];

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine().trim());

                record[i][0] = Integer.parseInt(st.nextToken());
                record[i][1] = Integer.parseInt(st.nextToken());

            }

            int flag  =0;
            for(int  i =  0 ; i < n ; i++){


                //first

                if(i == 0 ){
                    if(record[i][0] - m >= 0){
                        pw.println("YES");
                        flag = 1;
                        break;
                    }

                }

                else{

                    if(record[i][0] - m >= record[i-1][1]){
                        pw.println("YES");
                        flag = 1;
                        break;
                    }
                }

            }

            //last

            if(flag != 1 && record[n-1][1] + m <= d ){
                pw.println("YES");
            }else if(flag != 1){
                pw.println("NO");

            }
        }


    }
}
