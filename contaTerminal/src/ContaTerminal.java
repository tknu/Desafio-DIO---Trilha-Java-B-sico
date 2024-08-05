import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("" +
                " #####     ####     #####            ######     ##     ##   ##  ###  ##\n" +
                "  ## ##     ##     ##   ##            ##  ##   ####    ###  ##   ##  ##\n" +
                "  ##  ##    ##     ##   ##            ##  ##  ##  ##   #### ##   ## ##\n" +
                "  ##  ##    ##     ##   ##            #####   ##  ##   ## ####   ####\n" +
                "  ##  ##    ##     ##   ##            ##  ##  ######   ##  ###   ## ##\n" +
                "  ## ##     ##     ##   ##            ##  ##  ##  ##   ##   ##   ##  ##\n" +
                " #####     ####     #####            ######   ##  ##   ##   ##  ###  ##\n");

        System.out.println("Digite o número da conta:");
        int numConta = sc.nextInt();
        System.out.println("Digite o número da agência com o dígito:");
        String agencia = sc.next();
        sc.nextLine();
        System.out.println("Digite o seu nome:");
        String nome = sc.nextLine();
        System.out.println("Digite o valor do depósito inicial:");
        double saldo = sc.nextDouble();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nome, agencia, numConta, saldo);
    }
}