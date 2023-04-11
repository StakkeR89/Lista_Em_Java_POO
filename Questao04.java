import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double num = scanner.nextDouble();
        if (num % 2 == 0) {
            System.out.printf("A raiz cúbica de %.2f é %.2f\n", num, calcularRaizCubica(num));
        } else {
            System.out.printf("A raiz quadrada de %.2f é %.2f\n", num, calcularRaizQuadrada(num));
        }
    }

    public static double calcularRaizCubica(double num) {
        return Math.cbrt(num);
    }

    public static double calcularRaizQuadrada(double num) {
        return Math.sqrt(num);
    }
}
