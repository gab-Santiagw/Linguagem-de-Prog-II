import java.util.Scanner;

public class Questao1 {
    public static void main(String[] x) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a quantidade de horas trabalhadas no mes: ");
        int horas = teclado.nextInt();
        float salario = horas * 20;
        teclado.close();
        System.out.print("A quantidade de horas trabalhadas e " + horas + " e o salario e " + salario);
    }
}