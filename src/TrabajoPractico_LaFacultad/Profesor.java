package TrabajoPractico_LaFacultad;

public class Profesor extends Persona{

    public Profesor(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
    }

    @Override
    void modificarDatos(String nombre, String apellido, int legajo) {
        super.modificarDatos(nombre, apellido, legajo);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String getApellido() {
        return super.getApellido();
    }

    @Override
    public void setApellido(String apellido) {
        super.setApellido(apellido);
    }

    @Override
    public int getLegajo() {
        return super.getLegajo();
    }

    @Override
    public void setLegajo(int legajo) {
        super.setLegajo(legajo);
    }
}
