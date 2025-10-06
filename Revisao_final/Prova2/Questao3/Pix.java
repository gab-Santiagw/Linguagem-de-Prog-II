package Revisao_final.Prova2.Questao3;

public class Pix implements Pagamento {

    private static final double TAXA = 0.01;

    @Override
    public void Pagar(double valor) {
        double total = valor + calcularTaxa(valor);
        System.out.println("\nPagamento com Pix: R$" + total + "\n");
    }

    @Override
    public double calcularTaxa(double valor) {
        return valor * TAXA;
    }
}
