/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author Usuario
 */
public class Arreglo {

    private String arr[][];
    private int cve;
    private String nombre;
    private String primerAr;
    private String mes;

    //constructor
    public Arreglo() {
        this.arr = null; //null es vacio
    }

    public Arreglo(int c, String nom, String pap, String m) {
        this.cve = c;
        this.nombre = nom;
        this.primerAr = pap;
        this.mes = m;
    }

    /**
     * @return el arreglo
     */
    private String[][] getArr() {
        return this.arr;
    }

    /**
     * @param arr
     */
    public void setArr(String[][] arr) {
        this.arr = arr;
    }

    /**
     * @return clave
     */
    private int getCve() {
        return this.cve;
    }

    /**
     * @param clave
     */
    private void setCve(int cve) {
        this.cve = cve;
    }

    /**
     * @return 
     */
    public String getPrimerAr() {
        return primerAr;
    }

    public void setPrimerAr(String primerAr) {
        this.primerAr = primerAr;
    }

    private String getmes() {
        return this.mes;
    }

    /**
     * @param m
     */
    private void setmes(String m) {
        this.mes = m;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     EL METODO INSERTAR, SE REALIZA EN DOS MOMENTOS DE FORMA GENERAL:
     * 1. CUANDO EL ARREGLO ESTA VACIO
     * 2. CUANDO EL ARREGLO YA CONTIENE ALGUN REGISTRO
     * @param c : es la clave
     * @param nom : es el nombre
     * @param 
     */
    public void insertar (int c, String nom, String ap, String m){
        String cve = Integer.toString(c);
        if(this.getArr()== null){
            //el arreglo esta vacio
            //crear un arreglo vavio de 4 posiciones 
            this.setArr(new String [1][4]);
            //se llena el arreglo principal
            this.arr[0][0] = cve;
            this.arr[0][1] = nom;
            this.arr[0][2] = ap;
            this.arr[0][3] = m;
        }else{
            //ya tiene algin dato o informacion, se anexa
            String tmp [][] = new String [this.getArr().length+1][4]; //tmp es una variable temporal
            System.arraycopy(this.getArr(), 0, tmp, 0, this.getArr().length);
            //asignar datos al arreglo
            this.arr[this.getArr().length][0] = cve;
            this.arr[this.getArr().length][1] = nom;
            this.arr[this.getArr().length][2] = ap;
            this.arr[this.getArr().length][3] = m;
            //se guardan los datos
            this.setArr(tmp);
            
        }
        
    }
    /**
     *el metodo ordenamientoNom()
     */
    public void ordenamientoNom(){
        boolean ordenado = false;
        int cuenta = 0;
        while(ordenado){
            //recorrer arreglo
            for (int i = 0; i < this.getArr().length-1; i++) {
                if(this.getArr()[i][1].equalsIgnoreCase(this.getArr()[i+1][1])){
                    String f=this.getArr()[i][0];
                    this.getArr()[i][0] = this.getArr()[i+1][0];
                }
            }
        }
    }
     public int buscarClave(String cve){
        String s = "";
        int k;
        cve = cve.replaceAll("","");
        if (this.getArr()== null)
            return -1;
        else{
            for (k=0; k< 4; k++){
                if(cve.equals(this.getArr()[k][0])){//equals es para buscar el valor
                    return k;
                }
            }        
                    
        }
        return -2;    
    }
    public String visualizaDatos(String d){
        String s ="";
        int i;
        if(this.getArr()== null)
            return "";
        else
            for (i = 0; i < 4; i++) {
                if(d.equals(this.getArr()[i][0])){
                    s += "| Clave: " +this.getArr()[i][0]+ " ";
                    s += "| Nombre: " +this.getArr()[i][1]+ " ";
                    s += "| Primer Apellido: " +this.getArr()[i][2]+ " ";
                    s += "| Mes: " +this.getArr()[i][3]+ " ";
                    return s;//fue encontrado
                }
            }
        if(s.isEmpty())
            s="Clave encontrada";
        return s;
    }
    public String visualizaMes(String d){
         String s ="";
        int i;
        if(this.getArr()== null)
            return "";
        else
            for (i = 0; i < 4; i++) {
                if(d.equals(this.getArr()[i][3])){
                    s += "| Clave: " +this.getArr()[i][0]+ " ";
                    s += "| Nombre: " +this.getArr()[i][1]+ " ";
                    s += "| Primer Apellido: " +this.getArr()[i][2]+ " ";
                    s += "| Mes: " +this.getArr()[i][3]+ " ";
                    return s;//fue encontrado
                }
            }
        if(s.isEmpty())
            s="Clave encontrada";
        return s;
    }
    /*
    *METODO eliminarCve, elimina una fila por su clave
    *@param cve:la clave a eliminar
    */
    public void elimanarCve(int cve){
        if(this.getArr().length == 1)
            this.setArr(null); //el arreglo vacio
        else{
            String tmp [][] = new String [this.getArr().length-1][4];
            int j=0, i;
            for(i=0; i <this.getArr().length;i++){
                if(i !=cve){
                    tmp[j][0] = this.getArr()[i][0];
                    tmp[j][0] = this.getArr()[i][1];
                    tmp[j][0] = this.getArr()[i][2];
                    tmp[j][0] = this.getArr()[i][3];
                    j++;
                }
            }
                //actualizar el arreglo debido a que se elimino la fila deseada
                this.setArr(tmp);
        }
    }

        
    
    

}
