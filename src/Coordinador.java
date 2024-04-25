import javax.lang.model.type.NullType;
import java.util.LinkedList;

public class Coordinador extends Persona {
    private Departamento departamento;
    private LinkedList<Profesor> listaProfesores;
    private Horario horario_coordinador;

    public Coordinador(String nombre, int cedula, Departamento departamento) {
        super(nombre, cedula);
        this.departamento = departamento;
        this.listaProfesores = new LinkedList<>();
        this.horario_coordinador = new Horario("Horario-coordinador");
    }

    public void addProfesor(String nombre, int cedula, Departamento departamento) {
        this.listaProfesores.add(new Profesor(nombre,cedula,departamento));
    }
    public Profesor encontrar(String nombre) {
        for (Profesor profesor : listaProfesores) {
            if (profesor.getNombre().equals(nombre)) {
                return profesor;
            }
        }
        return null;
    }


    public LinkedList<Profesor> getListaProfesores() {
        return listaProfesores;
    }
}

