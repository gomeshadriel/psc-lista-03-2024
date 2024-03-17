import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coleta de dados do usuário ----------

        System.out.println("Digite o primeiro número da operação: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite um dos seguintes operadores aritméticos (+, -, *, /, ^): ");
        char operador = scanner.next().charAt(0); 

        System.out.println("Digite o segundo número da operação: ");
        double num2 = scanner.nextDouble();

        double resultado = 0; // Para o código funcionar eu preciso atribuir um valor fora do switch, por que? Só Deus sabe...

        // O Switch veirifica qual o valor da variavel operador e direciona para a operação correspondente.

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
            case '^':
                resultado = Math.pow(num1, num2); // No Java para calcular potência eu preciso utilizar o Math.pow
                break;
            default:
                System.out.println("O operador digitado é inválido");
        }

        System.out.println("O resultado da operação é: " + resultado);

        scanner.close();
    }
}