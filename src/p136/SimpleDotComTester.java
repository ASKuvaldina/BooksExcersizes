package p136;

import java.util.Scanner;

public class SimpleDotComTester {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        SimpleDotCom dot = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 10);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        dot.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive) {
            System.out.println("Введите число: ");
            Scanner scanner = new Scanner(System.in);
            String userGuess = scanner.nextLine();
            String result = dot.checkYourself(userGuess);
            numOfGuesses++;
            if (result == "Потопил") {
                isAlive = false;
                System.out.println("Количество попыток " + numOfGuesses);
            }
        }


    }
}
