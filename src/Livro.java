
public class Livro {

    private final String titulo;
    private final String autor;
    private final int ano;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public String toString() {
        return titulo + " | " + autor + " | " + ano;
    }
}
