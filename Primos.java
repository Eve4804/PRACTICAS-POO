/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primos;

/**
 *
 * @author Usuario
 */
public class Primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int div = 2, dive = 2, c= 0, primo =0;
       //declara arreglo de 5 posiciones
       int z [] = new int [5];
       int a=0; //indice
       do{
           for (div = 2; div <= dive; div ++) {
               if ((div % dive) == 0) {
                   c++;
               }
           }
           if (c<2) {
               System.out.println("primo " + dive);
               z[a] = dive;
               a++;
               primo++;
               
           }
           c=0;
           dive ++;
       }while (primo < 5);
       //ciclo para obtener los datos del arreglo
        a=0; //indice en 0
        while (a<z.length);
        System.out.println("z[" + a+ "] = " + z[a]);
    }
    
}
