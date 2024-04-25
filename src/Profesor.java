import java.util.LinkedList;

public class Profesor extends Persona{

    private Departamento departamento;
    private LinkedList<Asignatura> lista_asignatura;
    private Horario horario_prof;

    public Profesor(String nombre, int cedula, Departamento departamento) {
        super(nombre, cedula);
        this.departamento = departamento;
        this.lista_asignatura = new LinkedList<>();
        this.horario_prof = new Horario("Horario-"+nombre);
    }
    public void escoger_Asignatura(LinkedList<String> lista){
        for(String nombre:lista){
            for(Asignatura asignaturas: GlobalResources.getListaAsignaturas()){
                if(asignaturas.getNombre_asig().equals(nombre)){
                    lista_asignatura.add(asignaturas);
                    break; // Break the inner loop since we found a match

                }
            }
        }
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public Horario getHorario_prof() {
        return horario_prof;
    }
}
