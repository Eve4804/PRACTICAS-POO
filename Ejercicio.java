/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;

/**
 *
 * @author Usuario
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        int div = 2, dive = 2, c= 0, primo =0;
       //declara arreglo de 5 posiciones
       int z [] = new int [5];
       int a=0; //indice
       //objeto a test que es otra clase
       //nombre de la Clase + objClase = new Clase 
       Test objTest = new Test();
       do{
           for (div = 2; div <= dive; div ++) {
               if ((dive % div) == 0) {
                   c++;
               }
           }
           if (c<2) {
              // z[a] = dive;
               primo++;
               //asi se manda llamar metodos dentro de la misma clase setArreglo(z, dive,a);//mandar llamar el metodo 
               objTest.asignaArr(z, dive, a);
                a++;
           }
           c=0;
           dive ++;
       }while (primo < 5);
       //ciclo para obtener los datos del arreglo
        //a=0; //indice en 0
        //while (a<z.length);
        //System.out.println("z[" + a+ "] = " + z[a]);
       // getArreglo(z);//mandar llamar el metodo
         objTest.obtenArr(z);
    }
    public static void setArreglo(int [] x, int num, int a){
        x[a] = num;
        
        
    }
    public static void getArreglo(int[] g){
        int a=0;//indice 0
        while (a<g.length){
            System.out.println("arreglo["+a+"] = "+g[a]); 
             a++;
        }
        
    }
    
}
