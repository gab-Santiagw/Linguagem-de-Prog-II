package Banco1e2;

import java.util.Scanner;

public class Banco{

Scanner teclado = new Scanner(System.in);

    private String nome, agencia;
    private int RG, CPF, numero;
    private float saldo;

    public Banco(String nome, String agencia, int RG, int CPF, int numero, float saldo) {
        this.nome = nome;
        this.agencia = agencia;
        this.RG = RG;
        this.CPF = CPF;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return nome; }

    public void setAgencia(String agencia) { this.agencia = agencia; }
    public String getAgencia() { return agencia; }

    public void setRG(int RG) { this.RG = RG; }
    public int getRG() { return RG; }
    
    public void setCPF(int CPF) { this.CPF = CPF; }
    public int getCPF() { return CPF; }

    public void setNumero(int numero) { this.numero = numero; }
    public int getNumero() { return numero; }
    
    public void setSaldo(float saldo) { this.saldo = saldo; }
    public float getSaldo() { return saldo; }

    public void CadastrarAlterar() {
       System.out.print("Digite seu nome: ");
    setNome(teclado.nextLine());

    System.out.print("Digite sua agencia: ");
    setAgencia(teclado.nextLine());

    System.out.print("Digite seu RG: ");
    setRG(teclado.nextInt());

    System.out.print("Digite seu CPF: ");
    setCPF(teclado.nextInt());

    System.out.print("Digite seu número de telefone: ");
    setNumero(teclado.nextInt());

    System.out.print("Digite o seu saldo no banco: ");
    setSaldo(teclado.nextFloat());
    
    teclado.nextLine(); 
}

    public void imprimir() {
         System.out.println("\n=== Dados cadastrados ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Agencia: " + getAgencia());
        System.out.println("RG: " + getRG());
        System.out.println("CPF: " + getCPF());
        System.out.println("Número de telefone: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
    }
}