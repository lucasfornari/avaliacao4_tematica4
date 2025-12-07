
import java.util.ArrayList;

public class ListaLivros {

    private ArrayList<Livro> disponiveis = new ArrayList<>();
    private ArrayList<Emprestimo> emprestados = new ArrayList<>();

    public void cadastrar(String titulo, String autor, int ano) {
        disponiveis.add(new Livro(titulo, autor, ano));
        ordenarDisponiveis();
    }

    public Livro buscarDisponivel(String titulo) {
        for (Livro l : disponiveis) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                return l;
            }
        }
        return null;
    }

    public Emprestimo buscarEmprestado(String titulo) {
        for (Emprestimo e : emprestados) {
            if (e.getLivro().getTitulo().equalsIgnoreCase(titulo) && !e.estaDevolvido()) {
                return e;
            }
        }
        return null;
    }

    public void emprestar(String titulo, String usuario) {
        Livro l = buscarDisponivel(titulo);
        if (l != null) {
            Emprestimo e = new Emprestimo(l, usuario);
            emprestados.add(e);
            disponiveis.remove(l);
            ordenarDisponiveis();
            ordenarEmprestados();
        }
    }

    public void devolver(String titulo) {
        Emprestimo e = buscarEmprestado(titulo);
        if (e != null) {
            e.devolver();
            disponiveis.add(e.getLivro());
            ordenarDisponiveis();
            ordenarEmprestados();
        }
    }

    public void listarDisponiveis() {
        for (Livro l : disponiveis) {
            System.out.println(l);
        }
    }

    public void listarEmprestados() {
        for (Emprestimo e : emprestados) {
            System.out.println(e);
        }
    }

    private void ordenarDisponiveis() {
        for (int i = 0; i < disponiveis.size() - 1; i++) {
            for (int j = 0; j < disponiveis.size() - i - 1; j++) {
                if (disponiveis.get(j).getTitulo()
                        .compareToIgnoreCase(disponiveis.get(j + 1).getTitulo()) > 0) {
                    Livro tmp = disponiveis.get(j);
                    disponiveis.set(j, disponiveis.get(j + 1));
                    disponiveis.set(j + 1, tmp);
                }
            }
        }
    }

    private void ordenarEmprestados() {
        for (int i = 0; i < emprestados.size() - 1; i++) {
            for (int j = 0; j < emprestados.size() - i - 1; j++) {
                if (emprestados.get(j).getLivro().getTitulo()
                        .compareToIgnoreCase(emprestados.get(j + 1).getLivro().getTitulo()) > 0) {
                    Emprestimo tmp = emprestados.get(j);
                    emprestados.set(j, emprestados.get(j + 1));
                    emprestados.set(j + 1, tmp);
                }
            }
        }
    }
}
