import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //To do: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal

        System.out.println("Digite o seu nome...");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome...");
        String sobrenome = scanner.next();

        System.out.println("Digite o número da sua conta...");
        String numero = scanner.next();

        System.out.println("Digite a sua Agencia...");
        String agencia = scanner.next();

        System.out.println("Digite seu saldo...");
        double saldo = scanner.nextDouble();        

        //Exibir a mensagem conta criada

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque");
    }

}
