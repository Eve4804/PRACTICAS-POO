/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema1_2;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Password1 {
     private long clave;
    private char letra;

    public Password1(long clave) {
        this.clave = clave;
        this. letra = (char)(this.ajusteLetra());
    }
   
    public void leer(){
        Scanner leer = new Scanner(System.in);
        System.out.println("DAME EL NUMERO: ");
        this.clave = leer.nextLong();
        this.letra=(char)(this.ajusteLetra());
    }
    public Password1(){
        this.clave=0;
        this.letra= ' ';
    }
  
    private int ajusteLetra(){
        //A=65 hasta la z=90
        int ini = 65, fin = 90;
        return (int)((fin-ini+1)*Math.random()+ ini);
    }

    public long getClave() {
        return clave;
    }

    public void setClave(long clave) {
        this.clave = clave;
        this.letra= (char)(this.ajusteLetra());
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    public void mostrarClave(){
        System.out.printf("%08d-%c\n", this.clave,this.letra);
    }
}
  