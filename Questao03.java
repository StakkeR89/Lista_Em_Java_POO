import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = input.nextLine();
        System.out.print("Digite o sobrenome: ");
        String sobrenome = input.nextLine();

        if (sobrenome.equals("Wayne")) {
            System.out.println("Acesso liberado, Sr. Wayne");
        } else if (sobrenome.equals("Kent")) {
            System.out.println("Saí daí, Kryptoniano safado!");
        } else if (nome.equals("Diana")) {
            System.out.println("Bem-vinda, Princesa de Themyscira");
        } else {
            System.out.println("Cai fora!");
        }

        input.close();
    }
}
