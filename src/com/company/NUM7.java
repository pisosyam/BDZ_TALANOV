package com.company;

import java.util.Scanner;

public class NUM7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for (int i = 1; i <= m; i++){ //вертикаль
            System.out.print(i + " ");
            for (int j = i * 2; j <= i * n; j += i){ //горизонталь
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
