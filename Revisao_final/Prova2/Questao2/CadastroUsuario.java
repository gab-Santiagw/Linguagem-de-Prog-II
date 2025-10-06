package Revisao_final.Prova2.Questao2;

public class CadastroUsuario {
    public static void main(String[] args) {
        Funcionario funcionario=new Funcionario(null, 0, 0);

        try{
            SalarioInvalido.setSalario(20000);
        } catch (SalarioInvalido e){
            System.out.println(e.getMessage());
        }

        try{
            IdadeInvalida.setIdade(19);
        } catch (IdadeInvalida e){
            System.out.println(e.getMessage());
        }
    }
}
