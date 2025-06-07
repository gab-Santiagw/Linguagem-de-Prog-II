package Questao1;

import java.util.Scanner;

public class MainCarro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Carro[] carros = {
            new Carro("Fusca", 1, 80.0f, 1.2f),
            new Carro("Civic", 1, 140.0f, 2.5f),
            new Carro("Gol", 1, 100.0f, 1.8f)
        };

        System.out.println("Escolha um modelo de carro:");
        for (int i = 0; i < carros.length; i++) {
            System.out.println((i + 1) + " - Modelo: " + carros[i].getModelo() + " || Velocidade em Km: " + carros[i].getVelocidade() + " || Aceleração: " + carros[i].getAceleracao());
        }

        int escolha = teclado.nextInt();

        if (escolha < 1 || escolha > carros.length) {
            System.out.println("Opção inválida. Programa encerrado.");
            teclado.close();
            return;
        }

        Carro carro = carros[escolha - 1];
        System.out.println("Você escolheu o modelo: " + carro.getModelo());

        int opcao;
        do {
            System.out.println("\nO que você deseja fazer?");
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Desligar o carro");
            System.out.println("3 - Virar à esquerda");
            System.out.println("4 - Virar à direita");
            System.out.println("5 - Acelerar");
            System.out.println("6 - Desacelerar");
            System.out.println("7 - Marcha 1");
            System.out.println("8 - Marcha 2");
            System.out.println("9 - Marcha 3");
            System.out.println("10 - Marcha 4");
            System.out.println("11 - Marcha 5");
            System.out.println("12 - Marcha Ré");
            System.out.println("0 - Sair");

            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    carro.ligar();
                    break;
                case 2:
                    carro.desligar();
                    break;
                case 3:
                    carro.esquerda();
                    break;
                case 4:
                    carro.direita();
                    break;
                case 5:
                    carro.acelerar();
                    break;
                case 6:
                    carro.desacelerar();
                    break;
                case 7:
                    carro.marcha1();
                    break;
                case 8:
                    carro.marcha2();
                    break;
                case 9:
                    carro.marcha3();
                    break;
                case 10:
                    carro.marcha4();
                    break;
                case 11:
                    carro.marcha5();
                    break;
                case 12:
                    carro.marchaRe();
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
