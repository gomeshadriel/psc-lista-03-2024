import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a operação desejada ----------
        System.out.println("1. Perímetro do círculo \n2. Área do círculo \n3. Volume da esfera \nDigite o número do cálculo desejado: ");
        int numeroCalculo = scanner.nextInt();

        // Verifica se o número da opção desejada digitado é válido ----------
        if (numeroCalculo < 1 || numeroCalculo > 3) {
            System.out.println("Digite um número válido.");
        } else {
            // Solicita o valor do raio ----------
            System.out.println("Digite o valor do raio: ");
            double raio = scanner.nextDouble();

            // Verifica se o raio é positivo ----------
            if (raio <= 0) {
                System.out.println("O raio deve ser um valor positivo.");
            } else {
                // Direciona o usuário ao "case" da operação desejada ----------
                switch (numeroCalculo) {
                    case 1:
                        // Calcula o perímetro de um círculo e retorna o valor ao usuário ----------
                        double perimetro = 2 * Math.PI * raio;
                        System.out.println("O perímetro do círculo é: " + perimetro);
                        break;
                    case 2:
                        // Calcula a área de um círculo e retorna o valor ao usuário ----------
                        double area = Math.PI * raio * raio;
                        System.out.println("A área do círculo é: " + area);
                        break;
                    case 3:
                        // Calcula o volume de uma esfera e retorna o valor ao usuário ----------
                        double volume = (4.0 / 3.0) * Math.PI * raio * raio * raio;
                        System.out.println("O volume da esfera é: " + volume);
                        break;
                }
            }
        }

        scanner.close();
    }
}