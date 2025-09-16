package Revisao.Questao_4;

public class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException() {
        super("Idade inválida: menor de idade");
    }
}

