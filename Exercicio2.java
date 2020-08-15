import java.util.Scanner;

public class Exercicio2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua senha");
        String passdw = scanner.nextLine();

        if (passdw.length() >= 8 && passdw.length() <= 10) {
            System.out.println("Senha correta");
        }
        else {System.out.println("Senha do tamanho errado");
        }
    }}
