import java.util.Scanner;
/**Controle de fluxo - Desafio Contador
 * @author Daniel Leite
 * @version 1.0
 * @since 15/03/25
 */

/**
 * Classe responsável por realizar a contagem entre dois parâmetros fornecidos pelo usuário.
 * O programa recebe dois números inteiros e conta de um até a diferença entre esses números,
 * desde que o segundo número seja maior que o primeiro.
 * Caso contrário, uma exceção personalizada será lançada.
 */
public class Contador {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o primeiro parâmetro (número inicial)
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = scanner.nextInt();

        // Solicita e lê o segundo parâmetro (número final)
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = scanner.nextInt();

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();

        try {
            // Chama o método 'contar' que realiza a contagem entre os parâmetros fornecidos
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Exibe uma mensagem de erro caso uma exceção 'ParametrosInvalidosException' seja lançada
            System.out.println("Identificamos uma incoerência nos parâmetros informados: \n" + exception.getMessage());
        }
    }

    /**
     * Método que realiza a contagem da diferença entre os números.
     * @param parametroUm O valor inicial da contagem.
     * @param parametroDois O valor final da contagem.
     * @throws ParametrosInvalidosException Caso o parâmetroUm seja maior que o parâmetroDois, uma exceção será lançada.
     */
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verifica se o parâmetro inicial é maior que o final
        if (parametroUm > parametroDois) {
            // Lança uma exceção caso a condição acima seja verdadeira
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
        }

        // Calcula a quantidade de números a serem contados
        int contagem = parametroDois - parametroUm;

        // Realiza a contagem e imprime os números entre o intervalo de parametroUm e parametroDois
        for (int i = parametroUm; i <= parametroDois; i++) {
            // Imprime o número atual do intervalo
            System.out.printf("Imprimindo número: %d %n", i);
        }
    }
}