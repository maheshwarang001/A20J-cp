package org.example.div3;
import java.util.*;

public class Strings {

        static long binaryExpRecur(long base, long exponential) {
            final long MOD = 1000000000;

            if (exponential == 0) {
                return 1;
            }

            long half = binaryExpRecur(base, exponential / 2);
            long halfsquare = (half * half) % MOD;

            if (exponential % 2 != 0) {
                return (halfsquare * base) % MOD;
            } else {
                return halfsquare;
            }
        }

        static long binaryExpItr(long base , long exponential){
            long ans = 1;
            final int MOD = (int) 1e9;

            while(exponential != 0){
                if((exponential & 1) != 0){
                    ans = (ans * base) % MOD;
                }
                base  = (base * base) % MOD;
                exponential >>= 1;
            }
            return (ans)  % MOD;
        }


        public static void main(String[] args) {

            Scanner sc =  new Scanner(System.in);
            solveT(sc);


        }
        public static void solveT(Scanner sc){

            int t = sc.nextInt();

            while (t-- > 0){


                int n = sc.nextInt();
                int m = sc.nextInt();
                sc.nextLine();

                String s = sc.nextLine();


                int[] x = new int[m];
                for (int i = 0; i < m; i++) {
                    x[i] = sc.nextInt();
                }
                sc.nextLine();
                String p = sc.nextLine();


                for (int i = 0; i < m; i++) {
                    x[i]--;
                }


                Arrays.sort(x);


                char[] tArray = p.toCharArray();
                Arrays.sort(tArray);


                char[] sArray = s.toCharArray();

                int cur = 0;
                for (int i = 0; i < m; i++) {
                    if (i == 0 || x[i] > x[i - 1]) {
                        sArray[x[i]] = tArray[cur];
                        cur++;
                    }
                }

                String result = new String(sArray);
                System.out.println(result);


            }

        }

        public static void solve(Scanner sc){


        }


}
