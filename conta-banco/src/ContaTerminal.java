import java.util.Scanner;
public class ContaTerminal {
public static void main(String[] args) throws Exception {
    
Scanner sc = new Scanner(System.in);

System.out.println("Por favor, digite o número da conta:");
int numero = sc.nextInt();

System.out.println("Por favor, digite o número da agência:");
    String agencia = sc.next();

System.out.println("Por favor, Digite o nome do cliente:");
    String nomeCliente = sc.next();

System.out.println("Por favor, digite o saldo:");
    double saldo = sc.nextDouble();

System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

}

}

//TODO: Conhecer e importar a classe Scanner 
     //Exibir as mensagens para nosso usuário

     //Obter pela classe Scanner os valores digitados no terminal

     //Exbir a mensagem conta criada
    