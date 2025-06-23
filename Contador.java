
import java.util.Scanner;

public class Contador{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1 = 0, numero2 = 0;

        System.out.print("Insira o primeiro numero: ");
        numero1 = scanner.nextInt();
        System.out.print("Insira o segundo numero: ");
        numero2 = scanner.nextInt();

        try {
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void contar(int numero1, int numero2) throws ParametrosInvalidosException{
        if(numero1 > numero2) throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
    
        int conta = numero2 - numero1;

        for(int i = 1; i <= conta; i++){
            System.out.println("Imprimindo o número "+i);
        }
    }
}