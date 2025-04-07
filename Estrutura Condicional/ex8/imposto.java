package ex8;

import java.util.Scanner;

public class imposto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double renda, taxa = 0;

        System.out.print("Informe sua renda: ");
        renda = sc.nextDouble();

        if (renda > 2000.00 && renda <= 3000.00) {
            taxa = (renda - 2000) * 8 / 100;
        } else {
            if (renda > 3000.00 && renda <= 4500.00) {
                taxa = (renda - 3000) * 18 / 100 + 1000 * 8 / 100;
            } else {
                if (renda > 4500.00) {
                    taxa = (renda - 4500) * 28 / 100 + 1500.0 * 0.18 + 1000.0 * 0.08;   
                }
            }
        }
        System.out.printf("Sua taxa de IR é de R$%.2f%n" , taxa);
        sc.close();
    }
}
