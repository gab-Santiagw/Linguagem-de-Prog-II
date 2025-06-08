package Veiculos1e2;
import java.util.Scanner;

public class Veiculo{

Scanner teclado = new Scanner(System.in);

    private String marca, cor, modelo, combustivel, CompletoBasico;
    private int codigo, ano, portas, qdt;
    private float preco;

    public Veiculo(String modelo, String marca, String cor, String combustivel, String CompletoBasico, int qnt, float preco, int ano, int codigo, int portas, int qdt ) {
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.combustivel = combustivel;
        this.CompletoBasico = CompletoBasico;
        this.codigo = codigo;
        this.ano = ano;
        this.portas = portas;
        this.qdt = qdt;
        this.preco = preco;
    }

    public void setMarca(String marca) { this.marca = marca; }
    public String getMarca() { return marca; }

    public void setCor(String cor) { this.cor = cor; }
    public String getCor() { return cor; }

    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getModelo() { return modelo; }

    public void setCombustivel(String combustivel) { this.combustivel = combustivel; }
    public String getCombustivel() { return combustivel; }

    public void setCompletoBasico(String CompletoBasico) { this.CompletoBasico = CompletoBasico; }
    public String getCompletoBasico() { return CompletoBasico; }

    public void setCodigo(int codigo) { this.codigo = codigo; }
    public int getCodigo() { return codigo; }
    
    public void setAno(int ano) { this.ano = ano; }
    public int getAno() { return ano; }

    public void setPortas(int portas) { this.portas = portas; }
    public int getPortas() { return portas; }

    public void setQdt(int qdt) { this.qdt = qdt; }
    public int getQdt() { return qdt; }
    
    public void setPreco(float preco) { this.preco = preco; }
    public float getPreco() { return preco; }

    public void CadastrarAlterar() {
       System.out.print("Digite a marca do carro: ");
    setMarca(teclado.nextLine());

    System.out.print("Digite a cor do carro: ");
    setCor(teclado.nextLine());

    System.out.print("Digite o modelo do carro: ");
    setModelo(teclado.nextLine());

    System.out.print("Digite o tipo de combustível do carro: ");
    setCombustivel(teclado.nextLine());

    System.out.print("Digite se o carro é completo ou básico: ");
    setCompletoBasico(teclado.nextLine());

    System.out.print("Digite o código do carro: ");
    setCodigo(teclado.nextInt());

    System.out.print("Digite o ano do carro: ");
    setAno(teclado.nextInt());

    System.out.print("Digite o número de portas do carro: ");
    setPortas(teclado.nextInt());

    System.out.print("Digite a quantidade do mesmo carro: ");
    setQdt(teclado.nextInt());

    System.out.print("Digite o preço do carro: ");
    setPreco(teclado.nextFloat());
    
    teclado.nextLine(); 
}

    public void listar() {
         System.out.println("\n=== Dados do Veículo ===");
        System.out.println("Marca: " + getMarca());
        System.out.println("Cor: " + getCor());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Tipo de combustível: " + getCombustivel());
        System.out.println("Status: " + getCompletoBasico());
        System.out.println("Código: " + getCodigo());
        System.out.println("Ano: " + getAno());
        System.out.println("Portas: " + getPortas());
        System.out.println("Quantidade: " + getQdt());
        System.out.println("Preço: R$ " + getPreco());
    }
}