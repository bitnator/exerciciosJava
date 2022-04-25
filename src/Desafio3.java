import java.util.Scanner;
import java.lang.Math;

public class Desafio3 {
    Scanner input1 = new Scanner(System.in);

    public void start() {
        int matchingNumbers = 0;
        System.out.println("Informe o tamanho vetor:");
        int n = input1.nextInt();

        System.out.println("informe o valor a ser verificado:");
        int k = input1.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int)(Math.random() * 10) + 0;
            if(i > 0) {
                if(array[i] - array[i-1] == k ) {
                    matchingNumbers++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " , ");
        }
        System.out.println("\n Quantidade de ocorrências: ");
        System.out.println(matchingNumbers);
    }


}
