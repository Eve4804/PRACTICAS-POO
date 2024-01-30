/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema_1_2;


public class Principal_cuenta {


    public static void main(String[] args) {
        // TODO code application logic here
        //declarar objeto de tipo cuenta
        Cuenta objCuenta;
        
        //crear al objeto
        objCuenta = new Cuenta("JUAN");
        System.out.println("El nombre del titular es:" + objCuenta.getTitular());
        objCuenta.ingresar(200);
        objCuenta.ingresar(350);
        System.out.println("tu saldo es: "+ objCuenta.getCantidad());
        objCuenta.retirar(300);
        objCuenta.retirar(300);
        System.out.println("tu saldo es: "+ objCuenta.getCantidad());
    }
    
}
