import java.util.Scanner;

public class Questao7 {
    public static void main(String[] x) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o peso em KG a ser usado: ");
        float peso = teclado.nextFloat();
        System.out.print("Informe a altura a ser utilizada: ");
        float altura = teclado.nextFloat();
        if (peso/altura > 30) {
            System.out.println("O usuario esta obeso");
        } else{
            System.out.print("O usuario nao esta obeso");
        }
        teclado.close();
    }
}