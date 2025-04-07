package ex6;

import java.util.Scanner;

public class intervalos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor;

        System.out.print("Insira um valor aleatório: ");
        valor = sc.nextDouble();

        if (valor >= 0.01 && valor <= 25.00) {
            System.out.println("Intervalo: 0 - 25");
        }else{
            if (valor >= 25.01 && valor <= 50.00) {
                System.out.println("Intervalo: 25 - 50");
            }else{
                if (valor >= 50.01 && valor <= 75.00) {
                    System.out.println("Intervalo: 50 - 75");
                }else{
                    if (valor >= 75.01 && valor <= 100.00) {
                        System.out.println("Intervalo: 75 - 100");
                    }else{
                        System.out.println("Valor fora dos intervalos padrões!");
                    }
                }
            }
        }
        sc.close();
    }
}
