import java.util.Scanner;

public class Menu {
    public static void displaymenu(Coordinador coordinador, Estudiantado estudiantado){
        Scanner scanner = new Scanner(System.in);
        while(true){
            // Display the menu options
            System.out.println("MENU PRINCIPAL:");
            System.out.println("1. Professor log in");
            System.out.println("2. Coordinator log in");
            System.out.println("3. Student log in");
            System.out.println("4. Exit");

            // Prompt the user to choose an option
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (choice){
                case 1:

                    System.out.println("Redirecting to professor hub");
                    System.out.println("Escriba su nombre: ");
                    String inputs = scanner.nextLine();
                    Profesor search = coordinador.encontrar(inputs);
                    if(search != null){
                        Submenu_one.displaysubmenu_one(search);
                        break;
                    }
                    System.out.println("Professor not found ");
                    break;
                case 2:
                    System.out.println("Redirecting to coordinator hub");
                    //code
                    break;
                case 3:
                    System.out.println("Redirecting to student hub");
                    //code
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close(); // Close the scanner before exiting
                    System.exit(0); // Terminate the program
                default:
                    System.out.println("Invalid choice. Please choose a number between 1 and 4.");
            }
        }


    }
}
