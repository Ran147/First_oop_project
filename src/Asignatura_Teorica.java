public class Asignatura_Teorica extends Asignatura{
    private String sitio;

    public Asignatura_Teorica(String nombre_asig, int creditos, Departamento departamento,int semestre, String sitio) {
        super(nombre_asig, creditos, departamento,semestre);
        this.sitio = sitio;
    }
}
