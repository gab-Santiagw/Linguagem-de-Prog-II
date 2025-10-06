package Revisao_final.Prova1.Questao3;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private String titular;

    public ContaBancaria(int numeroConta, double saldo, String titular){
        this.numeroConta=numeroConta;
        this.saldo=saldo;
        this.titular=titular;
    }

    public void Depositar(double valor){
        if (valor>0){
            saldo += valor;
            System.out.print("Valor depositado com sucesso");
        }else{
            System.out.print("Valor invalido, não foi possivel realizar o deposito");
        }
    }

    public void Sacar(double valor){
        if (valor>0 && valor <=saldo){
            saldo -= valor;
            System.out.print("Valor sacado com sucesso");
        }else{
            System.out.print("Valor invalido, não foi possivel sacar o dinheiro");
        }
    }

    public void Consultar(){
        System.out.print("Dados bancarios:\n\n");
        System.out.println("Titular:" + titular);
        System.out.println("Numero da conta" + numeroConta);
        System.out.println("Saldo:" + saldo);
    }

    public int getNumeroConta(){return numeroConta;}
    public void setNumeroConta(int numeroConta){this.numeroConta=numeroConta;}
    
    public double getSaldo(){return saldo;}
    public void setSaldo(double saldo){this.saldo=saldo;}

    public String getTitular(){return titular;}
    public void setTitular(String titular){this.titular=titular;}

}
