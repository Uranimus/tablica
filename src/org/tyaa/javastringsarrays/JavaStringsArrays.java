/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javastringsarrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class JavaStringsArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] intAr = new int[8][8];
        int a = 2, b = 2;
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                intAr[i][j] = a * b;
                b++;
            }
            a++;
            b = 2;
        }
        a = b = 2;
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                System.out.print(a + " * " + b + " = ");
                System.out.printf("%2d", intAr[i][j]);
                System.out.print("    ");
                b++;
            }
            a++;
            b = 2;
            System.out.println("");

        }

    }

}
