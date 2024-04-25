import java.util.LinkedList;

public class GlobalResources {
    private static LinkedList<Asignatura> listaAsignaturas = new LinkedList<>();
    private static LinkedList<Aula> listaAulas = new LinkedList<>();

    public static void addAsignatura(Asignatura asignatura) {
        listaAsignaturas.add(asignatura);
    }

    public static void addAula(Aula aula) {
        listaAulas.add(aula);
    }

    public static void printListaAsignaturas(Departamento departamento) {
        System.out.println("Lista de Asignaturas:");
        for (Asignatura asignatura : listaAsignaturas) {
            if (asignatura.getDepartamento().equals(departamento)) {
                System.out.println("Nombre: " + asignatura.getNombre_asig() + ", Créditos: " + asignatura.getCreditos() + ", Departamento: " + asignatura.getDepartamento().getNombre());
            }
        }
    }

    public static void printListaAulas() {
        System.out.println("Lista de Aulas:");
        for (Aula aula : listaAulas) {
            System.out.println("Nombre: " + aula.getNombre() + ", Número: " + aula.getNumero_aula() + ", Capacidad: " + aula.getCapacidad() + ", Ubicación: " + aula.getUbicacion());
        }
    }

    public static LinkedList<Asignatura> getListaAsignaturas() {
        return listaAsignaturas;
    }

    public static LinkedList<Aula> getListaAulas() {
        return listaAulas;
    }
}
