package ex2;

import java.util.Scanner;

public class imparPar {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Descubra se o número é impar ou par");
        System.out.print("Digite o número: ");
        numero = sc.nextInt();

        if ((numero % 2) == 0){
            System.out.println("Número par!");
        }
        else {
            System.out.println("Número ímpar!");
        }
        sc.close();
    }
}
