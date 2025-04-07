import java.util.Scanner;

public class negativo {
    public static void main(String[] args) throws Exception {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Número negativo ou não?");
        System.out.println("Digite um número e descubra se é negativo ou não: ");
        numero = sc.nextInt();
        if (numero > 0) {
            System.out.println("O número não é negativo!");
        }
        else{
            System.out.println("O número é negativo!");
        }
        sc.close();
    }
}
