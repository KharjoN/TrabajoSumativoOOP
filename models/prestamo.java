package models;

import java.time.*;

//Solo inlcuimos la clase Usuario para poder heredar de ella, no usamos la clase libro.

public class Prestamo extends Usuario {

    private LocalDate fecha_prestamo;
    private LocalDate fecha_devolucion;

    public Prestamo(LocalDate fecha_prestamo, LocalDate fecha_devolucion, int numeroIdentificacion, String email, String nombre, String apellido) {
        super(numeroIdentificacion, email, nombre, apellido);
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_devolucion = fecha_devolucion;
        
    }
    // Getters
    public LocalDate getFecha_prestamo() {
        return fecha_prestamo;
    }

    public LocalDate getFecha_devolucion() {
        return fecha_devolucion;
    }


    // Setters

    public void setFecha_prestamo(LocalDate fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public void setFecha_devolucion(LocalDate fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

}