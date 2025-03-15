import java.util.Locale;
import java.util.Scanner;
/**
 * @author Daniel Leite
 * @version 1.0
 * @since 15/03/25
 */

/**
 * Esta classe representa uma conta bancária e contém informações sobre o número da conta, agência, nome do cliente e saldo.
 */
public class ContaTerminal {

     /**
     * Método principal para execução do programa.
     * Solicita os dados ao usuário e imprime os dados da conta.
     */
    public static void main(String[] args) {
        int numeroConta = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0.0;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta: ");
        numeroConta = scanner.nextInt();

        scanner.nextLine(); // Consumindo o \n que ficou no buffer devido ao scanner.nextInt().

        System.out.println("Por favor, digite o número da agência: ");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta: ");
        saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("\n"+"Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo +" já está disponível para saque!");
    }
}