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

    @Override
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
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

    @Override
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    //Metodos

    public static void insertarLibro(List<Libro> libros,Libro libro) {
        libros.add(libro);
    }

    public static void listarlibros(List<Libro> libros) {
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo());
            System.out.println(libro.getIsbn());
            System.out.println(libro.getAnioPublicacion());
            System.out.println(libro.getNombre());
            System.out.println(libro.getApellido());
            System.out.println(libro.getNombreAlias());
            System.out.println(libro.getNacionalidad());
        }
    }
}


