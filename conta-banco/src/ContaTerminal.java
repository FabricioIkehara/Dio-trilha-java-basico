import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Por favor, digite o número da Agência !");
      int agencia = scanner.nextInt();

      System.out.println("Digite seu número da conta:");
      int numeroConta = scanner.nextInt();
      
      System.out.println("Digite o nome do Usuário da conta:");
      String nomeusuario = scanner.next();

      System.out.println("Digite o seu saldo:");
      float saldo = scanner.nextFloat();

      System.out.println("Olá " + nomeusuario + ", obrigado por criar uma conta em nosso banco,55 sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " +  saldo + " já está disponível para saque");
   }
 

    
}
