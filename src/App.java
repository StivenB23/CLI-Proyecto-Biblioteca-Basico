import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static Scanner entradaDato = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("*******************************************");
        System.out.println("|   Bienvenido al sistema de biblioteca   |");
        System.out.println("*******************************************");
        mostrarModulos();
        int opcion = seleccionarOpcion();
        switch (opcion) {
            case 1:
                System.out.println("Usuario");
                submenuUsuario();
                break;
            case 2:
                System.out.println("Libros");
                submenuLibro();
                break;

            default:
                break;
        }
    }

    public static void mostrarModulos() {
        // System.out.println("*******************************************");
        System.out.println("|                                         |");
        System.out.println("|   1. Modulo Usuarios                    |");
        System.out.println("|   2. Modulo Libros                      |");
        System.out.println("|                                         |");
        System.out.println("*******************************************");
    }

    public static void submenuUsuario() {
        System.out.println("****************Usuario********************");
        System.out.println("|                                         |");
        System.out.println("|   1. Listar                             |");
        System.out.println("|   2. Buscar                             |");
        System.out.println("|   3. Crear                              |");
        System.out.println("|   4. Prestar libro                      |");
        System.out.println("|   5. Devolver libro                     |");
        System.out.println("|                                         |");
        System.out.println("*******************************************");
    }
    public static void submenuLibro() {
        System.out.println("****************Libros*********************");
        System.out.println("|                                         |");
        System.out.println("|   1. Listar                             |");
        System.out.println("|   2. Buscar                             |");
        System.out.println("|   3. Crear                              |");
        System.out.println("|   4. Prestar libro                      |");
        System.out.println("|   5. Devolver libro                     |");
        System.out.println("|                                         |");
        System.out.println("*******************************************");
    }

    public static int seleccionarOpcion() {
        int opcion;
        do {
            try {
                System.out.println("Escribe el número (1 o 2) del Opcionmodulo que deseas usar:");
                opcion = entradaDato.nextInt();
                if (opcion <= 0 || opcion > 2) {
                    System.out.println("Número fuera de rango. Por favor, ingresa un número válido (1 o 2).");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingresa un número entero.");
                entradaDato.next(); // Limpiar el búfer de entrada
                opcion = 0; // Reiniciar la variable opción para que vuelva a solicitar la entrada
            }
        } while (opcion > 2 || opcion <= 0);
        return opcion;
    }
}
