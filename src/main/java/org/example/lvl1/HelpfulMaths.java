package org.example.lvl1;

import java.util.Scanner;

public class HelpfulMaths {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        if (str.length() == 1) {
            System.out.println(str);
            return;
        }

        String[] array = str.split("\\+");

        mergeSort(0, array.length - 1, array);

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + "+");
            }
        }
    }

    static void mergeSort(int left, int right, String[] arr) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(left, mid, arr);
            mergeSort(mid + 1, right, arr);
            merge(left, mid, right, arr);
        }
    }

    static void merge(int left, int mid, int right, String[] arr) {
        String[] temp = new String[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (Integer.parseInt(arr[i]) <= Integer.parseInt(arr[j])) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = left; i <= right; i++) {
            arr[i] = temp[i - left];
        }
    }
}
