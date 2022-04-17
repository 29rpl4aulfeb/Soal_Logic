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
public class soal7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, arr[], i, nilai, l, result = 0;

        String desc = "tidak ada";
        System.out.print("Inputkan jumlah angka : ");
        n = scan.nextInt();
        arr = new int[n];

        System.out.println("Masukkan " + n + " angka");
        for (i = 0; i < n; i++) {
            System.out.print("Angka[" + (i) + "] : ");
            arr[i] = scan.nextInt();
        }
        for (i = 0; i < n; i++) {
            for (l = i + 1; l < n; l++) {
                if (arr[i] == arr[l]) {
                    result++;
                }

            }
        }

        if (result > 0) {
            desc = "ada";
        }

        String arrValue = Arrays.toString(arr);
        System.out.println("Array yang dimasukkan adalah =" + arrValue);
        System.out.println("Apakah mungkin = " + desc);
    }
    
}
