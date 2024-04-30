package taller2java;

public class Taller2java {

    /*Santiago Romero*/
    /*2024-04-30*/
    /*Demostracion encapsulamiento*/
    public static void main(String[] args) {
        
        Estudiante estudiante = new Estudiante("Juan", 20);
        estudiante.setCalificacion(0, 85.0);
        estudiante.setCalificacion(1, 92.5);

        System.out.println("Nombre del estudiante: " + estudiante.getNombre());
        System.out.println("Edad del estudiante: " + estudiante.getEdad());
        System.out.println("Calificación 1: " + estudiante.getCalificacion(0));
        System.out.println("Calificación 2: " + estudiante.getCalificacion(1));
    }
    
}
