/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalLogika;

/**
 *
 * @author user
 */
public class soal5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] me = {4, 6, 1, 3, 5};
        int max =me[0];
        
        for (int i = 0; i < me.length; i++) {
            if(me[i]>max){
                max = me[i];
            }            
        }
        System.out.println("nilai maksimal = "+max);
    }
    
}
