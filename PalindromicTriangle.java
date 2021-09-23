package com.company;

import java.util.Scanner;

public class PalindromicTriangle {
    public static void main(String[] args) {
      /*
         1
        212 
       32123
      4321234
     543212345

       */
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            int c = i;
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = c; k > 1; k--) {
                System.out.print(k+"");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print(l+"");
            }
            System.out.println();
        }
    }
}
