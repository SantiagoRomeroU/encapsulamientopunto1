
package taller2java;

/*Santiago Romero*/
/*2024-04-30*/
/*Clase estudiante con sus atributos*/
public class Estudiante {
    //atributos privados
    private String nombre;
    private int edad;
    private double[] calificaciones;
    
    //Constructor de la clase
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = new double[5]; // Suponemos 5 calificaciones
    }
    
    //metodos getter
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Getter para una calificación específica
    public double getCalificacion(int indice) {
        return calificaciones[indice];
    }

    // Setter para una calificación específica
    public void setCalificacion(int indice, double calificacion) {
        calificaciones[indice] = calificacion;
    }
    
    
}
