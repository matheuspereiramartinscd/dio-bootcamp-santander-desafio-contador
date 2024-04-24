// Definição da classe ParametrosInvalidosException
public class ParametrosInvalidosException extends Exception {

    // Construtor que aceita uma mensagem de erro
    public ParametrosInvalidosException(String message) {
        super(message); // Chama o construtor da classe pai (Exception) com a mensagem de erro
    }
}