package models;
import java.time.*;
import java.util.*;

public class Libro extends Autor {

    private String titulo;
    private String isbn;
    private int anioPublicacion;
    
    
    public Libro(String titulo, String isbn, int anioPublicacion, LocalDate fechaNacimiento,String nombreAlias,String nombre, String apellido, String nacionalidad) {
        super(fechaNacimiento, nacionalidad, nombre, apellido, nombreAlias);
        this.titulo = titulo;
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
    }

    //Getters

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
 
    public String getAutor() {
        return nombreAlias;
    }

    //Setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public void setAutor(String nombreAlias) {
        this.nombreAlias = nombreAlias;
    }

    //Metodos

    public static void insertarLibro(List<Libro> libros,Libro libro) {
        libros.add(libro);
    }

    public static void listarlibros(List<Libro> libros) {
        int numero = 1;
        System.out.println("Lista de libros:");
        System.out.println("-----------------");
        for (Libro libro : libros) {
            System.out.println("Libro " + numero);
            System.err.println("-----------------");
            System.out.println("Titulo: " + libro.getTitulo());
            System.out.println("ISBN: " + libro.getIsbn());
            System.out.println("Año Publicacion: " + libro.getAnioPublicacion());
            System.out.println("Nombre: " + libro.getNombre());
            System.out.println("Apellido: " + libro.getApellido());
            System.out.println("Alias: " + libro.getNombreAlias());
            System.out.println("Nacionalidad: " + libro.getNacionalidad());
            System.out.println("-----------------");
            numero++;

        }
    }
}


