package TrabajoPractico_LaFacultad;

import java.util.ArrayList;
import java.util.List;

public class Materia implements Informacion{

    private String nombre;
    private Profesor titular;
    private Estudiante[] coleccionEstudiantes;

    public Materia(String nombre, Profesor titular, Estudiante[] coleccionEstudiantes) {
        this.nombre = nombre;
        this.titular = titular;
        this.coleccionEstudiantes = coleccionEstudiantes;
    }

    void agregarEstudiante(Estudiante estudiante){
    }

    void eliminarEstudiante(String nombre){
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
