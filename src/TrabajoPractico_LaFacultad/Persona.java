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

    public void modificarDatos(String nombre, String apellido, int legajo){
        try{
            this.nombre = nombre;
            this.apellido = apellido;
            this.legajo = legajo;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error en el ingreso de datos!");
        }
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

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo=" + legajo;
    }

}
