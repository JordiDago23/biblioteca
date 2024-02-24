package biblioteca;

public class materialL {
//id, titulo, autor y temática 
    private int id;
    private String titulo;
    private String autor;
    private String tematica;

    public materialL(int id, String titulo, String autor, String tematica) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.tematica = tematica;
    }
    // getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    // prueva de comentario
    public String cadena() {
        return "ID: " + id + ", Título: " + titulo + ", Autor: " + autor + ", Temática: " + tematica;
    }
}
