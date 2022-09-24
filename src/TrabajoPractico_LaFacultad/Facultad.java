package TrabajoPractico_LaFacultad;

public class Facultad implements Informacion{

    private String nombre;
    private Carrera ColeccionCarreras[];

    public Facultad(String nombre, Carrera colleccionCarrera[]){
        this.nombre = nombre;
        this.ColeccionCarreras = colleccionCarrera;
    }

    void agregarCarrera(Carrera carrera){

    }
    void eliminarCarrera(String nombreCarrera){

    }
    void eliminarEstudiante(Estudiante estudiante){

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
