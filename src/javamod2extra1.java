
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *double numero = 3.14;
long numeroRedondeado = Math.round(numero);// numeroRedondeado es 3
 * @author agust
 */
public class javamod2extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                 
         
  System.out.println("ingresa la cantidad de minutos");
        Scanner leer = new Scanner(System.in);
        long Mi = leer.nextInt();
        long H = Mi/60;
        long D = H/24;
        long  DI=Math.round(D);
          H=H-D*24;
          H=Math.round(H);
          System.out.println("el valor ingresado corresponda a "+D+" Dias y "+H+" horas");
            
    }
    
}
    

