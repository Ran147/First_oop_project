import java.util.LinkedList;
import java.util.Scanner;


public class Submenu_one {
    public static void displaysubmenu_one(Profesor profesor){
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> lista_strings = new LinkedList<>();

        while(true){
            System.out.println("1. Seleccion de cursos ");
            System.out.println("2. Crear horario ");
            System.out.println("3. Salir ");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Choose your courses: ");
                    GlobalResources.printListaAsignaturas();
                    System.out.println("Write the name of the course: (0, to exit)");
                    while(true){
                        String respuesta = scanner.nextLine();
                        lista_strings.add(respuesta);
                        if(respuesta.equals("0")){
                            break;
                        }
                    }
                    profesor.escoger_Asignatura(lista_strings);
                    break;
                case 2:
                    System.out.println("Choose the day and time where you'll teach: ");
                    profesor.getHorario_prof().printHorario();
                    System.out.println("Write 0 to close ");
                    while(true){
                        String day = scanner.nextLine();
                        String time = scanner.nextLine();
                        if(day.equals("0")|| time.equals("0")){
                            break;
                        }
                        else{
                            // acceder al dia, despues los bloques del dia y se escribe ahi el curso
                            //no se escribe aula todavia, es hasta que el coordinador lo genere.
                        }
                        profesor.getHorario_prof().printHorario();

                    }

                case 3:
                default:
                    System.out.println("Opcion invalida ");
            }

        }
    }
}
