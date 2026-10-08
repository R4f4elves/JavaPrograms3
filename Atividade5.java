package JavaLista3;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        double salarioBruto, imposto, salarioLiquido;
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva o valor do seu salário bruto: ");
        salarioBruto = sc.nextDouble();
        imposto = salarioBruto * 0.10;
        salarioLiquido = salarioBruto - imposto;
        System.out.printf("Salário bruto: R$ %.2f\n", salarioBruto);
        System.out.printf("Imposto de 10%%: R$ %.2f\n", imposto);
        System.out.printf("Salário líquido: R$ %.2f\n", salarioLiquido);
        sc.close();
    }
}