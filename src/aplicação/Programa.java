package aplicação;

import entidades.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.print("Digite o número da conta: ");
        int numero = sc.nextInt();
        System.out.print("Digite a conta do titular: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.print("Iniciar com um depósito? (s/n)? ");
        char response = sc.next().charAt(0);
        if (response == 's') {
            System.out.print("Insira o valor do depósito inicial\n: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numero, titular, depositoInicial);
        } else {
            conta = new Conta(numero, titular);
        }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite o valor do deposito: ");
        double valorDepositado = sc.nextDouble();
        conta.deposito(valorDepositado);
        System.out.println("Dados da conta atualizados:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite o valor sacado: ");
        double valorSacado = sc.nextDouble();
        conta.sacar(valorSacado);
        System.out.println("Dados da conta atualizado:");
        System.out.println(conta);

        sc.close();
    }
}
