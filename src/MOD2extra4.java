
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agust
 */
public class MOD2extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in); 
       int num=0;
       int cut =1;
         while(cut==1){
        num = leer.nextInt();
         if (num<=10){
             if (num>=1)
                 cut = 0;
         }
         }
         switch (num){
             case 1 :
                 System.out.println("I");
                 break;
             case 2 :
                  System.out.println("II");
                  break;
             case 3 : 
                 System.out.println("III");
                 break;
             case 4 :
                 System.out.println("IV");
                 break;
             case 5 :
                 System.out.println("V");
                 break;
             case 6 :
                 System.out.println("VI");
                 break;
             case 7 :
                 System.out.println("VII");
                 break;
             case 8 : 
                 System.out.println("VIII");
                 break;
             case 9 : 
                 System.out.println("IX");
                 break;
             case 10: 
                 System.out.println("X");
                 break;
    }
          
    } 
}
