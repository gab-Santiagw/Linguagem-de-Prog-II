import java.util.Scanner;

public class Questao4 {
    public static void main(String[] x) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a temperatura: ");
        float temperatura = teclado.nextFloat();
        if (temperatura > 37) {
            System.out.print("\nO usuario esta com febre");
        } else{
            System.out.print("\nO usuario nao esta com febre");
        }
        teclado.close();
    }
}