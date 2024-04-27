import java.util.LinkedList;

public class Profesor extends Persona{

    private Departamento departamento;
    private LinkedList<Asignatura> lista_asignatura;
    private Horario horario_prof;

    public Profesor(String nombre, int cedula, Departamento departamento) {
        super(nombre, cedula);
        this.departamento = departamento;
        this.lista_asignatura = new LinkedList<>();
        this.horario_prof = new Horario("Horario-"+nombre,0);
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
    public void search_block(String day, Asignatura curso) {
        boolean dayFound = false; // Flag to check if the day was found

        for (Dia dia : horario_prof.getDias()) {
            if (dia.getNombre_dia().equals(day)) {
                dia.addcurso(curso); // Ensure this method exists and works as expected
                dayFound = true;
                break; // Stop searching once the correct day is found
            }
        }

        if (!dayFound) {
            System.out.println("No se encuentra el dia"); // Only print if no day matched
        }
    }

    public Asignatura search_course(String nombre){
        for(Asignatura i:lista_asignatura){
            if(i.getNombre_asig().equals(nombre)){
                return i;
            }
        }
        return null;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public Horario getHorario_prof() {
        return horario_prof;
    }

    public LinkedList<Asignatura> getLista_asignatura() {
        return lista_asignatura;
    }
}
