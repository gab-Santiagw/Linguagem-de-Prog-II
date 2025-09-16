package Revisao.Questao_2;

public abstract class Veiculo {
    String placa, modelo;

    public abstract void calcularCustoViagem(double distancia);{
        

    }
}

public interface Manutencao{
    public void realizarManutencao();

}