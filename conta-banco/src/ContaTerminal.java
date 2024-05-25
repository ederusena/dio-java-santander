import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite numero da conta: ");
        int account = scanner.nextInt();

        System.out.print("Digite numero da agencia: ");
        int agency = scanner.nextInt();

        System.out.print("Digite nome do cliente: ");
        String client = scanner.next();

        System.out.print("Digite numero da conta: ");
        double balance = scanner.nextDouble();
        scanner.close();

        Conta conta = new Conta(account, agency, client, balance);

        conta.welcome();
    }
}
