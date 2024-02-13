/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

import java.util.Scanner;
import java.util.EmptyStackException;
import java.util.InputMismatchException;
import java.util.Stack;

public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Archivo prueba = new Archivo();
        // prueba.leer();
        Stack pila = new Stack();
        Object p;

        System.out.println(pila);
        //insertar datos push
        pila.push("HOLA");
        System.out.println(pila);
        pila.push(15);
        System.out.println(pila);
        try {
            //sacar un dato de la pila
            p = pila.pop();
            System.out.println(pila + "==> " + p);
            p = pila.pop();
            System.out.println(pila + "==> " + p);
            p = pila.pop();
            System.out.println(pila + "==> " + p);
        } catch (EmptyStackException e) {
            System.out.println("ERROR: PILA VACIA");

        }
        //--ERROR EN MENUS DE OPCIONES
        try {
            int opc;
            Scanner leer = new Scanner(System.in);
            do {
                System.out.println("1.PEDIR DATOS");
                System.out.println("2. SALIR");
                System.out.println("¿QUE DESEAS");
                opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        pedirDatos();
                        break;
                    case 2:
                        System.out.println("ESTA SALIENDO DE LA APLICACION");
                        break;

                }
            } while (opc != 2);
        } catch (InputMismatchException e) {
            System.err.printf("ERROR: DEBES DE TECLEAR NUMERO");
        }
    }

    public static void pedirDatos() throws InputMismatchException {
        //throws lo que hace es LANZAR ALGUNA EXCEPCION DE
        //tipo InputMismatchException o IOException
        int edad = 0;
        String nom, n;
        Scanner leer;
        boolean esEntero;
        try {
            leer = new Scanner(System.in);
            System.out.println("Ingrese nombre: ");
            nom = leer.nextLine();
            do {
                System.out.println("DAME TU EDAD: ");
                n = leer.nextLine();
                esEntero = validaNum(n);
                if(esEntero== true)
                    edad = Integer.parseInt(n);

                
            }while (esEntero!= true);
            System.out.println("hola " +nom+ "tienes: " +edad+ " años");
        } 
        catch (Exception e) {
            System.err.println("ERROR, DEBES TECLEAR UN NUMERO");

        }
    }

    public static boolean validaNum(String cad) {
        try{
            Integer.parseInt(cad);
            return true;
        }
        catch(NumberFormatException e){
                
            return false;
        }

    }
}
