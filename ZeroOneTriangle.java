package com.company;
import java.util.*;
public class ZeroOneTriangle {
    public static void main(String[] args) {
        /*

        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1
        0 1 0 1 0 1

        */

        Scanner in = new Scanner(System.in);
        int n;
        int i1= 1;
        int i2 = 0;
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if((i+j)%2 == 0)
                {
                    System.out.print(i1);
                }
                else{
                    System.out.print(i2);
                }
            }
            System.out.println();
        }

    }
}
