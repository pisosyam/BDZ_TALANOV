package com.company;
import java.util.Scanner;
public class NUM3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int new_num = in.nextInt();
        int[] a = new int[100];
        int count = 0;
        while(new_num != 0 ){
            a[count] = new_num;
            count++;
            new_num = in.nextInt();
        }
        int max = 0;
        int sum = 0;
        for(int j = 0; j < a.length; j++) {
            sum += a[j];
        }
        // цикл первого max;
        for(int j = 0; j < a.length; j++) {
            int k = a[j];
            if (k * k < sum){
                max = k;
                break;
            }
        }
        for(int j = 0; j < a.length; j++){
            int k = a[j];
            if(k > max && k * k <= sum){
                max = k;
            }
        }
        System.out.println(max);

    }
}
