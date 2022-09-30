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

    //El método listarContenidos() de la interface Información lista los elementos de la clase contenida,
    //es decir que de la clase Facultad se listará las Carreras, de la clase Carreras las materias, etc. Siempre en orden alfabético.

    //El método verCantidad() de la interface Información muestra la cantidad de elementos que contiene, es decir que en el caso de
    //la clase Carreras, devolverá la cantidad de materias que posee, en el caso de la clase Materias, la cantidad de estudiantes que tienen, etc.

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
