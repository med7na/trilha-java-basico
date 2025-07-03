import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        var sc = new Scanner(System.in);
        System.out.println("Insira o número da agência: ");
        var account =  sc.nextLine();
        System.out.println("Digite o número da conta: ");
        var numberAccount = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o seu nome:");
        var name = sc.nextLine();
        System.out.println("Digite o saldo: ");
        var balance = sc.nextDouble();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$%s já está disponível para saque", name, account, numberAccount, balance);


    }
}
