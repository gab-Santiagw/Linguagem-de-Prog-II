package Funcionario1e2;
import java.util.Scanner;

public class Funcionario{

Scanner teclado = new Scanner(System.in);

    private String nome, endereco, local, profissao, grau;
    private int RG, CPF, dia, mes, ano, matricula;
    private float salario;

    public Funcionario(String nome, String endereco, String local, String profissao, String grau, int RG, int CPF, int dia, int mes, int ano, int matricula, float salario) {
        this.nome = nome;
        this.endereco = endereco;
        this.local = local;
        this.profissao = profissao;
        this.grau = grau;
        this.CPF =CPF;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.matricula = matricula;
        this.salario = salario;
    }

    public Funcionario(Object object, Object object2, Object object3, int i, int j, int k, int l) {
        
    }

    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return nome; }

    public void setEndereco(String endereco) { this.endereco = endereco; }
    public String getTitulacao() { return endereco; }

    public void setLocal(String local) { this.local = local; }
    public String getLocal() { return local; }

    public void setProfissao(String profissao) { this.profissao = profissao; }
    public String getProfissao() { return profissao; }
    
    public void setGrau(String grau) { this.grau = grau; }
    public String getGrau() { return grau; }

    public void setRG(int RG) {}
    public int getRG(int RG) {return RG;}

    public void setCPF(int CPF) {this.CPF = CPF;}
    public int getCPF(int CPF) {return CPF;}

    public void setDia(int dia) {this.dia = dia;}
    public int getDia(int dia) {return dia;}

    public void setMes(int mes) {this.mes = mes;}
    public int getMes(int mes) {return mes;}

    public void setAno(int ano) {this.ano = ano;}
    public int getAno(int ano) {return ano;}

    public void setMatricula(int matricula) {this.matricula = matricula;}
    public int getMatricula(int matricula) {return matricula;}

    public void setSalario(float salario) { this.salario = salario; }
    public float getSalario() { return salario; }

    public void CadastrarAlterar() {
        System.out.print("Digite o nome do funcionario: ");
        setNome(teclado.nextLine());

        System.out.print("Digite o endereço do funcionario: ");
        setEndereco(teclado.nextLine());

        System.out.print("Digite o local de formação do funcionario: ");
        setLocal(teclado.nextLine());

        System.out.print("Digite a profissão do funcionario: ");
        setProfissao(teclado.nextLine());

        System.out.print("Digite o grau ddo funcionario: ");
        setGrau(teclado.nextLine());

        System.out.print("Digite o RG do funcionario: ");
        setRG(teclado.nextInt());

        System.out.print("Digite o CPF do funcionario: ");
        setCPF(teclado.nextInt());

        System.out.print("Digite o dia de nascimento do funcionario: ");
        setDia(teclado.nextInt());

        System.out.print("Digite o mês de nascimento do funcionario: ");
        setMes(teclado.nextInt());

        System.out.print("Digite o ano de nascimento do funcionario: ");
        setAno(teclado.nextInt());

        System.out.print("Digite o número de matricula do funcionario: ");
        setMatricula(teclado.nextInt());

        System.out.print("Digite o salario do funcionario em reais: ");
        setSalario(teclado.nextFloat());
    
        teclado.nextLine(); 
    }

    public void imprimir() {
        System.out.println("\n=== Dados cadastrados ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("local de nascimento: " + getLocal());
        System.out.println("Profissão: " + getProfissao());
        System.out.println("Grau: " + getGrau());
        System.out.println("RG: " + getRG());
        System.out.println("CPF: " + getCPF());
        System.out.println("Dia: " + getDia());
        System.out.println("Mês: " + getMes());
        System.out.println("Ano: " + getAno());
        System.out.println("Matricula: " + getMatricula());
         System.out.println("Salario: " + getSalario());
    }
}  