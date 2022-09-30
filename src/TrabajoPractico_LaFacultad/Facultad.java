package TrabajoPractico_LaFacultad;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;


public class Facultad implements Informacion{

    final private String nombre;
    final private LinkedList<Carrera> coleccionCarrera;


    public Facultad(String nombre){

        this.nombre = nombre;
        this.coleccionCarrera = new LinkedList<>();
    }

    public void agregarCarrera(Carrera nuevaCarrera){
        coleccionCarrera.add(nuevaCarrera);
    }

    public void eliminarCarrera(String carrera){
        for(Carrera x : coleccionCarrera){
            if(x.getNombre().equals(carrera)){
                coleccionCarrera.remove(x);
            }
        }
    }

    public void mostrarCarreras() {
        System.out.println("Carreras de "+this.nombre+":");
        for (Carrera carrera : coleccionCarrera) {
            System.out.println("-" + carrera.toString());
        }
    }

    public void eliminarEstudiante(Estudiante estudiante){
        for (Carrera carrera : coleccionCarrera){
            for(Materia materia:carrera.getColeccionMateria()){
                for(Estudiante viejoEstudiante : materia.getColeccionEstudiantes()){
                    if(viejoEstudiante.equals(estudiante)){
                        materia.getColeccionEstudiantes().remove(estudiante);
                    }
                }
            }
        }
    }


    @Override
    public void verCantidad() {
        System.out.println(coleccionCarrera.size());
    }

    @Override
    public void listarContenido() {
        Collections.sort(coleccionCarrera, new Comparator<Carrera>() {
            @Override
            public int compare(Carrera o1, Carrera o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });
        System.out.println(coleccionCarrera);
    }
}
