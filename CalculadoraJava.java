import java.util.Scanner;

public class CalculadoraJava {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma operador");
        String operador = scanner.nextLine();

        System.out.println("digite um numero");
        int n1 = scanner.nextInt();

        System.out.println("digite o 2° numero");
        int n2 = scanner.nextInt();
        int resultado = 0;
        if(operador.equals("+")){
            resultado = n1 + n2;
        }else if (operador.equals("-")){
            resultado = n1 - n2;
        }else if (operador.equals("*")){
            resultado = n1 * n2;
        }else if (operador.equals("/")) {
            resultado = n1 / n2;
        }else System.out.println("Operador invalido");
        System.out.println(resultado);
    }
}