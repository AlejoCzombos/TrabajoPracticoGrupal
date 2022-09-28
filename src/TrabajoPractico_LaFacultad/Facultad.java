package TrabajoPractico_LaFacultad;
import java.util.LinkedList;


public class Facultad {

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


    @Override
    public int verCantidad() {
        return 0;
    }

    @Override
    public String listarContenido() {
        return null;
    }
}
