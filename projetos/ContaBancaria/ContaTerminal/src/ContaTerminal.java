
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da agência: ");
        int Agencia = scanner.nextInt();

        System.out.println("Digite o número da conta: ");
        String Conta = scanner.next();

        System.out.println("Digite o nome do Cliente: ");
        String Nome = scanner.next();

        System.out.println("Digite o saldo da conta: ");
        double Saldo = scanner.nextDouble();

        System.out.println("Olá " + Nome + " obrigado por criar uma conta em nosso banco, sua agência é" + Agencia + " e sua conta é " + Conta + " e seu saldo é " + Saldo);

        
    }
}
