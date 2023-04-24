
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
 * Caso contrario mostrar un mensaje.
 * Nota: investigar la función equals() de la clase String.
 * @author agust
 */
public class javamod2extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in); 
       String A;
         do
        A = leer.next();
         while ((A.length()!=1));
       if ("A".equals(A)&&"E".equals(A)&&"I".equals(A)&&"O".equals(A)&&"U".equals(A)){
           System.out.println("su letra es vocal");    
         } 
        if (!"A".equals(A)&&!"E".equals(A)&&!"I".equals(A)&&!"O".equals(A)&&!"U".equals(A)){
           System.out.println("su letra es consonante");
}
}
}
