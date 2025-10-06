package Revisao_final.Prova2.Questao3;

public class App {
    public static void main(String[] args) {
        Pagamento pagamentoCartao = new CartaoCredito();
        Pagamento pagamentoPix = new Pix();
        
        double valor = 100;

        System.out.print("\nValor original: R$" + valor + "\n");

        pagamentoCartao.Pagar(valor);
        pagamentoPix.Pagar(valor);
    }
    
}
