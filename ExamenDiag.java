/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examendiag;


public class ExamenDiag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a,b,c, suma;
       suma =c =0;
       a=2;
       System.out.println("1 al cubo es 1");
       for(b=2; b <= 5; b++)
       {
           do
           {
               if (a % 2 != 0)
               {
               suma +=a;
               c++;
               }    
                a++;
           } while (c < b);
         if(b==c)
         {
             System.out.println(b + "al cubo es " + suma);
            suma= 0;
            c=0;
                 
         }  
       }
    }
    
}
