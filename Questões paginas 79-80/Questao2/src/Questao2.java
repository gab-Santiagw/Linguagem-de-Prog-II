import java.util.Scanner;

public class Questao2 {
    public static void main(String[] x) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a distancia a ser percorrida em Km: ");
        float distancia = teclado.nextFloat();
         System.out.print("Informe o preco da gasolina em reais: ");
        float preco = teclado.nextFloat();
        float calculo = distancia/12 ;
        float gasto = calculo * preco;
        System.out.print("\nConsiderando que a distancia percorrida em Km e " + distancia + " e o preco da gasolina em reais e " + preco + " o gasto total em reais sera " + gasto);
        teclado.close();
    }
}