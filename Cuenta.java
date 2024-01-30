/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema_1_2;

/**
 *
 * @author Usuario
 */
public class Cuenta {
    private String titular;
    private double cantidad;
    //constructor predeterminado

    public Cuenta() {
        this.titular = "";
        this.cantidad = 0;

    }

    //por cada atributo se debe de poner un set (asigna valor con void) y get (el que regresa valor con el tipo de dato)
    public Cuenta(String t) {
        this.titular = t;
    }

    private void setTitular(String nombre) {
        this.titular = nombre;
    }

    private String getTitular() {
        return this.titular;
    }

    private void setCantidad(double c) {
        this.cantidad = c;
    }

    private double getCantidad() {
        return this.cantidad;
    }
    
    private void ingresar (double cantidad){
        /*se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hara nada*/
        if (cantidad > 0){
            this.cantidad += cantidad;
        }
    }
}
