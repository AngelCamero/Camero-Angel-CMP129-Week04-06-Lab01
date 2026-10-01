import java.util.Scanner;
import java.util.Random;
public class Lottery {
    static int [] lotteryNumbers = new int[5];
    static int [] userNumbers = new int[5];
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
            for (int i = 0; i < lotteryNumbers.length; i++){
        lotteryNumbers[i] = random.nextInt(10);
        }
        for (int i = 0; i < userNumbers.length; i++){
            while (!validEntry)
        }
        
    }
}
