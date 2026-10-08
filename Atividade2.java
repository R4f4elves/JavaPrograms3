package JavaLista3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a data de nascimento (dd/MM/yyyy): ");
        String dataNascimentoStr = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        int idade = periodo.getYears();
        System.out.println("Data de nascimento: " + dataNascimentoStr);
        System.out.println("Idade: " + idade + " anos");
        if (idade >= 18) {
            System.out.println("Entrada permitida: Sim");
        } else {
            System.out.println("Entrada permitida: Não");
        }

        sc.close();
    }
}
