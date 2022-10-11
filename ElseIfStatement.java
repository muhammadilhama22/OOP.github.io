/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muhammad_ilham_oop;

/**
 *
 * @author hp
 */
public class ElseIfStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int nilai = 70 ;
        int absen = 90 ;
        
        if (nilai >= 80 && absen >= 80){
        System.out.println("Anda Anda A");
        }else if(nilai >= 70 && absen >= 70){
         System.out.println("Anda Anda B");
        }else if(nilai >= 60 && absen >= 60){
         System.out.println("Anda Anda C");
        }else if(nilai >= 50 && absen >= 50){
         System.out.println("Anda Anda D");
        }else{
         System.out.println("Anda Anda E");
        };
    }
    
}
