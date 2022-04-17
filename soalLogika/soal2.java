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
public class soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner yey = new Scanner (System.in);
        int a;
        
        System.out.print("Masukkan angka = ");
        a = yey.nextInt();
        a = a%2;
        
        if(a==0){
            System.out.println("Angka ini genap "+a);
        }else{
            System.out.println("Angka ini ganjil "+a);
        }
    }
    
}
