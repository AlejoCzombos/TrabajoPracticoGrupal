package TrabajoPractico_LaFacultad;
import java.util.LinkedList;
import java.util.Scanner;

public class Carrera {

    final private String nombre;
    final private LinkedList<Materia> coleccionMateria;

    public Carrera(String nombre){
        this.nombre = nombre;
        this.coleccionMateria = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarMateria(Materia nuevaMateria){
        coleccionMateria.add(nuevaMateria);
    }

    private void eliminarMateria(String materia){
        for(Materia x : coleccionMateria){
            if(x.getNombre().equals(materia)){
                coleccionMateria.remove(x);
            }
        }
    }

    public void encontrarMateria(String materia){
        boolean encontrado = false;
        for(Materia x : coleccionMateria){
            if(x.getNombre().equals(materia.toLowerCase())){
                System.out.println(materia + " se encuentra dentro de " + getNombre());
                encontrado = true;
                System.out.println("Desea eliminar la materia?\n1 Si || 2 No");
                Scanner s1 = new Scanner(System.in);
                if(s1.nextInt() == 1){
                    eliminarMateria(materia);
                }
                break;
            }
        } if(!encontrado){
            System.out.println("No se encuentra la materia");
        }
    }


    public void mostrarMaterias() {
        System.out.println("Materias de "+this.nombre+":");
        for (Materia materia : coleccionMateria) {
            System.out.println("-" + materia.getNombre());
        }
    }

    @Override
    public String toString() {
        return nombre;
    }
}