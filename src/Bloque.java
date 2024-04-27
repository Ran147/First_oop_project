public class Bloque {
    private String espacio;
    private boolean disponibilidad;
    private Aula aula;
    private Asignatura curso;
    private String profe;

    public Bloque(String espacio, boolean disponibilidad) {
        this.espacio = espacio;
        this.disponibilidad = disponibilidad;
        this.profe = profe;
    }
    public String getEspacio() {
        return espacio;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setEspacio(String espacio) {
        this.espacio = espacio;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Asignatura getCurso() {
        return curso;
    }

    public void setCurso(Asignatura curso) {
        this.curso = curso;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public void setProfe(String profe) {
        this.profe = profe;
    }
}
