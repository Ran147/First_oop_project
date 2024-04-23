import java.util.LinkedList;

public class Estudiantado {
    private LinkedList<Estudiante> lista_estudiantes;

    public Estudiantado() {
        this.lista_estudiantes = lista_estudiantes;
    }
    void anadir_Estudiantes(String nombre, int cedula){
        lista_estudiantes.add(new Estudiante(nombre, cedula));
    }
}
