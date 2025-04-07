package ex3;
import java.util.Scanner;
public class multiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Verfique se os números são múltiplos!");
        System.out.println("Insira o número 1 e 2: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 % num2 == 0) {
            System.out.println("São múltiplos!");
        }
        else{
            System.out.println("Não são múltiplos!");
        }
        sc.close();
    }
}
