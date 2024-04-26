import java.util.LinkedList;

public class Dia {
    private String nombra_dia;
    private LinkedList<Bloque> bloques;
    private LinkedList<Asignatura> cursitos;

    public Dia(String nombra_dia) {
        this.nombra_dia = nombra_dia;
        this.bloques = new LinkedList<>();
        this.cursitos = new LinkedList<>();
        inicializarbloques();
    }
    void inicializarbloques(){
        bloques.add(new Bloque("7:30-8:20",true));
        bloques.add(new Bloque("8:30-9:20",true));
        bloques.add(new Bloque("9:30-10:20",true));
        bloques.add(new Bloque("10:30-11:20",true));
        bloques.add(new Bloque("11:30-12:20",false));
        bloques.add(new Bloque("12:30-12:50",false));
        bloques.add(new Bloque("13:00-13:50",true));
        bloques.add(new Bloque("14:00-14:50",true));
        bloques.add(new Bloque("15:00-15:50",true));
        bloques.add(new Bloque("16:00-16:50",true));
        bloques.add(new Bloque("17:00-17:50",true));
        bloques.add(new Bloque("18:00-18:50",true));
        bloques.add(new Bloque("19:00-19:50",true));
        bloques.add(new Bloque("20:00-20:50",true));
        bloques.add(new Bloque("21:00-21:50",true));
    }
    public void printDiaInfo() {
        System.out.println("Horario para " + nombra_dia + ":");
        for (Bloque bloque : bloques) {
            System.out.println(bloque.getEspacio() + " - Disponible: " + (bloque.getDisponibilidad() ? "Sí" : "No"));
        }
    }

    public String getNombre_dia() {
        return nombra_dia;
    }

    public LinkedList<Bloque> getBloques() {
        return bloques;
    }

    public LinkedList<Asignatura> getCursitos() {
        return cursitos;
    }
    public void addcurso(Asignatura asig){
        cursitos.add(asig);
    }
}
