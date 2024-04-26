import java.util.LinkedList;
import java.util.Scanner;


public class Submenu_one {
    public static void displaysubmenu_one(Profesor profesor){
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> lista_strings = new LinkedList<>();

        while(true){
            System.out.println("----------PROFESSOR HUB-----------");
            System.out.println("1. Seleccion de cursos ");
            System.out.println("2. Seleccion de dias"); //eliminar
            System.out.println("3. Ver dias preliminares ");
            System.out.println("4. Salir ");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (choice){
                case 1:
                    System.out.println("Choose your courses: ");
                    GlobalResources.printListaAsignaturas(profesor.getDepartamento());
                    System.out.println("Write the name of the course: (0, to exit)");
                    while(true){
                        System.out.println("Nombre: ");
                        String respuesta = scanner.nextLine();
                        lista_strings.add(respuesta);
                        if(respuesta.equals("0")){
                            break;
                        }
                    }
                    profesor.escoger_Asignatura(lista_strings);
                    break;
                case 2:
                    System.out.println("Choose the day where you'll teach: ");
                    profesor.getHorario_prof().printHorarioSimplificado();
                    System.out.println("Write 0 to close ");
                    while(true){
                        System.out.println("Day: ");
                        String day = scanner.nextLine();
                        if(day.equals("0")){
                            break;
                        }
                        else{
                            System.out.println("Course: ");
                            String name = scanner.nextLine();
                            Asignatura courseobj = profesor.search_course(name);
                            profesor.search_block(day,courseobj);
                            // acceder al dia, despues los bloques del dia y se escribe ahi el curso
                            //no se escribe aula todavia, es hasta que el coordinador lo genere.
                        }
                        profesor.getHorario_prof().printHorarioSimplificado();

                    }
                case 3:
                    profesor.getHorario_prof().printHorarioSimplificado();
                    break;

                case 4:
                    System.out.println("Saliendo....");
                    return;
                default:
                    System.out.println("Opcion invalida ");
            }

        }
    }
}
