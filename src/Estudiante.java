import java.util.LinkedList;

public class Estudiante extends Persona {
    public Estudiante(String nombre, int cedula) {
        super(nombre, cedula);
    }
    public void ver_horario(LinkedList<Horario> horarios, int num) {
        for (Horario horario : horarios) {
            if (horario.getSemestre() == num) {
                System.out.println("-----------Horario Semestre: " + horario.getSemestre() + " -------------------");
                for (Dia dia : horario.getDias()) {
                    System.out.println("------" + dia.getNombre_dia() + "------");
                    System.out.println("-------Cursos-------");
                    for (Bloque bloque : dia.getBloques()) {
                        System.out.print(" - Espacio: " + bloque.getEspacio());
                        System.out.println(" - Profesor: "+ bloque.getProfe());
                        if (bloque.getCurso() != null) {
                            System.out.println(" - Curso: " + bloque.getCurso());
                        } else {
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}
