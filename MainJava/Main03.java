package MainJava;

import ListaJava.Ativ03;
import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo;

        System.out.println("Digite o Saldo para Reajuste de 1%: ");
        saldo =  sc.nextDouble();
        double novoSaldo = saldo;

        System.out.println("O Saldo com reajuste de 1% é de R$ " + novoSaldo);

    }
}


