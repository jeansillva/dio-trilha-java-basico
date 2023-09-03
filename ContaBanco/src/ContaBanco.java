import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem vindo ao banco!"
                + " Qual o seu nome?");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = sc.nextLine();

        System.out.println("Por favor entre com o número de sua conta: ");
        int numero = sc.nextInt();

        System.out.println("Digite agora o saldo de sua conta: ");
        double saldo = sc.nextDouble();

        sc.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,"
                + " sua agência é " + agencia + ", conta " + numero + ", e seu saldo R$" + saldo + " já está disponível"
                + " para saque.");

    }
}