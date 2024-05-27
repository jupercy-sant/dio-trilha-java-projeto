import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
       
        // TODO: conhecer e importar a classe scanner

        // Exibir as mensagens para o nosso usuário

        // Obter pela classe scanner os valores digitados no terminal

        // Exibir a mensagem conta criada

        System.out.print("Por favor, digite o numero da Conta: ");
        int conta = sc.nextInt();
        
        System.out.print("Por favor, digite o numero da Agencia: ");
        String agencia = sc.next();

        System.out.print("Por favor, digite o nome do Cliente: ");
        String cliente = sc.next();

        System.out.println("Conta criada!");

        double saldo = 2350.95;

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + ", conta " + conta + " e seu saldo " + saldo + " ja esta disponivel para saque.");

        sc.close();
    }
}