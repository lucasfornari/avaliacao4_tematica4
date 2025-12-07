
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        ListaLivros lista = new ListaLivros();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1 Cadastrar livro");
            System.out.println("2 Emprestar livro");
            System.out.println("3 Devolver livro");
            System.out.println("4 Listar disponíveis");
            System.out.println("5 Listar emprestados");
            System.out.println("0 Sair");
            System.out.print("> ");
            int op = sc.nextInt();
            sc.nextLine();

            if (op == 0) {
                break;
            }

            if (op == 1) {
                System.out.print("Título: ");
                String t = sc.nextLine();
                System.out.print("Autor: ");
                String a = sc.nextLine();
                System.out.print("Ano: ");
                int ano = sc.nextInt();
                lista.cadastrar(t, a, ano);
            }

            if (op == 2) {
                System.out.print("Título: ");
                String t = sc.nextLine();
                System.out.print("Usuário: ");
                String u = sc.nextLine();
                lista.emprestar(t, u);
            }

            if (op == 3) {
                System.out.print("Título: ");
                String t = sc.nextLine();
                lista.devolver(t);
            }

            if (op == 4) {
                lista.listarDisponiveis();
            }
            if (op == 5) {
                lista.listarEmprestados();
            }
        }

        sc.close();
    }
}
