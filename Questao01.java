import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, result;
        String op;

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextDouble();

        do {
            System.out.print("Digite a operação (+, -, *, /, ^, sqrt, sair): ");
            op = input.next().toLowerCase();

            switch (op) {
                case "+":
                case "soma":
                    System.out.print("Digite o próximo número: ");
                    num2 = input.nextDouble();
                    result = num1 + num2;
                    System.out.println("Resultado: " + result);
                    num1 = result;
                    break;
                case "-":
                case "subtração":
                    System.out.print("Digite o próximo número: ");
                    num2 = input.nextDouble();
                    result = num1 - num2;
                    System.out.println("Resultado: " + result);
                    num1 = result;
                    break;
                case "*":
                case "multiplicação":
                    System.out.print("Digite o próximo número: ");
                    num2 = input.nextDouble();
                    result = num1 * num2;
                    System.out.println("Resultado: " + result);
                    num1 = result;
                    break;
                case "/":
                case "divisão":
                    System.out.print("Digite o próximo número: ");
                    num2 = input.nextDouble();
                    if (num2 == 0) {
                        System.out.println("Erro: divisão por zero");
                        break;
                    }
                    result = num1 / num2;
                    System.out.println("Resultado: " + result);
                    num1 = result;
                    break;
                case "^":
                case "potência":
                    System.out.print("Digite o expoente: ");
                    double expoente = input.nextDouble();
                    result = Math.pow(num1, expoente);
                    System.out.println("Resultado: " + result);
                    num1 = result;
                    break;
                case "sqrt":
                case "raiz quadrada":
                    result = Math.sqrt(num1);
                    System.out.println("Resultado: " + result);
                    num1 = result;
                    break;
                case "sair":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Erro: operação inválida");
            }
        } while (!op.equals("sair"));

        input.close();
    }
}
