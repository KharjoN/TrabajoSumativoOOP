import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import models.*;
public class Main {
    public static void main(String[] args) {
        List<Libro> libros = new ArrayList<>();
        List<Usuario> usuarios = new ArrayList<>();
        
        //agreagar libro y usuario de ejemplo
        Libro libro = new Libro("Clean Code:A Handbook of Agile Software Craftsmanship", "9780132350884", 2008, LocalDate.of(1952,12,17),"Robert C. Martin","Robert","Martin","Estadounidense");
        libros.add(libro);
        Usuario usuario = new Usuario(777,"Juanito@correo.com","Juanito","Perez");
        usuarios.add(usuario);
        //Listar libros y usuarios de ejemplo
        listarlibros(libros);
        listarUsuarios(usuarios);
        //Iniciar menu
        while (true) {
            Menu(usuarios,libros,libro,usuario);
        }
    }

    //Metodos
    //Insertar libro
    public static void insertarLibro(List<Libro> libros){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Titulo: " );
        String Titulo = (sc.nextLine());
        System.out.println("ISBN: ");
        String Isbn = (sc.nextLine());
        System.out.println("Año de publicacion: ");
        int AnioPublicacion = Integer.parseInt(sc.nextLine());
        System.out.println("Fecha de nacimiento: ");
        System.out.println("Año: ");
        int anio = Integer.parseInt(sc.nextLine());
        System.out.println("Mes: ");
        int mes = Integer.parseInt(sc.nextLine());
        System.out.println("Dia: ");
        int dia = Integer.parseInt(sc.nextLine());
        LocalDate FechaNacimiento = (LocalDate.of(anio,mes,dia));
        System.out.println("Nombre del autor: ");
        String Nombre = (sc.nextLine());
        System.out.println("Apellido del autor: ");
        String Apellido = (sc.nextLine());
        System.out.println("Alias del autor: ");
        String NombreAlias = (sc.nextLine());
        System.out.println("Nacionalidad del autor: ");
        String Nacionalidad = (sc.nextLine());
        // Crear un objeto Libro
        Libro libro = new Libro(Titulo,Isbn,AnioPublicacion,FechaNacimiento,Nombre,Apellido,NombreAlias,Nacionalidad);
        // Insertar libro a la lista
        Libro.insertarLibro(libros,libro);
        sc.close();
    } 
    //Listar libros
    public static void listarlibros(List<Libro> libros){
        Libro.listarlibros(libros);
    }
    //Insertar usuario
    public static void InsertarUsuario(List<Usuario> usuarios){
        // Crear un objeto Scanner para leer la entrada de la consola
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de identificacion: ");
        int NumeroIdentificacion = Integer.parseInt(sc.nextLine());
        System.out.println("Email: ");
        String Email = (sc.nextLine());
        System.out.println("Nombre: ");
        String Nombre = (sc.nextLine());
        System.out.println("Apellido: ");
        String Apellido = (sc.nextLine());
        // Crear un objeto Usuario
        Usuario usuario = new Usuario(NumeroIdentificacion,Email,Nombre,Apellido);
        // Insertar usuario a la lista
        Usuario.insertarUsuario(usuarios,usuario);
        sc.close();
    }
    //Listar usuarios
    public static void listarUsuarios(List<Usuario> usuarios){
        Usuario.listarUsuarios(usuarios);
    }  
    //Menu
    public static void Menu(List<Usuario> usuarios, List<Libro> libros, Libro libro, Usuario usuario){
        // Crear un objeto Scanner para leer la entrada de la consola
        Scanner sc = new Scanner(System.in); 
        int opcion;
        System.out.println("1. Insertar libro");
        System.out.println("2. Listar libros");
        System.out.println("3. Insertar usuario");
        System.out.println("4. Listar usuarios");
        System.out.println("Seleccione una opcion:");
        opcion = sc.nextInt();
        System.err.println("-----------------");
        // Switch para seleccionar la opcion
        switch(opcion){
            case 1:
                System.out.println("Insertar libro");
                insertarLibro(libros);
                break;
            case 2:
                System.out.println("Listar libros");
                listarlibros(libros);
                break;
            case 3:
                System.out.println("Insertar usuario");
                InsertarUsuario(usuarios);
                break;
            case 4:
                System.out.println("Listar usuarios");
                listarUsuarios(usuarios);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        sc.close();

    }
}
