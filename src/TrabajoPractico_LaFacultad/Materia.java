package TrabajoPractico_LaFacultad;

import java.util.LinkedList;

public class Materia {

    private String nombre;
    private Profesor titular;
    private LinkedList<Estudiante> coleccionEstudiantes;

    public Materia(String nombre, Profesor titular) {
        this.nombre = nombre;
        this.titular = titular;
        this.coleccionEstudiantes = new LinkedList<>();
    }
    void agregarEstudiante(Estudiante estudiante){
        this.coleccionEstudiantes.add(estudiante);
    }

    void eliminarEstudiante(String nombre){
        for (Estudiante estudiante:coleccionEstudiantes){
            if (estudiante.getNombre().equals(nombre)){
                coleccionEstudiantes.remove(estudiante);
            }
        }
    }
    void modificarTitular(Profesor profesor) {
        setTitular(profesor);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getTitular() {
        return titular;
    }

    public void setTitular(Profesor titular) {
        this.titular = titular;
    }

    public LinkedList<Estudiante> getColeccionEstudiantes() {
        return coleccionEstudiantes;
    }

    public void setColeccionEstudiantes(LinkedList<Estudiante> coleccionEstudiantes) {
        this.coleccionEstudiantes = coleccionEstudiantes;
    }


    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\n' +
                "titular=" + titular +
                "\nEstudiantes="  + coleccionEstudiantes.toString() +
                '}';
    }
}
