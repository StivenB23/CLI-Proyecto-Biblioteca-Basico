import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import Dao.LibroImpl;
import Dao.UsuarioImpl;
import Model.Libro;
import Model.Usuario;

public class App {
    static Scanner entradaDato = new Scanner(System.in);
    private static UsuarioImpl usuarioDao = UsuarioImpl.getInstance();
    private static LibroImpl libroDao = LibroImpl.getInstance();

    public static void main(String[] args) throws Exception {
        int opcion;
        System.out.println("\u001B[34m" + "*******************************************");
        System.out.println("|   Bienvenido al sistema de biblioteca   |");
        System.out.println("*******************************************" + "\u001B[0m");
        do {
            mostrarModulos();
            opcion = seleccionarOpcion(3);
            switch (opcion) {
                case 1:
                    int opcionUsuario;
                    do {
                        submenuUsuario();
                        opcionUsuario = seleccionarOpcion(6);
                        moduloUsuario(opcionUsuario);
                    } while (opcionUsuario != 6);

                    break;
                case 2:
                    int opcionLibro;
                    do {
                        submenuLibro();
                        opcionLibro = seleccionarOpcion(4);
                        moduloLibro(opcionLibro);
                    } while (opcionLibro != 4);
                    break;

                default:
                    break;
            }
        } while (opcion != 3);
        System.out.println("Gracias por usar este aplicativo, vuelve pronto.");
    }

    public static void mostrarModulos() {
        // System.out.println("*******************************************");
        System.out.println("|                                         |");
        System.out.println("|   1. Modulo Usuarios                    |");
        System.out.println("|   2. Modulo Libros                      |");
        System.out.println("|   3. Salir                              |");
        System.out.println("|                                         |");
        System.out.println("*******************************************");
    }

    public static void submenuUsuario() {
        System.out
                .println("\u001B[34m" + "***************" + "\u001B[1m" + " Usuario *******************" + "\u001B[0m");
        System.out.println("|                                         |");
        System.out.println("|   1. Listar                             |");
        System.out.println("|   2. Buscar                             |");
        System.out.println("|   3. Crear                              |");
        System.out.println("|   4. Prestar libro                      |");
        System.out.println("|   5. Devolver libro                     |");
        System.out.println("|   6. Salir del modulo                   |");
        System.out.println("|                                         |");
        System.out.println("*******************************************");
        System.out.println("");
    }

    public static void submenuLibro() {
        System.out
                .println("\u001B[34m" + "***************" + "\u001B[1m" + " Libros ********************" + "\u001B[0m");
        System.out.println("|                                         |");
        System.out.println("|   1. Listar                             |");
        System.out.println("|   2. Buscar                             |");
        System.out.println("|   3. Crear                              |");
        System.out.println("|   4. Salir del modulo                   |");
        System.out.println("|                                         |");
        System.out.println("*******************************************");
        System.out.println("");
    }

    public static int seleccionarOpcion(int numeroMaximoopciones) {
        int opcion;
        do {
            try {
                System.out.println("Escribe el número (1 o " + numeroMaximoopciones
                        + ") del Opcion modulo o función que deseas usar:");
                opcion = entradaDato.nextInt();
                if (opcion <= 0 || opcion > numeroMaximoopciones) {
                    System.out.println("\u001B[31m" + "Número fuera de rango. Por favor, ingresa un número válido (1 o "
                            + numeroMaximoopciones + ")." + "\u001B[0m");
                }
            } catch (InputMismatchException e) {
                System.out
                        .println("\u001B[31m" + "Entrada inválida. Por favor, ingresa un número entero." + "\u001B[0m");
                entradaDato.next(); // Limpiar el búfer de entrada
                opcion = 0;
            }
        } while (opcion > numeroMaximoopciones || opcion <= 0);
        return opcion;
    }

    public static void moduloUsuario(int opcionFuncionalidad) {
        switch (opcionFuncionalidad) {
            case 1:
                List<Usuario> usuarios = usuarioDao.listarsUsuarios();
                if (usuarios.isEmpty()) {
                    System.out.println("\u001B[1m" + "\u001B[38;5;202m"
                            + "-> No hay usuarios en el sistema, por favor registre alguno" + "\u001B[0m");
                    return;
                }
                System.out.println(usuarios);
                break;
            case 3:
                String identificador, nombre, correo;
                entradaDato.nextLine();
                System.out.println("Ingrese su número de documento");
                identificador = entradaDato.nextLine();
                System.out.println("Ingrese su nombre");
                nombre = entradaDato.nextLine();
                System.out.println("Ingrese su correo");
                correo = entradaDato.nextLine();
                Usuario nuevoUsuario = new Usuario(identificador, nombre, correo);
                usuarioDao.guardarUsuario(nuevoUsuario);
                break;
            case 4:
                String  identificacionUsuario;
                int numeroLibro;                
                entradaDato.nextLine();
                System.out.println("Ingrese su número de documento");
                identificacionUsuario = entradaDato.nextLine();
                libroDao.imprimirLibros();
                System.out.println("Ingrese el número del libro que desea solicitar el prestamo");
                numeroLibro = entradaDato.nextInt();
                
                usuarioDao.prestarLibroUsuario(identificacionUsuario, numeroLibro);
                break;

            default:
                break;
        }
    }

    public static void moduloLibro(int opcionFuncionalidad) {
        switch (opcionFuncionalidad) {
            case 1:
                Stack<Libro> libros = libroDao.listarLibros();
                if (libros.empty()) {
                    System.out.println("\u001B[1m" + "\u001B[38;5;202m"
                            + "-> La biblioteca no tiene libros, por favor registre alguno" + "\u001B[0m");
                    return;
                }
                System.out.println(libros);
                break;
            case 2:
                entradaDato.nextLine();
                String filtroBusqueda;
                try {
                    System.out.println("Ingrese el titulo del libro a buscar");
                    filtroBusqueda = entradaDato.nextLine();
                    Libro libro = libroDao.buscarLibroTitulo(filtroBusqueda);
                    System.out.println(libro);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 3:
                try {
                    String titulo, autor, editorial, fechaPublicacion;
                    int edicion;
                    titulo = entradaDato.nextLine();
                    System.out.println("Ingrese el titulo del libro");
                    titulo = entradaDato.nextLine();
                    System.out.println("Ingrese el autor del libro");
                    autor = entradaDato.nextLine();
                    System.out.println("Ingrese la editorial del libro");
                    editorial = entradaDato.nextLine();
                    System.out.println("Ingrese el edición del libro");
                    edicion = entradaDato.nextInt();
                    entradaDato.nextLine();
                    System.out.println("Ingrese la fecha de publicación del libro");
                    fechaPublicacion = entradaDato.nextLine();

                    Libro nuevoLibro = new Libro(titulo, autor, editorial, edicion, fechaPublicacion);
                    
                    libroDao.guardarLibro(nuevoLibro);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 4:

                break;
            case 5:

                break;

            default:
                break;
        }
    }

}
