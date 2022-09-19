package TrabajoPractico_LaFacultad;

public abstract class Persona {

    private String nombre;
    private String apellido;
    private int legajo;

    public Persona(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    void modificarDatos(String nombre, String apellido, int legajo){}

}
