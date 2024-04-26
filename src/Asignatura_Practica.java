public class Asignatura_Practica extends Asignatura{
    private String material_apoyo;
    private String os;

    public Asignatura_Practica(String nombre_asig, int creditos, Departamento departamento, int semestre, String material_apoyo, String os) {
        super(nombre_asig, creditos, departamento, semestre);
        this.material_apoyo = material_apoyo;
        this.os = os;
    }
}
