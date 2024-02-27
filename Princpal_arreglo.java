/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo;

/**
 *
 * @author Usuario
 */
public class Princpal_arreglo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        //crear el objeto para arreglo 
        Arreglos objArr = new Arreglos();

        //insertar datos
        objArr.insertar(1, "Sandra", "Gardunio", "Mayo");
        objArr.insertar(2, "Arturo", "Gardunio", "Agosto");
        objArr.insertar(3, "Maria", "De la o", "Mayo ");
        objArr.insertar(4, "Vale", "Garcia", "Febrero");
        objArr.ordenamientoNom();
        System.out.println(objArr.visualizaArreglos());
        System.out.println("Los datos de Maria son:");
        System.out.println(objArr.visualizaDatosCve("3"));
        System.out.println("Que personas se ingresaron en \"mayo\":");
        System.out.println(objArr.visualizaDatosMes("mayo"));
        //eliminar datos
        System.out.println("Elimina a: \"Arturo\" ");
        int clave = objArr.buscarClave("2");
        System.out.println("Clave a eliminar" + clave);
        if (clave >= 0) {
            objArr.eliminaCve(clave);
            System.out.println(objArr.visualizaArreglos());

        } else {
            System.out.println("Dato no encotrado");

        }

    }
    
}
