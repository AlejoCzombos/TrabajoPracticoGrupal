package TrabajoPractico_LaFacultad;

import java.util.Comparator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        //Creamos profesores
        Profesor p1 = new Profesor("Facundo", "Uferer", 569787412, 6);
        Profesor p2 = new Profesor("Facundo", "Matoff", 56642, 10);

        //Creamos estudiantes
        Estudiante e1 = new Estudiante("Agustin", "Mansilla", 26578);
        Estudiante e2 = new Estudiante("Agustin", "Campanella", 27130);
        Estudiante e3 = new Estudiante("Alejo", "Czombos", 27129);

        //Creamos materias
        Materia m1 = new Materia("Laboratorio II", p1);
        Materia m2 = new Materia("Programacion II", p2);
        Materia m3 = new Materia("Programacion III", p2);

        //Creamos carreras
        Carrera TUP = new Carrera("TUP");
        Carrera ISI = new Carrera("ISI");

        //Creamos facultad
        Facultad f1 = new Facultad("UTN");

        //Agregamos estudiantes a las materias
        m1.agregarEstudiante(e1);
        m1.agregarEstudiante(e2);
        m1.agregarEstudiante(e3);
        m2.agregarEstudiante(e1);
        m2.agregarEstudiante(e2);
        m2.agregarEstudiante(e3);

        //Agregamos materias a las carreras
        TUP.agregarMateria(m1);
        TUP.agregarMateria(m2);
        TUP.agregarMateria(m3);

        //Agregamos carreras a la facultad
        f1.agregarCarrera(TUP);
        f1.agregarCarrera(ISI);

        //Listamos su contenido
        f1.listarContenido();

        //Elimino Carrera de la facultad
        System.out.println("\nElimino la carrera ISI de la facultad\n");
        f1.eliminarCarrera("ISI");
        f1.listarContenido();

        //Elimino el estudiante e2 de la facultad
        System.out.println("\nElimino el estudiante 'Agustin Campanella' de la facultad\n");
        f1.eliminarEstudiante(e2);
        f1.listarContenido();

        //Busco la materia "Programacion III" en la carrera TUP
        System.out.println("\nBusco la materia 'Programacion III' en la carrera TUP\n");
        TUP.encontrarMateria("Programacion III");
        f1.listarContenido();

        //Elimino el estudiante de nombre "Alejo" de la carrera m1
        System.out.println("\nElimino el estudiante de nombre 'Alejo' de la materia 'Laboratorio II'\n");
        m1.eliminarEstudiante("Alejo");
        System.out.println(m1.toString());

        //Cambio el titular de la materia m1
        System.out.println("\nCambio el titular de la materia 'Laboratorio II'\n");
        m1.modificarTitular(p2);
        System.out.println(m1.toString());

        //Calculos los sueldos de los profesores
        System.out.println("\nCalculos los sueldos de los profesores\n");
        System.out.println("Sueldo de Facundo Uferer con antiguedad de 6 anos: " + p1.calcularSueldo());
        System.out.println("Sueldo de Facundo Matoff con antiguedad de 10 anos: " + p2.calcularSueldo());

        System.out.println("\nListo la cantidad de carreras de la facultad\n");
        System.out.println(f1.verCantidad());

        System.out.println("\nListo la cantidad de materias de la carrera 'TUP'\n");
        System.out.println(TUP.verCantidad());

        System.out.println("\nListo la cantidad de estudiantes en la materia 'Programacion II'\n");
        System.out.println(TUP.verCantidad());
    }
}
