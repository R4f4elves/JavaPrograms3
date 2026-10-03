package JavaLista3;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Double distancia, mediaKML, litros;
        System.out.println("Informe a distancia da viajem: ");
        Scanner sc = new Scanner(System.in);
        distancia = sc.nextDouble();
        System.out.println("Informe agora a media por litro: ");
        mediaKML = sc.nextDouble();
        litros = distancia/mediaKML;
        System.out.println("A quantidade de litros necesaria para a viagem é "+litros);
        sc.close();
    }
}