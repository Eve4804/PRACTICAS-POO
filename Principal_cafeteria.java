/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangulo;

/**
 *
 * @author Usuario
 */
public class Principal_cafeteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaramos el objeto y lo creamos
        int cap; //variable para servir taza
        Cafeteria objCafe = new Cafeteria();
        cap= objCafe.servirTaza(250);
        cap= objCafe.servirTaza(250);
        cap= objCafe.servirTaza(250);
        cap= objCafe.servirTaza(250);
        
        System.out.println("Despues de servir el cafe en la taza, la cafetera le queda " + cap + " ml");
        if(cap==0){
            cap= objCafe.servirTaza(250);
            cap= objCafe.servirTaza(250);
            System.out.println("despues de servir una taza, la cafetera le queda " + cap +" ml");
            objCafe.vaciarCafetera();
        }
        
     
    }
    
}
