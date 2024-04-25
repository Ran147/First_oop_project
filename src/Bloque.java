public class Bloque {
    private String espacio;
    private boolean disponibilidad;
    private Aula aula;
    private Asignatura curso;

    public Bloque(String espacio, boolean disponibilidad) {
        this.espacio = espacio;
        this.disponibilidad = disponibilidad;
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
}
