package TrabajoPractico_LaFacultad;

public class Profesor extends Persona {

    private double basico;
    private int antiguedad;
    private double sueldo;

    public Profesor(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
    }

    public void calcularSueldo(double basico){
        sueldo = (basico * 1.10) * antiguedad;
    }

}