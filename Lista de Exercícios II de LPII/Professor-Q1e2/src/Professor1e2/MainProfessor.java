package Professor1e2;
import java.util.Scanner;

public class MainProfessor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Professor professor = new Professor(null, null, null, 0, 0, 0, 0);

        int opcao;
        do {
            System.out.println("\nO que você deseja fazer?");
            System.out.println("1 - Cadastrar ou alterar informações do banco");
            System.out.println("2 - Alterar disciplinas");
            System.out.println("3 - Imprimir dados cadastrados");
            System.out.println("0 - Sair");

            opcao = teclado.nextInt();
            teclado.nextLine(); 

            switch (opcao) {
                case 1:
                    professor.CadastrarAlterar();
                    break;
                case 2:
                    professor.disciplina();
                    break;
                case 3:
                    professor.imprimir();
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 0);

        teclado.close();
    }
}
