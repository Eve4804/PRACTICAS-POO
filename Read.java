/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema_1_2;
import java.io.*;
public class Read {
    //La funcion info, lee un texto y lo regresa donde fue llamado
   //@return un texto
    public static String info(){
        PrintStream w= System.out;
        PrintStream e= System.err;
        String dato = "";
        try{//va el codigo que pueda lanzar(throw) un error
            InputStreamReader isr =new InputStreamReader(System.in);
            BufferedReader br= new BufferedReader(isr); 
            w.println("INTRODUCE UN NUMERO: ");
            dato = br.readLine();
        }
        catch(IOException k){
            e.println(k.getMessage());
        }
        return dato;
    }
    /*Funcion short: regresa un entero corto despues que se ha leido el numero
    *
    *@return el entero corto
    */
    public static short datoShort(){
        try{
            return Short.parseShort(info());
        }
        catch (NumberFormatException e){
            return Short.MIN_VALUE; 
        }
    }
    //Funcion datoLong regresa un entero largo despues de que se ha leido un numero
    //@ return el entero
    public static long datoLong(){
        try{
            return Long.parseLong(info());
        }
        catch(NumberFormatException e){
            return Long.MIN_VALUE;
        }
    }
    //Funcion datoInt regresa un entero largo despues de que se ha leido un numero
    //@return el entero
    public static int datoInt(){
        try{
            return Integer.parseInt(info());
        }
        catch(NumberFormatException e){
            return Integer.MIN_VALUE;
        }
    }
     //Funcion datoFloat regresa un entero largo despues de que se ha leido un numero
    //@return el entero
    public static float datoFloat(){
        try{
            return Float.parseFloat(info());
        }
        catch(NumberFormatException e){
            return Float.NaN;
        }
    }
      //Funcion datoDoublet regresa un entero con decimales despues de que se ha leido un numero
    //@return EL ENTERO CON DECIMALES DOBLE PRESICION
    public static double datoDouble(){
        try{
            return Double.parseDouble(info());
        }
        catch(NumberFormatException e){
            return Double.NaN ;
        }
    }
    public static String info(String nombre){
        PrintStream w= System.out;
        PrintStream e= System.err;
        String dato = "";
        try{//va el codigo que pueda lanzar(throw) un error
            InputStreamReader isr =new InputStreamReader(System.in);
            BufferedReader br= new BufferedReader(isr); 
            w.println("INTRODUCE UN NOMBRE: ");
            dato = br.readLine();
        }
        catch(IOException k){
            e.println(k.getMessage());
        }
        return dato;
    }
      private int ajusteLetra(){
        //A=65 hasta la z=122
        int ini = 65, fin = 122;
        return (int)((fin-ini+1)*Math.random()+ ini);
    }
      
}
