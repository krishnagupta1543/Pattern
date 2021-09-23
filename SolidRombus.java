package com.company;

import java.util.Scanner;

public class SolidRombus {
    public static void main(String[] args)
    {
        /*

            *****
           *****
          *****
         *****
        *****

         */

        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 5; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
