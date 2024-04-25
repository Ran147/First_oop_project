public class Asignatura {
    private String nombre_asig;
    private int creditos;
    private Departamento departamento;

    public Asignatura(String nombre_asig, int creditos, Departamento departamento) {
        this.nombre_asig = nombre_asig;
        this.creditos = creditos;
        this.departamento = departamento;
    }

    public int cantidad_horas(){
        int horas = 3;
        int horas_semana;
        horas_semana = horas * creditos;
        return horas_semana;
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
}
