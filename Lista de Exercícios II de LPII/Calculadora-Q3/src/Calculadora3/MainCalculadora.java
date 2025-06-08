package Calculadora3;
import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ProgramaCalculadora programaCalculadora = new ProgramaCalculadora();

        System.out.print("Digite o valor do primeiro número:")
        float n1 = teclado.nextFloat();

        System.out.print("Digite o valor do segundo número:")
        float n2 = teclado.nextFloat();
        
        int opcao;
        do {
            System.out.println("\nO que você deseja fazer?");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");

            opcao = teclado.nextInt();
            teclado.nextLine(); 

            switch (opcao) {
                case 1:
                    programaCalculadora.soma();
                    break;
                case 2:
                    programaCalculadora.subtracao();
                    break;
                case 3:
                    programaCalculadora.multiplicacao();
                    break;
                case 4:
                    programaCalculadora.divisao();
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
