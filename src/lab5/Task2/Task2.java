package lab5.Task2;


import java.util.Scanner;

public class Task2 {
    private char ch1;
    private char ch2;

    public Task2 (char ch1, char ch2) {
        this.ch1 = ch1;
        this.ch2 = ch2;
    }

    public void printCharacterRange() {
        for (char c = ch1; c <= ch2; c++) {
            System.out.print (c);
        }
    }



}
