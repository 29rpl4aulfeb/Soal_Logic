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
public class soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner yey = new Scanner(System.in);
        int a, b;
        
        System.out.print("Input nilai a = ");
        a= yey.nextInt();
        System.out.print("Input nilai b = ");
        b= yey.nextInt();
        
        if(a > b){
            System.out.println("Nilai lebih besar = "+a);
        }else{
            System.out.println("Nilai lebih besar = "+b);
        }
    }
    
}
