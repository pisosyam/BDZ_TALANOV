package com.company;

import java.util.Scanner;

public class NUM5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        Scanner nn = new Scanner(System.in);
        String k = "";
        int i;
        for (i = 0; i < n; i++){
            int new_num = nn.nextInt();
            int firstDigit = Integer.parseInt(Integer.toString(new_num).substring(0, 1));
            k += firstDigit;
        }
        System.out.println(k);
    }
}
