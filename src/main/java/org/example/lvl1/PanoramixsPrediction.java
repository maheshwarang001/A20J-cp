package org.example.lvl1;

import java.util.Arrays;
import java.util.Scanner;
public class PanoramixsPrediction {

    public static boolean[] createSieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();

        boolean[] primes = createSieve(second);

        if(primes[first] && primes[second]) {
            int count = 0;
            for (int num = first + 1; num <= second; num++) {
                if (primes[num]) {
                    count++;
                }
            }

            System.out.println(count == 1 ? "YES" : "NO");
        }else{
            System.out.println("NO");
        }
    }
}