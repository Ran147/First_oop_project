import java.util.LinkedList;
import java.util.Scanner;

public class Submenu_two {
    public static void displaysubmenu_two(Coordinador coordinador){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("----------Coordinador HUB-----------");
            System.out.println("1. Generar horarios");
            System.out.println("2. Ver horarios"); //eliminar
            System.out.println("3. Salir");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (choice){
                case 1:
                    System.out.println("Seleccione el semestre (1 o 2)");
                    int semestre_numero = scanner.nextInt();
                    scanner.nextLine();
                    coordinador.encontrarprofesor_semestre(semestre_numero);
                    if(semestre_numero==2) {
                        for (Profesor profesor : coordinador.getListaprofesoresS2()) { //numero de semestre
                            for (Dia dia : profesor.getHorario_prof().getDias()) {
                                if (!dia.getCursitos().isEmpty()) {
                                    String nombre_dia = dia.getNombre_dia();
                                    LinkedList<Asignatura> cursos_del_dia = dia.getCursitos();
                                    Profesor profesor_del_dia = profesor;

                                    coordinador.acomodar_horario(nombre_dia, cursos_del_dia, profesor_del_dia, coordinador);

                                }

                            }
                        }
                    }
                    else{
                        for (Profesor profesor : coordinador.getListaprofesoresS1()) { //numero de semestre
                            for (Dia dia : profesor.getHorario_prof().getDias()) {
                                if (!dia.getCursitos().isEmpty()) {
                                    String nombre_dia = dia.getNombre_dia();
                                    LinkedList<Asignatura> cursos_del_dia = dia.getCursitos();
                                    Profesor profesor_del_dia = profesor;
                                    coordinador.acomodar_horario(nombre_dia, cursos_del_dia, profesor_del_dia, coordinador);

                                }

                            }
                        }

                    }
                    //ya tendria divididos los profesores que dan cursos de semestre 1 y 2 pero tiene que ser en pares e impares

            break;
                case 2:
                    System.out.println("Buscando semestres.... ");
                    coordinador.ver_horario();
                    System.out.println("Prueba");
                    break;
                case 3:
                    System.out.println("Saliendo....");
                    return;
                default:
                    System.out.println("Opcion invalida ");
            }

        }
    }
}
