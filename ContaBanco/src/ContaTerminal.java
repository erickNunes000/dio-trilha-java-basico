import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o saldo do do cliente");
        //String s = 
        double saldo = sc.nextDouble();

        System.out.println("Por favor, digite o nome do cliente");
        String  nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite a Agência !");
        String agencia = sc.next();
        
        String msg = "Olá "+ nomeCliente + " , obrigado por criar uma conta em nosso banco, sua agência é"+ agencia+ ", conta "+numero+ "e seu saldo "+saldo+ " já está disponível para saque.";
        
        System.out.println(msg);
    }
}
