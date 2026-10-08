package JavaLista3;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        int vitorias1, vitorias2, jogador1, jogador2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe as vitórias do jogador 1: ");
        vitorias1 = sc.nextInt();
        System.out.print("Informe as vitórias do jogador 2: ");
        vitorias2 = sc.nextInt();
        jogador1 = vitorias1 * 10;
        jogador2 = vitorias2 * 5;
        System.out.println("Vitórias do jogador 1: " + vitorias1);
        System.out.println("Vitórias do jogador 2: " + vitorias2);
        System.out.println("Pontuação do jogador 1: " + jogador1 + " pontos");
        System.out.println("Pontuação do jogador 2: " + jogador2 + " pontos");

        sc.close();
    }
}