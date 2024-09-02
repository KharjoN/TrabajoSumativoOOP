package models;
import java.util.*;
public class Usuario extends Persona {
    private int numeroIdentificacion;
    private String email;

    public Usuario(int numeroIdentificacion, String email, String nombre, String apellido) {
        super(nombre, apellido);
        this.numeroIdentificacion = numeroIdentificacion;
        this.email = email;
    }

    // Getters
    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public String getEmail() {
        return email;
    }

    // Setters

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Metodos

    public static void insertarUsuario(List<Usuario> usuarios,Usuario usuario) {
        usuarios.add(usuario);
    }

    public static void listarUsuarios(List<Usuario> usuarios) {
        int numero = 1;
        System.out.println("Lista de usuarios:");
        System.out.println("-----------------");
        for (Usuario usuario : usuarios) {
            System.out.println("Usuario numero: " + numero);
            System.out.println("-----------------");
            System.out.println("Nombre: " + usuario.getNombre());
            System.out.println("Apellido: " + usuario.getApellido());
            System.out.println("Numero de identificacion: " + usuario.getNumeroIdentificacion());
            System.out.println("Email: " + usuario.getEmail());
            System.out.println("-----------------");
            numero++;
            
        }
    }

}
