import java.util.List;
import java.util.Scanner;
import java.util.LinkedList;
public class Main {

    public static void main(String[] args) {

        //Departamentos---------------------------------------------
        Departamento departamento = new Departamento("Ingenieria en computacion");
        Departamento departamento1 = new Departamento("Escuela de matematicas");
        //Unico coordinador----------------------------------------------------
        Coordinador coordinador = new Coordinador("Efren", 20393983, departamento);
        //Profesores----------------------------------------------------------
        coordinador.addProfesor("Randy", 504470537, departamento);
        coordinador.addProfesor("Alicia", 504470538, departamento1);
        coordinador.addProfesor("Carlos", 504470539, departamento);
        coordinador.addProfesor("Maria", 504470540, departamento);
        coordinador.addProfesor("Jose", 504470541, departamento1);
        coordinador.addProfesor("Lucia", 504470542, departamento);
        coordinador.addProfesor("Manuel", 504470543, departamento);
        coordinador.addProfesor("Sofia", 504470544, departamento1);
        coordinador.addProfesor("Ricardo", 504470545, departamento);
        coordinador.addProfesor("Elena", 504470546, departamento);
        //Cursos-----------------------------------------------------------------
        GlobalResources.addAsignatura(new Asignatura_Teorica("Matemáticas Discretas", 3, departamento1, "Online"));
        GlobalResources.addAsignatura(new Asignatura_Practica("Programación", 4, departamento, "Libros", "Windows"));
        GlobalResources.addAsignatura(new Asignatura_Teorica("Algebra Lineal", 3, departamento1, "Sala de conferencias"));
        GlobalResources.addAsignatura(new Asignatura_Teorica("Calculo Diferencial", 3, departamento1, "Online"));
        GlobalResources.addAsignatura(new Asignatura_Teorica("Estadística", 2, departamento1, "Aula 203"));
        GlobalResources.addAsignatura(new Asignatura_Practica("Redes", 4, departamento, "Routers y Switches", "Linux"));
        GlobalResources.addAsignatura(new Asignatura_Practica("Base de Datos", 3, departamento, "SQL Servers", "Windows"));
        //Aulas--------------------------------------------------------------------
        GlobalResources.addAula(new Aula_Teorica("Aula 101", 101, 30, "Edificio A", true, true));
        GlobalResources.addAula(new Aula_Practica("Laboratorio Comp", 102, 20, "Edificio B", 15, "PCs"));
        GlobalResources.addAula(new Aula_Teorica("Aula 202", 202, 25, "Edificio C", true, false));
        GlobalResources.addAula(new Aula_Teorica("Aula 303", 303, 50, "Edificio D", false, true));
        GlobalResources.addAula(new Aula_Teorica("Aula 404", 404, 40, "Edificio E", true, true));
        GlobalResources.addAula(new Aula_Practica("Laboratorio Electrónica", 205, 15, "Edificio F", 10, "Osciloscopios"));
        GlobalResources.addAula(new Aula_Practica("Laboratorio Química", 206, 20, "Edificio G", 20, "Material Químico"));
        //Estudiantes---------------------------------------------------------------
        Estudiantado listasE = new Estudiantado();
        listasE.anadir_Estudiantes("Mathew", 229392);
        listasE.anadir_Estudiantes("Tinkyweed", 11292);

    }
}