package JavaLista3;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        double distancia, mediaKML, litros;
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a distância da viagem: ");
        distancia = sc.nextDouble();
        System.out.print("Informe agora a média por litro: ");
        mediaKML = sc.nextDouble();
        litros = distancia / mediaKML;
        System.out.printf("Quantidade de combustível necessária: %.2f litros\n", litros);
        sc.close();
    }
}