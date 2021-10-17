package com.company;

import java.util.Scanner;

public class NUM4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int new_num = in.nextInt();
        int[] a = new int[100];
        int count = 0;
        while (new_num != 0) {
            a[count] = new_num;
            count++;
            new_num = in.nextInt();
        }
        int[] max = new int[5];
        max[0] = -10000000;
        max[1] = -10000000;
        max[2] = -10000000;
        max[3] = -10000000;
        max[4] = -10000000;
        int i;
        for (i = 0; i < a.length; i++){
            if (a[i] > max[0]){
                max[0] = a[i];
            }
        }
        for (int j = 1; j < 5; j++){
            for(i = 0; i < a.length; i++){
                if (a[i] > max[j] && a[i] < max[j-1]){
                    max[j] = a[i];
                }
            }
        }
        for (i = 0; i < 5; i++){
            System.out.print(max[i] + " ");
        }
    }
}