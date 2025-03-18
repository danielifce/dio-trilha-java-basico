/**
 * Exceção personalizada que será lançada quando os parâmetros fornecidos
 * forem inválidos (por exemplo, quando o primeiro parâmetro for maior que o segundo).
 */
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}