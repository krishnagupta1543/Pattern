package com.company;
import java.util.*;
public class HalfPyramidWithNumbers {
    public static void main(String [] args)
    {
        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        */
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
