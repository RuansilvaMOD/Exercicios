import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        int n, a = 0, b = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para analise:");
        n = sc.nextInt();

        while (a < n) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        if(a == n) System.out.println("O número pertence a sequência");
        else System.out.println("O número não pertence a sequência");

    }
}
