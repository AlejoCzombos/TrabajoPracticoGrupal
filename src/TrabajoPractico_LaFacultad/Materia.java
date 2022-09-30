package TrabajoPractico_LaFacultad;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Materia implements Informacion{

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
        return " Materia{" +
                "nombre='" + nombre + '\'' +
                ", titular=" + titular +
                ", Estudiantes="  + coleccionEstudiantes.toString() +
                "}";
    }

    @Override
    public int verCantidad() {
       return coleccionEstudiantes.size();
    }

    @Override
    public void listarContenido() {
        Collections.sort(coleccionEstudiantes, new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante o1, Estudiante o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });
        System.out.println(coleccionEstudiantes);
    }

}


