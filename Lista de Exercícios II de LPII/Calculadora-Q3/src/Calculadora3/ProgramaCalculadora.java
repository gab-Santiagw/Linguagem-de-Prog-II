package Calculadora3;
import java.util.Scanner;

public class ProgramaCalculadora{

Scanner teclado = new Scanner(System.in);

    private float n1, n2;

    public ProgramaCalculadora(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void setN1(int n1) {this.n1 = n1;}
    public int getN1(int n1) {return n1;}

    public void setN2(int n2) {this.n2 = n2;}
    public int getN2(int n2) {return n2;}


    public void soma() {
        float soma = n1 + n2;
        System.out.println("Resultado: " + soma);
    }

    public void subtracao() {
        float subtração = n1 - n2;
        System.out.println("Resultado: " + subtração);
    }    

    public void multiplicacao() {
        float multiplicacao = n1 * n2;
        System.out.println("Resultado: " + multiplicacao);
    }    

    public void divisao() {
        float divisao = n1 / n2;
        System.out.println("Resultado: " + divisao);
    }    
}  