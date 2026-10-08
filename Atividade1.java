package JavaLista3;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        double notaProva, notaAtividade, mediaProva, mediaAtividade, mediaFinal;
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a nota da prova do aluno: ");
        notaProva = sc.nextDouble();
        System.out.print("Informe a nota de atividade do aluno: ");
        notaAtividade = sc.nextDouble();
        mediaProva = notaProva * 0.7;
        mediaAtividade = notaAtividade * 0.3;
        mediaFinal = mediaProva + mediaAtividade;
        if (mediaFinal >= 6.0) {
            System.out.printf("Média Final: %.2f - Situação: Aprovado\n", mediaFinal);
        } else {
            System.out.printf("Média Final: %.2f - Situação: Reprovado\n", mediaFinal);
        }
        sc.close();
    }
}