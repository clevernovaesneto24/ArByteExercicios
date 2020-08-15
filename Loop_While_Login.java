import java.util.Scanner;
public class Loop_While_Login {

    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);

        System.out.println("Digite sua senha");
        String senha = login.nextLine();

        if(senha.length() < 8) {
            System.out.println("Senha precisa ter no mínimo 8 caracteres");
        }else System.out.println("Tudo certo");
        int i = 0;
        while (i < senha.length()){
            // System.out.println(senha.charAt(i));
            String caracter = String.valueOf(senha.charAt(i));
            if (caracter.equals("@")){
                System.out.println("Senha válida");
            }else System.out.println("Senha invalida");
            i ++;
        }


    }}