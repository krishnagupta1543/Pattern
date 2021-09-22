package com.company;
import java.util.*;
public class Hollowrectangle {
    public static void main(String[] args) {
        //Hollow rectangle problem
        /*

        *****
        *   *
        *   *
        *****

         */

        Scanner in = new Scanner(System.in);
        int n, m;
        n = in.nextInt();
        m = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if(i == 1 || i == n || j == 1 || j == m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
