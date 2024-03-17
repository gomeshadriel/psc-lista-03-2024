import java.util.Scanner;
import java.util.Random;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Entrada de dados pelo usuário ----------

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        //Verifica se o primeiro número é maior ou menor que o segundo e direciona para a geração do número aleatório com base na ordem crescente dos números digitados ----------

        if (num1 < num2) { //Se o primeiro número for menor este bloco sera executado.
            int numAle = random.nextInt(num2 - num1 + 1) + num1;
            if (numAle % 2 == 0) { // Verifica a paridade do número e retorna ao usuário.
                System.out.println("O número aleatório gerado é: (" + numAle + ") e ele é um número par.");
            } else {
                System.out.println("O número aleatório gerado é: (" + numAle + ") e ele é um número ímpar.");
            }
        } else { //Se o segundo número for menor este bloco sera executado.
            int numAle = random.nextInt(num1 - num2 + 1) + num2;
            if (numAle % 2 == 0) { // Verifica a paridade do número e retorna ao usuário.
                System.out.println("O número aleatório gerado é: (" + numAle + ") e ele é um número par.");
            } else {
                System.out.println("O número aleatório gerado é: (" + numAle + ") e ele é um número ímpar.");
            }
        }
        scanner.close();
    }
}