package Animal1e2;
import java.util.Scanner;

public class Animal{

Scanner teclado = new Scanner(System.in);

    private String especie, nome, local;
    private int dia, mes, ano, numero;

    public Animal(String especie, String nome, String local, int dia, int mes, int ano, int numero) {
        this.especie = especie;
        this.nome = nome;
        this.local = local;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.numero = numero;
    }

    public void setEspecie(String especie) { this.especie = especie; }
    public String getEspecie() { return especie; }

    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return nome; }

    public void setLocal(String local) { this.local = local; }
    public String getLocal() { return local; }

    public void setDia(int dia) { this.dia = dia; }
    public int getDia() { return dia; }
    
    public void setMes(int mes) { this.mes = mes; }
    public int getMes() { return mes; }
    
    public void setAno(int ano) { this.ano = ano; }
    public int getAno() { return ano; }

    public void setNumero(int numero) { this.numero = numero; }
    public int getNumero() { return numero; }

    public void CadastrarAlterar() {
       System.out.print("Digite a especie do animal: ");
    setEspecie(teclado.nextLine());

    System.out.print("Digite o nome do animal: ");
    setNome(teclado.nextLine());

    System.out.print("Digite o local de nascimento do animal: ");
    setLocal(teclado.nextLine());

    System.out.print("Digite o dia do nascimento do animal: ");
    setDia(teclado.nextInt());

    System.out.print("Digite o mês do nascimento do animal: ");
    setMes(teclado.nextInt());

    System.out.print("Digite o ano do nascimento do animal: ");
    setAno(teclado.nextInt());

    System.out.print("Digite o nùmero de série do animal: ");
    setNumero(teclado.nextInt());
    
    teclado.nextLine(); 
}

    public void imprimir() {
        System.out.println("\n=== Dados cadastrados ===");
        System.out.println("Especie: " + getEspecie());
        System.out.println("Nome: " + getNome());
        System.out.println("Local de nascimento: " + getLocal());
        System.out.println("Data de nascimento: " + getDia() + "/" + getMes() + "/" + getAno());
        System.out.println("Número de telefone: " + getNumero());
    }
}