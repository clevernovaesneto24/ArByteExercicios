import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite dois numeros: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        if(numero2 > 0){
            int resultado = numero1/numero2;
        }else {
            System.out.println("Seu dividendo é menor que 0");
        }
    }}