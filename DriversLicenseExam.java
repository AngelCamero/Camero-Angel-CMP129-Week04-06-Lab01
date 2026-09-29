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
         while (validAnswer == false){
        if (answer == 'A' || answer == 'B' || answer == 'C' || answer == 'D'){
            validAnswer = true;
        }
        else {
            System.out.println("Invalid answer. please try again: ");
        }
        System.out.print("Please enter your answer for question" + (i + 1) + ": ");
        char student = scanner.next().charAt(0);
        answer = Character.toUpperCase(student);
        studentAnswers[i] = student;
    }
    scanner.close();
    }
    }
}