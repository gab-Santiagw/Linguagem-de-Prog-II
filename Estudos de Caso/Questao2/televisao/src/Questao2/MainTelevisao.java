package Questao2;

import java.util.Scanner;

public class MainTelevisao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Televisao[] tvs = {
            new Televisao(42, "LG", 220, 1, 5, 00), 
            new Televisao(65, "Samsung", 110, 1, 5, 00),
            new Televisao(75, "Panasonic", 220, 1, 5,00)
        };

        System.out.print("Escolha um modelo de televisão:\n");
        for (int i = 0; i < tvs.length; i++) {
            System.out.println("Modelo " + (i + 1) + ":");
            System.out.println("Polegadas: " + tvs[i].getPolegadas());
            System.out.println("Volume inicial: " + tvs[i].getVolume());
            System.out.println("Marca: " + tvs[i].getMarca());
            System.out.println("Voltagem: " + tvs[i].getVoltagem());
            System.out.println("Canal inicial: " + tvs[i].getCanal());
        }

        System.out.print("Escolha um número de modelo: ");
        int escolha = teclado.nextInt();
        Televisao televisaoSelecionada = tvs[escolha - 1];
        System.out.println("Você escolheu o modelo: " + televisaoSelecionada.getMarca());

        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Aumentar volume");
            System.out.println("4 - Diminuir volume");
            System.out.println("5 - Subir canal");
            System.out.println("6 - Descer canal");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    televisaoSelecionada.ligar();
                    System.out.println("Consumo: " + (televisaoSelecionada.getVoltagem() * televisaoSelecionada.getPolegadas()) + " Watts");
                    break;
                case 2:
                    televisaoSelecionada.desligar();
                    break;
                case 3:
                    televisaoSelecionada.aumentarVolume();
                    break;
                case 4:
                    televisaoSelecionada.diminuirVolume();
                    break;
                case 5:
                    televisaoSelecionada.subirCanal();
                    break;
                case 6:
                    televisaoSelecionada.descerCanal();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        }  while (opcao != 0);

        teclado.close();
    }
}
