package ex7;

import java.util.Scanner;

public class cartesiano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,y;

        System.out.print("Insira as coordenadas X e Y: ");
        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x > 0.00 && y > 0.00) {
            System.out.println("Q1");
        } else {
            if (x > 0.00 && y < 0.00) {
                System.out.println("Q4");
            } else {
                if (x < 0.00 && y > 0.00) {
                    System.out.println("Q2");
                } else {
                    if (x < 0.00 && y < 0.00) {
                        System.out.println("Q3");
                    } else {
                        if (x == 0.00 && y != x) {
                            System.out.println("Eixo Y");
                        } else {
                            if (x != y && y == 0.00) {
                                System.out.println("Eixo X");
                            } else {
                                if (x == y && y == 0.0) {
                                    System.out.println("Origem.");
                                }
                            }
                        }
                    }
                }
            }
        }
        sc.close();
    }
}
