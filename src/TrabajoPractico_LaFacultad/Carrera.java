package TrabajoPractico_LaFacultad;

public class Carrera implements Informacion {
    private String nombre;
    private Materia coleccionMaterias;

    public Carrera(String nombre, Materia coleccionMaterias) {
        this.nombre = nombre;
        this.coleccionMaterias = coleccionMaterias;
    }

    void agregarMateria(Materia materia){

    }

    void eliminarMateria(String nombreMateria){

    }

    void encontrarMateria(String nombre){

    }

    @Override
    public int verCantidad() {
        return 0;
    }

    @Override
    public String listarContenido() {
        return null;
    }
}
