package TrabajoPractico_LaFacultad;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Profesor p1 = new Profesor("Jorge", "Samchez", 12312223);
        Estudiante e1 = new Estudiante("Agustin", "Mansilla", 1111);



        Facultad f1 = new Facultad("UTN");

        Carrera TUP = new Carrera("TUP");
        Carrera ISI = new Carrera("ISI");

        Materia mates = new Materia("Matematicas", p1);
        Materia qui = new Materia("Quimica", p1);

        mates.agregarEstudiante(e1);
        qui.agregarEstudiante(e1);

        f1.agregarCarrera(TUP);
        f1.agregarCarrera(ISI);

        f1.mostrarCarreras();

        f1.eliminarCarrera("ISI");

        f1.mostrarCarreras();

        TUP.agregarMateria(mates);
        TUP.agregarMateria(qui);

        TUP.encontrarMateria("Matematicas");

        TUP.mostrarMaterias();
        //TUP.encontrarMateria("matematicas");

    }
}
