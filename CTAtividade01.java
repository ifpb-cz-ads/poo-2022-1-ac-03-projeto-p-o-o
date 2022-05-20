import java.util.Scanner;

public class CTAtividade01 {
    public static void main(String[] args) {

        System.out.print("Informe sua idade: ");

        Scanner scan = new Scanner(System.in);
        int idade = scan.nextInt();

        if (idade < 16) {
            System.out.println("\nVocê é menor de idade, não pode votar!");
        } else if (idade >= 18 && idade <= 65) {
            System.out.println("\nVocê tem que votar!");
        } else {
            System.out.println("\nVotar é facultativo");
        }

        scan.close();

    }
}
