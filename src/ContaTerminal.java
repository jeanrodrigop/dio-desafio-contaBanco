import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //Importar classe scanner
        Scanner scanner = new Scanner(System.in);

        //Exibir mensagens para usuario e obter valores digitados no terminal
        System.out.println("Por favor, digite o numero da Agencia:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o numero da conta:");
        int numeroConta = scanner.nextInt();

        scanner.nextLine();
        
        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();
        
        //Exibir mensagem final
        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " ja esta disponivel para saque.");
        
        scanner.close(); 
    }
}