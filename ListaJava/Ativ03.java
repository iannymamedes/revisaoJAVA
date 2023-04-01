package ListaJava;

import java.util.Scanner;



public class Ativ03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o saldo atual: ");
        double saldo = sc.nextDouble();

        double saldoReajustado = saldo * 1.01; // reajuste de 1%

        System.out.printf("Seu saldo com reajuste é: R$ %.2f", saldoReajustado);

        sc.close();
    }
}
