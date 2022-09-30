package TrabajoPractico_LaFacultad;


public class Profesor extends Persona {

    private double basico = 60000;
    private int antiguedad;
    private double sueldo;

    public Profesor(String nombre, String apellido, int legajo, int antiguedad) {
        super(nombre, apellido, legajo);
        this.antiguedad = antiguedad;
    }


    public double calcularSueldo(){
        sueldo = basico;
        for (int i = 0; i < antiguedad; i++){
            sueldo += basico * 0.10;
        }
        return sueldo;
    }


}

