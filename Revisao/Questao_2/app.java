package Revisao.Questao_2;

public class app {
    public class Onibus extends Veiculo implements Manutencao{

        @Override
        public void calcularCustoViagem(double distancia) {         
            
        }

        @Override
        public void realizarManutencao() {
            System.out.print("Manutenção realizada");
        }
      
    }
    public class Carro extends Veiculo implements Manutencao{
        @Override
        public void calcularCustoViagem(double distancia) {
            
        }

        @Override
        public void realizarManutencao() {
            System.out.print("Manutenção realizada");
        }

    }
    public class Caminhao extends Veiculo implements Manutencao{

        @Override
        public void calcularCustoViagem(double distancia) {
            
        }

        @Override
        public void realizarManutencao() {
            System.out.print("Manutenção realizada");
        }

    }

}
