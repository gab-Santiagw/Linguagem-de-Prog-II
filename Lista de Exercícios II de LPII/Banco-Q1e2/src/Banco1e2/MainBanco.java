package Banco1e2;

import java.util.Scanner;

public class MainBanco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Banco banco = new Banco(null, null, 0, 0, 0, 0);

        int opcao;
        do {
            System.out.println("\nO que você deseja fazer?");
            System.out.println("1 - Cadastrar ou alterar informações do banco");
            System.out.println("2 - Imprimir informações cadastradas");
            System.out.println("0 - Sair");

            opcao = teclado.nextInt();
            teclado.nextLine(); 

            switch (opcao) {
                case 1:
                    banco.CadastrarAlterar();
                    break;
                case 2:
                    banco.imprimir();
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
