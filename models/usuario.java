package models;

public class Usuario extends Persona {
    private String numeroIdentificacion;
    private String email;

    public Usuario(String numeroIdentificacion, String email, String nombre, String apellido) {
        super(nombre, apellido);
        this.numeroIdentificacion = numeroIdentificacion;
        this.email = email;
    }

    // Getters
    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public String getEmail() {
        return email;
    }

    // Setters

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

 

}
