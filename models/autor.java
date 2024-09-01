package models;

import java.time.*;

public class Autor extends Persona {
    
    public LocalDate fechaNacimiento;
    public String nacionalidad;
    public String nombreAlias;

    public Autor(LocalDate fechaNacimiento, String nacionalidad, String nombre, String apellido, String nombreAlias) {
        super(nombre, apellido);
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.nombreAlias = nombreAlias;
    }

    // Getters

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getNombreAlias() {
        return nombreAlias;
    }

    // Setters

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setNombreAlias(String nombreAlias) {
        this.nombreAlias = nombreAlias;
    }
}
