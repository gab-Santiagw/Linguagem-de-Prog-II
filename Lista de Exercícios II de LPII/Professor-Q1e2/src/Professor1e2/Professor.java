package Professor1e2;
import java.util.Scanner;

public class Professor{

Scanner teclado = new Scanner(System.in);

    private String nome, titulacao, formacao, disciplina;
    private float carga, salario;

    public Professor(String nome, String titulacao, String formacao, String disciplina, float carga, float salario) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.disciplina = disciplina;
        this.carga = carga;
        this.salario = salario;
    }

    public Professor(Object object, Object object2, Object object3, int i, int j, int k, int l) {

    }

    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return nome; }

    public void setTitulacao(String titulacao) { this.titulacao = titulacao; }
    public String getTitulacao() { return titulacao; }

    public void setFormacao(String formacao) { this.formacao = formacao; }
    public String getFormacao() { return formacao; }

    public void setDisciplina(String disciplina) { this.disciplina = disciplina; }
    public String getDisciplina() { return disciplina; }
    
    public void setCarga(float carga) { this.carga = carga; }
    public float getCarga() { return carga; }

    public void setSalario(float salario) { this.salario = salario; }
    public float getSalario() { return salario; }

    public void CadastrarAlterar() {
        System.out.print("Digite o nome do professor: ");
        setNome(teclado.nextLine());

        System.out.print("Digite a titulação do professor: ");
        setTitulacao(teclado.nextLine());

        System.out.print("Digite a formação do professor: ");
        setFormacao(teclado.nextLine());

        System.out.print("Digite a(s) disciplina(s) encarregadas pelo professor: ");
        setDisciplina(teclado.nextLine());

        System.out.print("Digite a carga horaria do professor: ");
        setCarga(teclado.nextFloat());

        System.out.print("Digite o salario do professor em reais: ");
        setSalario(teclado.nextFloat());
    
        teclado.nextLine(); 
    }

    public void disciplina(){
        System.out.print("Digite a(s) disciplina(s) encarregadas pelo professor: ");
        setDisciplina(teclado.nextLine());

         teclado.nextLine(); 
    }

    public void imprimir() {
        System.out.println("\n=== Dados cadastrados ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Titulação: " + getTitulacao());
        System.out.println("Formação: " + getFormacao());
        System.out.println("Disciplinas: " + getDisciplina());
        System.out.println("Carga horaria: " + getCarga());
         System.out.println("Salario: " + getSalario());
    }
}