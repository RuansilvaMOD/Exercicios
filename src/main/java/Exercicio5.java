import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palavra = sc.nextLine();

        char[] caracteres = palavra.toCharArray();
        char[] newChar = new char[caracteres.length];
        String invertida = "";

        int inicio = caracteres.length - 1;

        for(char c : caracteres) {
            newChar[inicio] = c;
            inicio--;
        }

        for(char c : newChar) {
            invertida += c;
        }

        System.out.println("String invertida: " + invertida);
    }
}
