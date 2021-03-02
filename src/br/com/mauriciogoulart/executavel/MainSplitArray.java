package br.com.mauriciogoulart.executavel;

public class MainSplitArray {

    public static void main(String[] args) {

        String text = "Alex, curso Java, 80, 70, 90, 66";

        String[] splitText = text.split(",");

        System.out.println(splitText);
    }
}
