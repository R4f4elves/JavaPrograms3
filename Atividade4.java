package JavaLista3;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Integer vitorias1, vitorias2, jogador1, jogador2;
        System.out.println("Informe as vitórias do jogador 1: ");
        Scanner sc = new Scanner(System.in);
        vitorias1 = sc.nextInt();
        System.out.println("Informe as vitórias do jogador 2");
        vitorias2 = sc.nextInt();
        jogador1 = vitorias1 * 10;
        jogador2 = vitorias2 * 5;
        System.out.println("Vitória do Jogador 1: "+vitorias1);
        System.out.println("Vitória do Jogador 2: "+vitorias2);
        System.out.println("A pontuação do jogador 1 é: "+jogador1);
        System.out.println("A pontuação do jogador 2 é: "+jogador2);



        sc.close();
    }
}
