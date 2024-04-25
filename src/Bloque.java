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
}
