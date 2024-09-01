package models;

public class libro /*extends autor*/ {

    private String titulo;
    private String isbn;
    private int anioPublicacion;
    private autor autor;

    public libro(String titulo, String isbn, int anioPublicacion, autor autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
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

    public autor getAutor() {
        return autor;
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

    public void setAutor(autor autor) {
        this.autor = autor;
    }

    //Metodos

    public void insertar() {
        System.out.println("Insertando libro: ");
    }
    
}