/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author Usuario
 */
public class Test {

    public void asignaArr(int[] z, int num, int a) {
        z[a] = num;
    }

    public void obtenArr(int[] g) {
 int a=0;//indice 0
        while (a<g.length){
            System.out.println("arreglo["+a+"] = "+g[a]); 
             a++;
        }
    }
}
