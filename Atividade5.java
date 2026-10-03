package JavaLista3;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        double salario,imposto,salariof;
        System.out.println("escreva o valor do seu salario ");
        Scanner sc = new Scanner(System.in);
        salario = sc.nextDouble();
        imposto = salario*0.1;
        System.out.println("o valor descontado do imposto é: ");
        System.out.println(imposto);
        salario = salario-imposto;
        System.out.println("valor do salario final liquido: ");
        System.out.println(salario);

    }
}
