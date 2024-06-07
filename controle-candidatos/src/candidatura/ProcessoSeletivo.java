package candidatura;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ProcessoSeletivo {
    public static void main(String[] args) {

        // Caminho para o executável Java
        String javaPath = "C:\\Program Files\\Java\\jdk-11.0.15\\bin\\java.exe";
        // Opções JDWP para depuração
        String jdwpOptions = "-agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=localhost:51725";
        // Caminho do classpath
        String classPath = "C:\\Users\\Luis Felipe\\Documents\\==JAVA - BOOTCAMP==\\== Repositório - Git ==\\TreinoJava\\controle-candidatos\\bin";
        // Classe principal a ser executada
        String mainClass = "candidatura.ProcessoSeletivo";

        // Lista de comandos
        List<String> command = new ArrayList<>();
        command.add(javaPath);
        command.add(jdwpOptions);
        command.add("-cp");
        command.add(classPath);
        command.add(mainClass);

        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
        System.out.println("    Processo seletivo");





    }
    static void analisarCandidato (double salarioPretendido) {

        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido) {
            System.out.println("    LIGAR OPARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido)
        System.out.println("    LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA ");
        else {
            System.out.println("    AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
