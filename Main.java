import models.*;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        insertarLibro();;
        listarLibros();
        
    }

    public static void listarLibros(){
        libro libro = new Libro();
        List<libro> libros = libro.listar();
        for (libro libro : libros) {
            System.out.println(libro.getTitulo());
        }

        System.out.println("--------------------");
    }

    public static void insertarLibro(){
        libro libro = new Libro();
        libro.setTitulo("El principito");
        libro.setIsbn("978-3-16-148410-0");
        libro.setAnioPublicacion(1943);
        //libro.setAutor("Antoine de Saint-Exupéry");
        libro.insertar();
    }
}
