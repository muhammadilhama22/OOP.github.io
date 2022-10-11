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
public class KonversiTipeDataNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte  iniByte = 10 ;
        short iniShort = iniByte ;
        int   iniInt = iniShort ;
        long  iniLong =  iniInt ; 
        float iniFloat = iniLong ;
        double iniDouble = iniFloat ;
        
       float iniFloat2 = (float) iniDouble ;
       long  iniLong2  = (long) iniFloat ;
       int   iniInt2   = (int) iniLong2 ;
       short iniShort2 = (short) iniInt2 ;
    }
    
}
