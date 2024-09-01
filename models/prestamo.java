package models;

import java.util.Date;

public class prestamo /*extends usuario, libro*/{

    private Date fecha_prestamo;
    private Date fecha_devolucion;
    private libro libro;
    private usuario usuario;

    public prestamo(Date fecha_prestamo, Date fecha_devolucion, libro libro, usuario usuario) {
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

    public libro getLibro() {
        return libro;
    }

    public usuario getUsuario() {
        return usuario;
    }

    // Setters

    public void setFecha_prestamo(Date fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public void setFecha_devolucion(Date fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public void setLibro(libro libro) {
        this.libro = libro;
    }

    public void setUsuario(usuario usuario) {
        this.usuario = usuario;
    }

    
}