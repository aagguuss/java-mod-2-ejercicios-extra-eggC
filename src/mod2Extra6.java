
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
public class mod2Extra6 {

    /**Leer la altura de N personas y determinar el promedio de estaturas que 
     * se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.

     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int personas = leer.nextInt();
        double mediaTotal=0;
         double paraMedia=0;
        double estaturas[]= new double[personas];
        for(int i=0 ; i < personas; i++ ){
        estaturas[i]= leer.nextInt();
       
          mediaTotal=mediaTotal+estaturas[i];
        if (estaturas[i]<1.60){
           
                    paraMedia=paraMedia+1;
        }
        }
        mediaTotal=mediaTotal/personas;
        paraMedia=paraMedia/personas*100;
        System.out.println(paraMedia);
        System.out.println(mediaTotal);
  }
    }
    

