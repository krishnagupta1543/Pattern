package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// Solid Rectangle problem pattern
        /*

        *****
        *****
        *****
        *****

         */
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
