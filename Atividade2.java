package JavaLista3;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        int dataA, mesA, anoA, dataIns, mesIns, anoIns;
        dataA = 02;
        mesA = 10;
        anoA = 2026;
        System.out.println("Informe a data de seu nascimento: ");
        Scanner sc = new Scanner(System.in);
        dataIns = sc.nextInt();
        System.out.println("Informe o mes de seu nascimento: ");
        mesIns = sc.nextInt();
        System.out.println("Informe o ano de seu nascimento: ");
        anoIns = sc.nextInt();
        if (anoIns){
            System.out.println("permitido entrada");
        }
        else{
            System.out.println("negado");
        }
    }
}
