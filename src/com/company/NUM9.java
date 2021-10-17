package com.company;

import java.util.Scanner;

public class NUM9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = Integer.toString(in.nextInt());
        int a = 1;
        for (int i = 0; i < n.length() / 2; i++){
            if (n.charAt(i) != n.charAt(n.length() - i - 1)){
                a = 0;
            }
        }
        if (a == 1) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
