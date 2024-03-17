import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados do usuário ----------

        System.out.println("Digite o valor para o coeficiente 'a': ");
        double a = scanner.nextDouble();

        System.out.println("Digite o valor para o coeficiente 'b': ");
        double b = scanner.nextDouble();

        System.out.println("Digite o valor para o coeficiente 'c': ");
        double c = scanner.nextDouble();

        // Verificação de preenchimento ----------

        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if (a == 0 && b != 0) { // Equação de primeiro grau
            double raizReal = -c / b;
            System.out.println("Essa é uma equação de primeiro grau.");
            System.out.println("A raiz real da equação é: " + raizReal);
        } else { // Equação de segundo grau

            // Cálculo do delta ----------

            double delta = b * b - 4 * a * c;

            // Cálculo do delta ----------

            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais.");
            } else if (delta == 0) {
                double raizReal = -b / (2 * a);
                System.out.println("Esta equação possui duas raízes reais iguais.");
                System.out.println("As raízes da equação são: " + raizReal + " e " + raizReal);
            } else {
                double raizReal1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raizReal2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Esta equação possui duas raízes reais diferentes.");
                System.out.println("As raízes da equação são: " + raizReal1 + " e " + raizReal2);
            }
        }
        scanner.close();

    }
}