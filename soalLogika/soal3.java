/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalLogika;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class soal3 {

    /**
     * @param args the command line arguments
     */
    int a;
    public void proses(int a){
        int hasil = 0;
        for (int i = 1; i <= a; i++){
            hasil += i;
            if (i==a){
                System.out.print(i);
            }else {
                System.out.print(i + " + ");
            }
        }
        System.out.println(" = "+hasil);
    }
    public static void main(String[] args) {
         soal3 hitung = new soal3();

        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan Angka : ");
        hitung.a = scan.nextInt();

        hitung.proses(hitung.a);
    }
}
