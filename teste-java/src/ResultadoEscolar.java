public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        if (nota >= 7)//True
        System.out.println("      Aprovado");

        else if (nota >= 5 && nota < 7)//True ou False
        System.out.println("      Prova Recuperação");

        else
        System.out.println("      Reprovado");//False
    }
    
}
