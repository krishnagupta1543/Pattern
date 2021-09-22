package com.company;
import java.util.*;
public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r;
        r = in.nextInt();
        for(int i = r; i > 0; i--)
        {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
