/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3_4;

/**
 *
 * @author Usuario
 */
public class Prueba_escuela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //se genera objeto a escuela
        Escuela objEscuela = new Escuela(1, "EVELYN", "GONGORA", 18 );
        objEscuela.asistencia();
        
        //objeto a alumno
        Alumno objAlu = new Alumno("TIC´S", 2, 23280661, "Eve", "Arriaga", 18);
        objAlu.asistencia();
    }
    
}
