
import java.time.LocalDate;

public class Emprestimo {

    private final Livro livro;
    private final String usuario;
    private final LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Livro livro, String usuario) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = LocalDate.now();
    }

    public Livro getLivro() {
        return livro;
    }

    public void devolver() {
        this.dataDevolucao = LocalDate.now();
    }

    public boolean estaDevolvido() {
        return dataDevolucao != null;
    }

    public String toString() {
        return livro.getTitulo() + " | " + usuario + " | " + dataEmprestimo
                + (estaDevolvido() ? " | devolvido: " + dataDevolucao : "");
    }
}
