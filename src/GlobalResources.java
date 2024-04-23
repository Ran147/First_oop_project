import java.util.LinkedList;

public class GlobalResources {
    private static LinkedList<Asignatura> listaAsignaturas;
    private static LinkedList<Aula> listaAulas;



    public static void addAsignatura(Asignatura asignatura) {
        listaAsignaturas.add(asignatura);
    }

    public static void addAula(Aula aula) {
        listaAulas.add(aula);
    }

    public static LinkedList<Asignatura> getListaAsignaturas() {
        return listaAsignaturas;
    }

    public static LinkedList<Aula> getListaAulas() {
        return listaAulas;
    }
}
