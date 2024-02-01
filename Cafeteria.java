/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rectangulo;

/**
 *
 * @author Usuario
 */
public class Cafeteria {
    //atributos
    private int capacidadMaxima;
    private int capacidadActual;
    //para acceder a elementos debe ser publico
    //constructor
    public Cafeteria(){
        /*EL CONSTRUCTOR PREDETERMINADO, ESTABLECE LA CAPACIDAD MÁXIMA Y LA ACTUAL EN CERO (CAFETERIA VACIA)*/
        this.setCapActu(0);
        this.setCapMax(1000);
    }

    private void setCapMax(int cantidad){ //set asigna valor
        this.capacidadMaxima = cantidad;
    }
    private int getCapMax(){//da una respuesta 
        return this.capacidadMaxima;
    }
    private void setCapActu(int cantidad){ //set asigna valor
        this.capacidadActual = cantidad;
    }
    public int getCapActu(){//da una respuesta 
        return this.capacidadActual;
    }
        public Cafeteria(int maxima){ //puedes repetir constructores pero debe de haber parametros que los distingan
        /*CONSTRUCTOR CON LA CAPACIDAD MAXIMA DE LA CAEFETERIA, INICIALIZA CANTIDAD ACTUAL DE CAFÉ IGUAL A LA CONTIDAD MAXIMA  */
        this.setCapActu(maxima);
    }
    public Cafeteria(int maxima, int actual){
        /*CONSTRUCTOR CON LA CAPACIDAD MAXIMA Y ACTUAL, SI LA CANTIDAD AC ES MAYOR QUE LA CANTIDAD MAX DE LA CAFETERIA  SE AJUSTARA AL MAXIMO*/
     this.setCapActu(actual);
     this.setCapMax(maxima);//actualizamos valores
        if(actual>maxima){
          this.setCapMax(maxima);
      }
    }
    public void llenarCafetera(){
        /*llenarcafetera(): hace que la cantidad actual sea igual a la capacidad*/
        if(this.capacidadMaxima > this.capacidadActual)
            this.setCapActu(this.getCapMax());
        System.out.println("la cantidad actual es: " + this.getCapActu());
    }
    public int servirTaza(int capacidadIndicada){
        /*servirtaza(INT) simula la accion de servir una taza con la capacidad indicada. 
        si la cantidad de cafe no alcanza para llenar la taza,
        se sirve lo que quede*/
        this.capacidadActual -= capacidadIndicada;
        if(this.capacidadActual < 0)
            this.setCapActu(0);
        return this.getCapActu();
    }
   public void vaciarCafetera(){
      /*vaciarCafeteria(): pone la cantidad de cafe actual en cero*/
      this.setCapActu(0);
   }
   public int agragarCafe(int cantidad){
       //agrega cafe: añade a la cafetera la cantidad de cafe indicada
       if(cantidad >= this.capacidadMaxima)
           this.setCapMax(1000);
       else
           this.capacidadActual += cantidad;
       return this.getCapActu();
   }
    
   
}
