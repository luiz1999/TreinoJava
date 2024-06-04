import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //Criando objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua altura...");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu nome...");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome...");
        String sobrenome = scanner.next();

        System.out.println("Digite a sua idade...");
        double idade = scanner.nextDouble();

        //Imprimindo os dados obtidos pelo usuário
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");

    }
}
