import java.util.LinkedList;
import java.util.ListIterator;

public class Horario {
    private String nombre_horario;
    private LinkedList<Dia> dias;
    private int semestre;

    public Horario(String nombre_horario,int semestre) {
        this.nombre_horario = nombre_horario;
        this.dias = new LinkedList<>();
        this.semestre = semestre;
        inicializardia();
    }
    void inicializardia(){
        dias.add(new Dia("Lunes"));
        dias.add(new Dia("Martes"));
        dias.add(new Dia("Miercoles"));
        dias.add(new Dia("Jueves"));
        dias.add(new Dia("Viernes"));
    }
    // Getter methods for accessing the days
    public LinkedList<Dia> getDias() {
        return dias;
    }
    public void printHorario() {
        System.out.println("Horario: " + nombre_horario);
        for (Dia dia : dias) {
            System.out.println("Día: " + dia.getNombre_dia());
            for (Bloque bloque : dia.getBloques()) {
                System.out.print("  - Espacio: " + bloque.getEspacio());
                System.out.print(" - Disponibilidad: " + (bloque.getDisponibilidad() ? "Disponible" : "No disponible"));
                if (bloque.getCurso() != null) {
                    System.out.println(" - Curso: " + bloque.getCurso().getNombre_asig());
                } else {
                    System.out.println();
                }
            }
        }
    }
    public void printHorarioSimplificado() {
        System.out.println("Horario: " + nombre_horario);
        for (Dia dia : dias) {
            System.out.print("Día: " + dia.getNombre_dia());
            LinkedList<Asignatura> cursos = dia.getCursitos();  // Assuming Dia class has this method
            if (cursos.isEmpty()) {
                System.out.println(" - No hay cursos asignados");
            } else {
                System.out.println(" - Cursos: ");
                for(Asignatura curso:cursos){
                    System.out.println("--Nombre: "+curso.getNombre_asig()+"--Semestre: "+curso.getSemestre());
                }
            }
        }
    }


    public int getSemestre() {
        return semestre;
    }
}
