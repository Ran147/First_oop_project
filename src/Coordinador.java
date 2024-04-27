import javax.lang.model.type.NullType;
import java.util.LinkedList;

public class Coordinador extends Persona {
    private Departamento departamento;
    private LinkedList<Profesor> listaProfesores;
    private LinkedList<Horario> horario_semestre;
    private LinkedList<Profesor> listaprofesoresS1;
    private LinkedList<Profesor> listaprofesoresS2;


    public Coordinador(String nombre, int cedula, Departamento departamento) {
        super(nombre, cedula);
        this.departamento = departamento;
        this.listaProfesores = new LinkedList<>();
        this.listaprofesoresS1 = new LinkedList<>();
        this.listaprofesoresS2 = new LinkedList<>();
        this.horario_semestre = new LinkedList<>();
    }

    public void addProfesor(String nombre, int cedula, Departamento departamento) {
        this.listaProfesores.add(new Profesor(nombre,cedula,departamento));
    }
    public void add_horario(String nombre, int semestre){
        horario_semestre.add(new Horario("Horario-"+nombre,semestre));
    }
    public void addprofesorS1(Profesor profesors1){
        listaprofesoresS1.add(profesors1);
    }
    public void addprofesorS2(Profesor profesors2){
        listaprofesoresS2.add(profesors2);
    }
    public Profesor encontrar(String nombre) {
        for (Profesor profesor : listaProfesores) {
            if (profesor.getNombre().equals(nombre)) {
                return profesor;
            }
        }
        return null;
    }
    public void encontrarprofesor_semestre(int s){
        for(Profesor profesor:listaProfesores){
            for(Asignatura asignatura:profesor.getLista_asignatura()){
                if(asignatura.getSemestre() % 2 == s % 2){
                    if(asignatura.getSemestre() % 2 != 0){
                        listaprofesoresS1.add(profesor);
                        break;
                    }
                    else{
                        listaprofesoresS2.add(profesor);
                    }
                }
            }
        }

    }
    public void acomodar_horario(String nombre_dia,LinkedList<Asignatura> cursos,Profesor profe){
        for(Asignatura curso:cursos){
            if(horario_semestre.isEmpty()){
                Horario horarioS = new Horario(profe.getNombre(), curso.getSemestre());
                horario_semestre.add(horarioS);
            }
            else {
                boolean banderita = false;
                for (Horario horario : horario_semestre) {
                    if (curso.getSemestre() == horario.getSemestre()) {
                        banderita = true;
                        for(Dia dia : horario.getDias()){
                            if(dia.getNombre_dia().equals(nombre_dia)){

                            }
                        }
                        //añadir logica para entrar entrar al dia
                        //recordar aula

                    }
                }
                if(!banderita){
                    Horario horariosem = new Horario(profe.getNombre(),curso.getSemestre());
                    horario_semestre.add(horariosem);
                }
            }
        }
    }


    public LinkedList<Profesor> getListaProfesores() {
        return listaProfesores;
    }

    public LinkedList<Profesor> getListaprofesoresS1() {
        return listaprofesoresS1;
    }

    public LinkedList<Profesor> getListaprofesoresS2() {
        return listaprofesoresS2;
    }
}

