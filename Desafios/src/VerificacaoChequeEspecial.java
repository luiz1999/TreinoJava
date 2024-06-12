import java.util.Scanner;

public class VerificacaoChequeEspecial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();

        //Define um limite para o cheque especial
        double limiteChequeEspecial = 500;

        //Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {

            //TODO: Imprimir "Transação realizada com sucesso."
            System.out.println("Transação realizada com sucesso.");

        } else {

            //TODO: Verificar se o saque ultrapassa o limite do cheque especial
             // Em caso positivo, imprimir "Transação realizada com sucesso utilizando o cheque especial."
            // Caso contrário, imprimir "Transação não realizada. Limite do cheque especial excedido."

            if (saque <= limiteChequeEspecial) {
                System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
            } else {
                System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
            }
           
        }

        //Fechar o scanner para evitar vazamento de recursos
        scanner.close();
    }
}
