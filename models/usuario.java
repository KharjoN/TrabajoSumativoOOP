package models;

public class usuario {
    private String numeroIdentificacion;
    private String email;

    public usuario(String numeroIdentificacion, String email) {
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
