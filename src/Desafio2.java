import java.util.Scanner;

public class Desafio2 {
    Scanner input1 = new Scanner(System.in);

    public void start() {
        System.out.println("Informe o valor:");
        Double value = Double.parseDouble(input1.nextLine());
        int cashNumber = 0;

        System.out.println("NOTAS:");
        while(value > 100) {
            value = value - 100;
            cashNumber++;
        }
        System.out.println(cashNumber + " nota(s) de R$ 100.00");
        cashNumber = 0;

        while(value > 50) {
            value = value - 50;
            cashNumber++;
        }
        System.out.println(cashNumber + " nota(s) de R$ 50.00");
        cashNumber = 0;

        while(value > 20) {
            value = value - 20;
            cashNumber++;
        }
        System.out.println(cashNumber + " nota(s) de R$ 20.00");
        cashNumber = 0;

        while(value > 10) {
            value = value - 10;
            cashNumber++;
        }
        System.out.println(cashNumber + " nota(s) de R$ 10.00");
        cashNumber = 0;

        System.out.println("MOEDAS:");
        while(value > 1) {
            value = value - 1;
            cashNumber++;
        }
        System.out.println(cashNumber + " moeda(s) de R$ 1.00");
        cashNumber = 0;

        while(value > 0.5) {
            value = value - 0.5;
            cashNumber++;
        }
        System.out.println(cashNumber + " moeda(s) de R$ 0.50");
        cashNumber = 0;

        while(value > 0.25) {
            value = value - 0.25;
            cashNumber++;
        }
        System.out.println(cashNumber + " moeda(s) de R$ 0.25");
        cashNumber = 0;

        while(value > 0.1) {
            value = value - 0.1;
            cashNumber++;
        }
        System.out.println(cashNumber + " moeda(s) de R$ 0.10");
        cashNumber = 0;

        while(value > 0.05) {
            value = value - 0.05;
            cashNumber++;
        }
        System.out.println(cashNumber + " moeda(s) de R$ 0.05");
        cashNumber = 0;

        while(value > 0.01) {
            value = value - 0.01;
            cashNumber++;
        }
        System.out.println(cashNumber + " moeda(s) de R$ 0.01");
        cashNumber = 0;

    }


}
