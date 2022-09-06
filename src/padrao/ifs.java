package padrao;

import javax.swing.*;
import java.util.Scanner;

public class ifs {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int media;
        System.out.println("Qual é a media?");
        media = entrada.nextInt();
        //media = JOptionPane.showInputDialog(null,"Qual é a media");
        if (media > 7) {
            System.out.println("Aprovado");

        } else if (media > 5) {
            System.out.println("Fazer AF ");
            }
        else{
            System.out.println("Reprovado");
        }
    }
}
