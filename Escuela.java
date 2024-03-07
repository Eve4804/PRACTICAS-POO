/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3_4;

/**
 *
 * @author Usuario
 */
public class Escuela {
    //atributos
    protected int id;
    protected String nombre;
    protected String apellido;
    protected int edad;

    public Escuela(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void asistencia(){
        System.out.println("Asistencia de: " +this.getNombre());
        
    }
    
}
//se pone class y despues se pone el constructor 
class Alumno extends Escuela{//extends es la herenica de escuela
    private String carrera;
    private int semestre;

    public Alumno(String carrera, int semestre, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);//super viene de extends y lo pone porque es superclase (escuela)
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }


}
class Profesor extends Escuela{
    private String carrera;
    private String jefatura;

    public Profesor(int id, String nombre, String apellido, int edad, String carrera, String jefatura) {
        super(id, nombre, apellido, edad);
        this.carrera = carrera;
        this.jefatura = jefatura;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getJefatura() {
        return jefatura;
    }

    public void setJefatura(String jefatura) {
        this.jefatura = jefatura;
    }
    
    public void asentarCalificacion(){
    float calificacion;
    calificacion  = datoFloat();//dato float es un metodo de read
    this.setCalif(calificaicon);
    }
    
}
