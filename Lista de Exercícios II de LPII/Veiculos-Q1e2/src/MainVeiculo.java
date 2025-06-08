package Veiculos1e2;

import java.util.Scanner;

public class MainVeiculo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Veiculo veiculo = new Veiculo(null, null, null, null, null, 0, 0, 0, 0, 0, 0);

        int opcao;
        do {
            System.out.println("\nO que você deseja fazer?");
            System.out.println("1 - Cadastrar ou alterar informações do veículo");
            System.out.println("2 - Listar informações cadastradas");
            System.out.println("0 - Sair");

            opcao = teclado.nextInt();
            teclado.nextLine(); 

            switch (opcao) {
                case 1:
                    veiculo.CadastrarAlterar();
                    break;
                case 2:
                    veiculo.listar();
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
