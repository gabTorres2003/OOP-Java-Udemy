package ex5;

import java.util.Scanner;

public class lanchonete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade, lanche;
        double valor, total;
        System.out.print("Digite o código do lanche e a quantidade pedida: ");
        lanche = sc.nextInt();
        quantidade = sc.nextInt();


        if (lanche == 1) {
            valor = 4.00;
            total = valor * quantidade;
            System.out.printf("Sua conta ficou por: %.2f%n" , total);
        } else {
            if (lanche == 2) {
                valor = 4.50;
                total = valor * quantidade;
                System.out.printf("Sua conta ficou por: %.2f%n" , total);
            } else {
                if (lanche == 3) {
                    valor = 5.00;
                    total = valor * quantidade;
                    System.out.printf("Sua conta ficou por: %.2fn%" , total);
                } else {
                    if (lanche == 4) {
                        valor = 2.00;
                        total = valor * quantidade;
                        System.out.printf("Sua conta ficou por: %.2f%n" , total);
                    } else {
                        if (lanche == 5) {
                            valor = 1.50;
                            total = valor * quantidade;
                            System.out.printf("Sua conta ficou por: %.2f%n" , total);
                        }
                    }
                }
            }
        }

        sc.close();

    }
}
