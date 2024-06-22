package org.example.striver;

import java.util.Arrays;
import java.util.Scanner;

public class MeetingFriends {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solve(sc);

    }

    public static void solve(Scanner sc){

        int [] num = new int[3];

        for(int i = 0  ; i < 3 ; i++){
            num[i] = sc.nextInt();
        }

        Arrays.sort(num);

        int ans = (num[1] - num[0]) + (num[2] - num[1]);
        System.out.println(ans);

    }

}
