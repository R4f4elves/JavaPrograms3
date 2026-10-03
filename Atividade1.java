package JavaLista3;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        double notaProva, notaAtividade, mediaProva, mediaAtividade, mediaFinal;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a nota da prova do aluno: ");
        notaProva = sc.nextDouble();

        System.out.println("Informe agora a nota de atividade do aluno: ");
        notaAtividade = sc.nextDouble();


        mediaProva = notaProva * 0.7;
        mediaAtividade = notaAtividade * 0.3;


        mediaFinal = mediaProva + mediaAtividade;

        sc.close();
        if (mediaFinal >= 6.0) {
            System.out.println("Média Final: " + mediaFinal + " - Situação: Aprovado");
        } else {
            System.out.println("Média Final: " + mediaFinal + " - Situação: Reprovado");
        }
    }
}
