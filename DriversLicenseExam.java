import java.util.Scanner;
public class DriversLicenseExam {
    static char[] correctAnswers = {'A', 'D', 'B', 'B', 'C', 'B', 'A', 'B',
        'C', 'D', 'A', 'C', 'D', 'B', 'D', 'C', 'C', 'A', 'D', 'B'};
    static char[] studentAnswers = new char[20];
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        boolean validAnswer = false;
        char answer = 'a';
        for (int i = 0; i < studentAnswers.length; i++){
            validAnswer = false;
            while (!validAnswer){
                System.out.print("Please enter your answer for question " + (i + 1) + ": ");
                answer = Character.toUpperCase(scanner.next().charAt(0));
                if (answer == 'A' || answer == 'B' || answer == 'C' || answer == 'D'){
                    validAnswer = true;
                    studentAnswers[i] = answer;
                }
                else {
                System.out.println("Invalid answer. please try again: ");
                }
            }
        }
        int correct = 0;
        int incorrect = 0;
        int [] wrongAnswers = new int[20];
        for (int i = 0; i < studentAnswers.length; i++){
            if (studentAnswers[i] == correctAnswers[i]){
                correct++;
            }
            else{
                wrongAnswers[incorrect] = i + 1;
                incorrect++;
            }
        }
        if (correct < 15){
            System.out.println("You have failed the test with " + correct + "/20 correct answers.");
        }
        else{
            System.out.println("Congratulations, You have passed this exam with " + correct + "/20 correct answers");
        }
        System.out.println("The questions you got incorrect are: ");
        for (int i = 0; i < incorrect; i++){
            System.out.print(wrongAnswers[i]);
            if (i < incorrect - 1){
                System.out.print(" ");
            }
        }
        System.out.println();
    scanner.close(); 
    }
}