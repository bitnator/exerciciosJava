import java.util.Scanner;

public class Desafio1 {
    Scanner myObj = new Scanner(System.in);
    int evenNumbers = 0;
    int oddNumbers = 0;

    public void start() {
        System.out.println("Informe a quantidade de entradas");
        int size = myObj.nextInt();
        this.getNumbers(size);
    }

    public void getNumbers(int size) {
        int [] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Insira um valor: ");
            numbers[i] = myObj.nextInt();
            if(numbers[i] % 2 != 0) {
                this.oddNumbers++;
            } else {
                this.evenNumbers++;
            }
        }
        this.setOrder(numbers);
    }

    public void setOrder(int[] numbers) {
        this.showEvenNumbers(numbers);
        this.showOddNumbers(numbers);
    }

    public void showEvenNumbers(int[] numbers) {
        int [] evens  = new int[this.evenNumbers];
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evens[counter] = numbers[i];
                counter++;
            }
        }
        // ordenando o array
        for (int i = 1; i < evens.length; i++) {
            for (int j = 0; j < i; j++) {
                if(evens[i] < evens[j]) {
                    int tmp = evens[i];
                    evens[i] = evens[j];
                    evens[j] = tmp;
                }
            }
        }

        for (int i = 0; i < evens.length; i++) {
            System.out.println(evens[i]);
        }
    }

    public void showOddNumbers(int[] numbers) {
        int [] odds  = new int[this.oddNumbers];
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                odds[counter] = numbers[i];
                counter++;
            }
        }
        // ordenando o array
        for (int i = 1; i < odds.length; i++) {
            for (int j = 0; j < i; j++) {
                if(odds[i] > odds[j]) {
                    int tmp = odds[i];
                    odds[i] = odds[j];
                    odds[j] = tmp;
                }
            }
        }

        for (int i = 0; i < odds.length; i++) {
            System.out.println(odds[i]);
        }
    }

}
