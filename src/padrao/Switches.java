package padrao;

import java.util.Scanner;

public class Switches {
    public static void main(String[] args) {
        int media;
        String situacao;
        char a;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a Media: ");
        media = teclado.nextInt();

        situacao = media > 7 ? "Aprovado":
                (media > 5 ? "Fazer a AF" : "Reprovado");

        System.out.println("Digite uma das opções: ");
        System.out.println("Cacular a media");
        System.out.println("S Situtuação do Aluno");
        a = teclado.next().charAt(0);
        switch (a){
            case 1:
                System.out.println(media);
                break;
            case 2:
                System.out.println(situacao);
                break;
            default:
                System.out.println("Obrigado!");
        }
    }
}
