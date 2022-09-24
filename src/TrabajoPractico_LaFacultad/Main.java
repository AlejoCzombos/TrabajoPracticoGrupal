package TrabajoPractico_LaFacultad;

import java.util.LinkedList;

public class Main {

    public static void main(String [] args){


        LinkedList<Estudiante> estudiantes = new LinkedList<>();

        estudiantes.add(new Estudiante("Alejo", "Czombos", 222222));
        estudiantes.add(new Estudiante("Agustin", "Campanella", 27345));
        estudiantes.add(new Estudiante("Agustin", "Mansilla", 23541));
        estudiantes.add(new Estudiante("Jose", "Alegre", 88888));

        Profesor profesor1 = new Profesor("Facundo", "Uferer", 23456);

        Materia LaboratorioII = new Materia("LaboratorioII", profesor1,estudiantes);

        System.out.println( "Materia por default: "  + LaboratorioII.toString());

        LaboratorioII.agregarEstudiante(new Estudiante("Matias", "Barboza", 27107));

        System.out.println("\n Materia con estudiante agregado: " + LaboratorioII.toString());

        LaboratorioII.eliminarEstudiante("Jose");

        System.out.println("\n Materia con estudiante de nombre 'Jose' eliminado: " + LaboratorioII.toString());

        LaboratorioII.modificarTitular(new Profesor("Facundo", "Matoff", 23564));

        System.out.println("\n Materia con profesor modificado: " + LaboratorioII.toString());

    }

}
