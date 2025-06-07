import java.util.Scanner;

public class Questao5 {
    public static void main(String[] x) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um numero: ");
        float n1 = teclado.nextFloat();
        System.out.print("Informe um outro numero: ");
        float n2 = teclado.nextFloat();
        if (n1 > n2) {
            System.out.print("\nO numero " + n1 + " e maior que " + n2);
        } else if (n2 > n1){
            System.out.print("\nO numero " + n2 + " e maior que " + n1);
        } else {
            System.out.print("\nOs numeros sao iguais, tente novamente");
        }
        teclado.close();
    }
}