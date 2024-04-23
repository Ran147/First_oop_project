import java.util.LinkedList;

public class Profesor extends Persona{

    private Departamento departamento;
    private LinkedList<Asignatura> asignatura;
    private Horario horario_prof;

    public Profesor(String nombre, int cedula, Departamento departamento) {
        super(nombre, cedula);
        this.departamento = departamento;
        this.asignatura = new LinkedList<>();
        this.horario_prof = new Horario("Horario-"+nombre);
    }
    void escoger_Asignatura(Asignatura asig){
        asignatura.add(asig);
    }

    public Departamento getDepartamento() {
        return departamento;
    }
}
