package TrabajoPractico_LaFacultad;


public class Profesor extends Persona {

    private double basico;
    private int antiguedad;
    private double sueldo;

    public Profesor(String nombre, String apellido, int legajo, int antiguedad) {
        super(nombre, apellido, legajo);
        this.antiguedad = antiguedad;
    }


    public void calcularSueldo(double basico){
        sueldo = (basico * 1.10) * antiguedad;
    }


}

