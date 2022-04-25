
public class Desafio4 {

    public void start() {
        String [] texts = new String[5];
        texts[0] = "I ENIL SIHTHSIREBBIG S";
        texts[1] = "LEVELKAYAK";
        texts[2] = "H YPPAHSYADILO";
        texts[3] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        texts[4] = "VOD OWT SNEH HCNERF EGDIRTRAP A DNA SE";
        System.out.println("5");

        this.correctPrinter(texts);
    }

    public void correctPrinter(String[] textArray) {
        for (int i = 0; i < textArray.length; i++) {
            char[] text = textArray[i].toCharArray();
            for (int j = ((text.length/2)-1) ; j >= 0; j--) {
                System.out.print(text[j]);
            }
            for (int j = text.length-1; j >= (text.length/2); j--) {
                System.out.print(text[j]);
            }
            System.out.print(" \n ");
        }
    }

}
