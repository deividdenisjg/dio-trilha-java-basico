import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //TODO: Conhecer e importar a Classe Scanner 

        //Exibir as mensagens para o nosso usuário

        //Obter pelo scanner os valores digitados no terminal

        //Exibir a mensagem conta criada


        //Criando o objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número: ");
        int numero = scanner.nextInt();
        
        System.out.println("Digite a agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo: ");
        Double saldo = scanner.nextDouble();


        System.out.println("Número da conta: " + numero);
        System.out.println("Agência da conta: " + agencia);
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Saldo da conta: " + saldo);
    }
}
