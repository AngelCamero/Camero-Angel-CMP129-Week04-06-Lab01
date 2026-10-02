import java.util.Scanner;
import java.util.Random;
public class Lottery {
    static int [] lotteryNumbers = new int[5];
    static int [] userNumbers = new int[5];
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean validEntry = false;
        int userChoice = 0;
            for (int i = 0; i < lotteryNumbers.length; i++){
        lotteryNumbers[i] = random.nextInt(10);
        }
        System.out.println();
        for (int i = 0; i < userNumbers.length; i++){
            validEntry = false;
            while (!validEntry) {
                System.out.print("Please enter your choice for slot " + (i + 1) + ": ");
                userChoice = scanner.nextInt();
                if (userChoice < 10 && userChoice >= 0) {
                    validEntry = true;
                    userNumbers[i] = userChoice;
                }
                else {
                    System.out.println("Invalid number. Please choose again.");
                }
            }
        }
        int match = 0;
        for (int i = 0; i < userNumbers.length; i++){
            if (userNumbers[i] == lotteryNumbers[i]){
                match++;
            }
        }
        System.out.println("The winning numbers are: ");
        for (int i = 0; i < lotteryNumbers.length; i++){
            System.out.print(lotteryNumbers[i]);
            if (i < lotteryNumbers.length - 1){
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println("Your numbers are: ");
        for (int i = 0; i < userNumbers.length; i++){
            System.out.print(userNumbers[i]);
            if (i < userNumbers.length - 1){
                System.out.print(" ");
            }
        }
        System.out.println();
        if (match == 5){
            System.out.println("Congratulations, You have just won the Grand Prize.");
        }
        else{
            System.out.println("The amount of numbers matched are: " + match);
        }
    }
}
