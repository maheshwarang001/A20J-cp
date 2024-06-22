package org.example.bit;

import java.util.Scanner;

public class CirnoPerfectBitmasksClassroom {

    public static void main(String[] args) {

        int x = 1;

        System.out.println((x<<2));
    }


//    public static void main(String[] args) {
//
//
//        Scanner sc = new Scanner(System.in);
//
//        int t = sc.nextInt();
//
//        while(t-- > 0){
//
//            int x = sc.nextInt();
//            long ans = 0;
//            for(int i = 0 ; i <= 31 ; i++){
//
//                if( (x &(1<<i)) != 0){
//                    //Least significant bit
//                    ans = (long) Math.pow(2,i);
//                    break;
//                }
//            }
//
//            if((x&(1)) != 0){
//                if(x == 1){
//                    System.out.println(3);
//                }else{
//                    System.out.println(ans);
//                }
//            }
//            else{
//
//                if(Integer.bitCount(x) > 1){
//                    System.out.println(ans);
//                }else {
//                    ans++;
//                    System.out.println(ans);
//                }
//            }
//        }
//    }



//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//
//        while (t-- > 0) {
//
//            String str = sc.next();
//
//            int count = (int) str.chars().filter(c-> c == '0').count();
//
//            if(count == 0 ){
//                System.out.println(0);
//
//            }
//            else if( str.lastIndexOf('0') - str.indexOf('0') + 1 == count){
//                System.out.println(1);
//
//            }else if(count >= 2){
//                System.out.println(2);
//            }else{
//                System.out.println(count);
//            }
//
//
//        }
//    }

//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        int t = sc.nextInt();
//
//        while(t-- > 0){
//
//            int n = sc.nextInt();
//
//            int max=  0;
//
//            for(int i = 1 ; i < n ; i++){
//                max = Math.max(max, sc.nextInt());
//            }
//            int ans = max + sc.nextInt();
//            System.out.println(ans);
//        }
//    }
}
