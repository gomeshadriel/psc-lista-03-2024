import java.util.Scanner;

public class Exercicio01 {
    public static void main (String[] args) {

        double numero1, numero2, numero3, media;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\"Digite o primeiro número: ");
        numero1 = scanner.nextDouble();

        System.out.println("\"Digite o segundo número: ");
        numero2 = scanner.nextDouble();

        System.out.println("\"Digite o terceiro número: ");
        numero3 = scanner.nextDouble();

        // Cálculo de Média ----------

        media = (numero1 + numero2 + numero3) / 3;

        //Teste lógico para o mairo número ----------

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("\nO MAIOR número é: "+ numero1);            
        }

        else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("\nO MAIOR número é: "+ numero2);            
        }

        else {
            System.out.println("\nO MAIOR número é: "+ numero3);            
        }

        //Teste lógico para o menor número ----------

        if (numero1 < numero2 && numero1 < numero3) {
            System.out.println("\nO MENOR número é: "+ numero1);            
        }

        else if (numero2 < numero1 && numero2 < numero3) {
            System.out.println("\nO MENOR número é: "+ numero2);            
        }

        else {
            System.out.println("\nO MENOR número é: "+ numero3);            
        }

        System.out.println("\nA média dos 3 números é: "+ media);   
        scanner.close();

    }
}