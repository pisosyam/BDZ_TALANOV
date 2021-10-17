package com.company;

import java.util.Scanner;

public class NUM6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int new_num = in.nextInt();
        int[] a = new int[100];
        Scanner nn = new Scanner(System.in);
        for(int j = 0; j < new_num; j++){
            a[j] = nn.nextInt();
        }
        int max = -999999999;
        for (int i = 0; i < a.length; i++){
            if (a[i] > max && Math.abs(a[i] % 100) == 11) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
