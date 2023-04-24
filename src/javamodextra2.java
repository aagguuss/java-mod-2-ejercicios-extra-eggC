/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una.
 * A continuación, realizar las instrucciones necesarias para que:
 * B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
 * Mostrar los valores iniciales y los valores finales de cada variable.
 * Utilizar sólo una variable auxiliar.
 * @author agust
 */
public class javamodextra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int A = (int) (Math.random()*100);
        System.out.println("valor A "+A);
        int B = (int) (Math.random()*100);
         System.out.println("valor B "+B);
          int C = (int) (Math.random()*100);
         System.out.println("valor C "+C);
          int D = (int) (Math.random()*100);
         System.out.println("valor D "+D);
         int aux=0;
         aux=B;
         B=C;
         System.out.println("valor B "+B);
         C=A;
          System.out.println("valor C "+C);
         A=D;
         System.out.println("valor A "+A);
         D=aux;
          System.out.println("valor D "+D);       
         
    }
    
}
