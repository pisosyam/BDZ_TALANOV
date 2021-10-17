package com.company;

import java.util.Scanner;

public class NUM8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 2;
        while (i * i <= n){
            while (n % i == 0) {
                System.out.print(i + "*");
                n = n / i;
            }
            i++;
        }
        if (n > 1){
            System.out.print(n);
        }
    }
}
