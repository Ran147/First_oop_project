import java.util.LinkedList;

public class Horario {
    private String nombre_horario;
    private LinkedList<Dia> dias;

    public Horario(String nombre_horario) {
        this.nombre_horario = nombre_horario;
        this.dias = new LinkedList<>();
        inicializardia();
    }
    void inicializardia(){
        dias.add(new Dia("Lunes"));
        dias.add(new Dia("Martes"));
        dias.add(new Dia("Miercoles"));
        dias.add(new Dia("Jueves"));
        dias.add(new Dia("Viernes"));
    }
    // Getter methods for accessing the days
    public LinkedList<Dia> getDias() {
        return dias;
    }
}
