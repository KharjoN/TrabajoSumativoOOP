package models;

import java.util.Date;

public class autor /*extends persona*/ {
    
   // private persona persona;
    private Date fechaNacimiento;
    private String nacionalidad;

    public autor(Date fechaNacimiento, String nacionalidad) {
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
    }

    // Getters

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    // Setters

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNacionalidad(String nombre) {
        this.nacionalidad = nacionalidad;
    }
}
