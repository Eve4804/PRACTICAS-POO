/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema_3_4;

/**
 *
 * @author Usuario
 */
public class Prueba_escuela
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // crear objetos de las clases hijas
        //clase_hija nomObj = new Clases_Hija(parametros)
        Alumno objAlu = new Alumno("TIC´s", 3, 1, "Julian", "Hernandez", "22");
        
        objAlu.asistencia();//metodo heredado
        objAlu.verCalificaciones(); //metodo propio
        

    }
    
}
