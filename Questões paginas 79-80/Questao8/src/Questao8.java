import java.util.Scanner;

public class Questao8 {
    public static void main(String[] x) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o valor do raio da circunferencia: ");
        float r = teclado.nextFloat();
        float area = 3.14f * r * r;
        System.out.println("A área da circunferencia é: " + area);
        teclado.close();
    }
}