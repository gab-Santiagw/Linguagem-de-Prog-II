package Revisao_final.Prova2.Questao3;

public class CartaoCredito implements Pagamento {

    private static final double TAXA = 0.025; 

    @Override
    public void Pagar(double valor) {
        double total = valor + calcularTaxa(valor);
        System.out.println("\nPagamento com Cartão de Crédito: R$" + total);
    }

    @Override
    public double calcularTaxa(double valor) {
        return valor * TAXA;
    }
}

