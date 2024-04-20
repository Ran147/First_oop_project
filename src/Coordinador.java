import java.util.LinkedList;

public class Coordinador extends Persona {
    private Departamento departamento;
    private LinkedList<Profesor> listaProfesores;

    public Coordinador(String nombre, int cedula, Departamento departamento) {
        super(nombre, cedula);
        this.departamento = departamento;
        this.listaProfesores = new LinkedList<>();
    }

    public void addProfesor(String nombre, int cedula, Departamento departamento) {
        this.listaProfesores.add(new Profesor(nombre,cedula,departamento));
    }

    public LinkedList<Profesor> getListaProfesores() {
        return listaProfesores;
    }
}

