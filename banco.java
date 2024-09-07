import java.util.Scanner;
import java.io.IOException;
public class banco {
    // TODO função de receber
    public static double receber(double din, double receber) {
        double valor = din + receber;
        return valor;
    }

    // TODO função de envio
    public static double enviar(double din, double trans) {
        double valor = din - trans;
        return valor;
    }
    

    // TODO função principal
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("clear");
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do cliente: ");
        String nome = leitura.nextLine();
        System.out.println("Digite o tipo da conta");
        String tipo = leitura.nextLine();
        int opc = 5;
        
        System.out.println("Digite o valor que tem na sua conta: ");
        double saldo = leitura.nextDouble();

        

        while (opc != 0) {
            pb = new ProcessBuilder("clear");
            
            System.out.println("**********************************************");
            System.out.println("Cliente do Banco: " + nome);
            System.out.println("Tipo da Conta: " + tipo);
            System.out.println("Saldo Inicial: R$" + saldo);
            System.out.println("**********************************************");
            System.out.println("Operações:");
            System.out.println("0 - Sair");
            System.out.println("1 - Receber valores");
            System.out.println("2 - transferir valores");
            System.out.println("Digite a operação que vai ser feita: ");
            opc = leitura.nextInt();

            if (opc == 1) {
                pb = new ProcessBuilder("clear");
                System.out.println("Digite valor para ser receber: ");
                double receber = leitura.nextDouble();
                saldo = receber(saldo, receber);
            } else if (opc == 2) {
                pb = new ProcessBuilder("clear");
                System.out.println("Digite valor para ser enviado: ");
                double trans = leitura.nextDouble();
                saldo = enviar(saldo, trans);
            }             
        }
        pb = new ProcessBuilder("clear");
        System.out.println("Até Logo");
    }
}
