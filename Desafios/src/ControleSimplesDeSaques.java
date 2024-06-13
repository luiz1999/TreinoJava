import java.util.Scanner;

public class ControleSimplesDeSaques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o limite diário de saque.");
        double limiteDiario = scanner.nextDouble();

        //Loop for para iterar sobre os saques
        for(int i = 1; i < limiteDiario ; i++) {

            System.out.println("Informe o valor do saque.");
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoeses encerradas.");
                break; //Encerra o loop
            } else if (valorSaque > limiteDiario){
                System.out.println("Limite diario de saque atingido. Transacoes encerradas");
                break; //Encerra o loop
            } else {
                //TODO: Atualizar o limite diário e imprimir a saída no formato dos exemplos.
                double novoSaldo = limiteDiario - valorSaque;
                System.out.printf("Saque realizado com sucesso. Limite restante: %.1f%n", novoSaldo);
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
