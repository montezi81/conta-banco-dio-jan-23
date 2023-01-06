import java.util.Scanner;

import java.util.Locale;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("========================================================");

        System.out.println("Por favor digite o número da conta: ");
        int Numero = scanner.nextInt();

        System.out.println("Por favor digite o número da agência: ");
        String Agencia = scanner.next();

        System.out.println("Por favor digite o nome do cliente: ");
        String NomeCliente = scanner.next();

        System.out.println("Por favor digite o Sobrenome do cliente: ");
        String SobrenomeCliente = scanner.next();

        System.out.println("Por favor digite o saldo U$: ");
        Float Saldo = scanner.nextFloat();

        System.out.println("========================================================");

        System.out.println("Olá " + NomeCliente + " " + SobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo R$ " + Saldo + ", já está disponível para saque !");

        System.out.println("========================================================");

        


    }
}
