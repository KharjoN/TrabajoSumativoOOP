package models;

import java.time.*;

public class Prestamo{

    private LocalDate fecha_prestamo;
    private LocalDate fecha_devolucion;
    private Libro libro;
    private Usuario usuario;

    public Prestamo(LocalDate fecha_prestamo, LocalDate fecha_devolucion, Libro libro, Usuario usuario) {
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_devolucion = fecha_devolucion;
        this.libro = libro;
        this.usuario = usuario;
    }
    
    // Getters
    public LocalDate getFecha_prestamo() {
        return fecha_prestamo;
    }

    public LocalDate getFecha_devolucion() {
        return fecha_devolucion;
    }

    public Libro getLibro() {
        return libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    // Setters

    public void setFecha_prestamo(LocalDate fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public void setFecha_devolucion(LocalDate fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
}