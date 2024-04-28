public class Asignatura {
    private String nombre_asig;
    private int creditos;
    private Departamento departamento;
    private int semestre;

    public Asignatura(String nombre_asig, int creditos, Departamento departamento, int semestre) {
        this.nombre_asig = nombre_asig;
        this.creditos = creditos;
        this.departamento = departamento;
        this.semestre = semestre;
    }

    public int cantidad_horas(){
        if(creditos==4 || creditos ==3){
            return 15;
        } else if (creditos<3) {
            return 8;

        }
        return 0;
    }


    public String getNombre_asig() {
        return nombre_asig;
    }

    public int getCreditos() {
        return creditos;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public int getSemestre() {
        return semestre;
    }
}
