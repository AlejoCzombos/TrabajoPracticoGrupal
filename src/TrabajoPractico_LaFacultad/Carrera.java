package TrabajoPractico_LaFacultad;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;


public class Carrera implements Informacion {

     private String nombre;
     private LinkedList<Materia> coleccionMateria;

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

    public void eliminarMateria(String materia){
        for(Materia x : coleccionMateria){
            if(x.getNombre().equals(materia)){
                coleccionMateria.remove(x);
            }
        }
    }

    public void encontrarMateria(String materia){
        int opcion = 0;
        Scanner s1 = new Scanner(System.in);

        boolean encontrado = false;
        for(Materia x : coleccionMateria){
            if(x.getNombre().equals(materia)){
                System.out.println(materia + " se encuentra dentro de " + getNombre());
                encontrado = true;
                System.out.println("Desea eliminar la materia?\n1 Si || 2 No");

                try{
                    opcion = s1.nextInt();
                }catch (Exception e){
                    e.printStackTrace();
                    System.out.println("Error en el ingreso de datos!");
                }

                if(opcion == 1){
                    eliminarMateria(materia);
                }
                break;
            }
        } if(!encontrado){
            System.out.println("No se encuentra la materia");
        }
    }

    public LinkedList<Materia> getColeccionMateria() {
        return coleccionMateria;
    }

    public void mostrarMaterias() {
        System.out.println("Materias de "+this.nombre+":");
        for (Materia materia : coleccionMateria) {
            System.out.println("-" + materia.getNombre());
        }
    }


    @Override
    public String toString() {
        return "Carrera{" +
                " nombre='" + nombre + '\'' +
                ", coleccion de Materias=" + coleccionMateria +
                '}';
    }

    public int verCantidad() {
       return coleccionMateria.size();
    }

    @Override
    public void listarContenido() {
        Collections.sort(coleccionMateria, new Comparator<Materia>() {
            @Override
            public int compare(Materia o1, Materia o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });
        System.out.println(coleccionMateria);
    }
}
