package com.company;
import java.util.Scanner;
public class NUM2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        float mid_num = 0;
        Scanner nn = new Scanner(System.in);
        int c = nn.nextInt();
        int max_num = c;
        mid_num += c;
        for(int i = 2; i <= n; i++){
            int r = nn.nextInt();
            if (max_num < r){
                max_num = r;
            }
            mid_num += r;
        }
        mid_num /= n;
        System.out.print(max_num + " ");
        System.out.print(mid_num);

    }
}
