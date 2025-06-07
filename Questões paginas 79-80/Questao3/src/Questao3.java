import java.util.Scanner;

public class Questao3 {
    public static void main(String[] x) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe sua idade: ");
        int idade = teclado.nextInt();
        teclado.nextInt();
        if (idade >= 18) {
            System.out.print("\nEsta apto para tirar a carteira de motorista");
        } else{
            System.out.print("\n Nao esta apto para tirar a carteira de motorista");
        }
        teclado.close();
    }
}