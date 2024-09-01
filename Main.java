import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import models.Libro;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        List<Libro> libros = new ArrayList<Libro>();
        insertarLibro(libros);
        listarlibros(libros);
    }

    public static void insertarLibro(List<Libro> libros){   
        Libro libro = new Libro("Clean Code:A Handbook of Agile Software Craftsmanship", "9780132350884", 2008, LocalDate.of(1952,12,17),"Rober C.Martin","Robert","Martin","Estadounidense");
        Libro.insertarLibro(libros,libro);
    } 

    public static void listarlibros(List<Libro> libros){
        Libro.listarlibros(libros);
    }
}


