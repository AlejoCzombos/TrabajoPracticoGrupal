package TrabajoPractico_LaFacultad;

public class Estudiante extends Persona{

    public Estudiante(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
    }



    @Override
    public void modificarDatos(String nombre, String apellido, int legajo) {
        super.modificarDatos(nombre, apellido, legajo);
    }


}
