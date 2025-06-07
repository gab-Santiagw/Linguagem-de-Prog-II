package Questao1;

public class Carro{

    private String modelo;
    private int marcha;
    private float velocidade, aceleracao;
    private boolean LigaDesliga = false;

    public Carro(String modelo, int marcha, float velocidade, float aceleracao) {
        this.modelo = modelo;
        this.marcha = marcha;
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
    }

    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getModelo() { return modelo; }

    public void setMarcha(int marcha) { this.marcha = marcha; }
    public int getMarcha() { return marcha; }

    public void setVelocidade(float velocidade) { this.velocidade = velocidade; }
    public float getVelocidade() { return velocidade; }

    public void setAceleracao(float aceleracao) { this.aceleracao = aceleracao; }
    public float getAceleracao() { return aceleracao; }

    public void ligar() {
        if (!LigaDesliga) {
            System.out.println("O carro está ligado.");
            LigaDesliga = true;
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void desligar() {
        if (LigaDesliga) {
            System.out.println("O carro está desligado.");
            LigaDesliga = false;
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    public void esquerda() {
        System.out.println("O carro está virando para a esquerda.");
    }

    public void direita() {
        System.out.println("O carro está virando para a direita.");
    }

    public void marcha1() { System.out.println("O carro está na primeira marcha."); }
    public void marcha2() { System.out.println("O carro está na segunda marcha."); }
    public void marcha3() { System.out.println("O carro está na terceira marcha."); }
    public void marcha4() { System.out.println("O carro está na quarta marcha."); }
    public void marcha5() { System.out.println("O carro está na quinta marcha."); }
    public void marchaRe() { System.out.println("O carro está na marcha ré."); }

    public void acelerar() {
        System.out.println("O carro está acelerando a " + aceleracao + " m/s².");
    }

    public void desacelerar() {
        System.out.println("O carro está desacelerando.");
    }
}