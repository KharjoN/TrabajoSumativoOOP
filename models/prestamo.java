package models;

import java.util.Date;

public class Prestamo{

    private Date fecha_prestamo;
    private Date fecha_devolucion;
    private Libro libro;
    private Usuario usuario;

    public Prestamo(Date fecha_prestamo, Date fecha_devolucion, Libro libro, Usuario usuario) {
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_devolucion = fecha_devolucion;
        this.libro = libro;
        this.usuario = usuario;
    }
    
    // Getters
    public Date getFecha_prestamo() {
        return fecha_prestamo;
    }

    public Date getFecha_devolucion() {
        return fecha_devolucion;
    }

    public Libro getLibro() {
        return libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    // Setters

    public void setFecha_prestamo(Date fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public void setFecha_devolucion(Date fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
}