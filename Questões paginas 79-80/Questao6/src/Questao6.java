import java.util.Scanner;

public class Questao6 {
    public static void main(String[] x) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a nota da primeira prova: ");
        float n1 = teclado.nextFloat();
        System.out.print("Informe a nota da segunda prova: ");
        float n2 = teclado.nextFloat();
        System.out.print("Informe a nota do trabalho: ");
        float n3 = teclado.nextFloat();
        float media = (n1 + n2 + n3)/3;
        System.out.println("A média final é: " + media);
        teclado.close();
    }
}