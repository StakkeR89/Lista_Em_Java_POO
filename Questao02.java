import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();

        System.out.print("Qual a medida que deseja utilizar: C, F ou K? ");
        String medida = scanner.next().toUpperCase();

        double celsius, fahrenheit, kelvin;

        switch (medida) {
            case "C":
                celsius = temperatura;
                fahrenheit = (celsius * 9/5) + 32;
                kelvin = celsius + 273.15;
                System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
                System.out.println("Temperatura em Kelvin: " + kelvin);
                break;
            case "F":
                fahrenheit = temperatura;
                celsius = (fahrenheit - 32) * 5/9;
                kelvin = celsius + 273.15;
                System.out.println("Temperatura em Celsius: " + celsius);
                System.out.println("Temperatura em Kelvin: " + kelvin);
                break;
            case "K":
                kelvin = temperatura;
                celsius = kelvin - 273.15;
                fahrenheit = (celsius * 9/5) + 32;
                System.out.println("Temperatura em Celsius: " + celsius);
                System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
                break;
            default:
                System.out.println("Medida inválida. Digite C, F ou K.");
        }
    }
}
