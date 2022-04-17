/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalLogika;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class soal6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int k, n, arr[], i, l, result = 0;

        String desc = "tidak bisa";
        k = 10;
        System.out.println("Nilai K : "+k);

        n = 5;
        arr = new int[n];

        System.out.println("Masukkan " + n + " angka");
        for (i = 0; i < n; i++) {
            System.out.print("Angka[" + (i) + "] : ");
            arr[i] = scan.nextInt();
        }

       for (i = 0; i < n; i++) {
           for (l = 0; l < n; l++) {
               if (arr[i] != arr[l]) {
                   if (arr[i] + arr[l] == k) {
                       result++;
                   }
                }
           }
        }
        if (result > 0) {
            desc = "bisa";
        }

        String arrValue = Arrays.toString(arr);
        System.out.println("Array yang dimasukkan = " + arrValue);
        System.out.println("Apakah mungkin = " + desc);
    }
    
}
