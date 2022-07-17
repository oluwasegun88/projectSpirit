import java.sql.SQLOutput;
import java.util.Scanner;

public class MyersBriggs {
    public static void main(String[] args) {
        String[] questionA = new String[]{"Expand energy, enjoy groups","Interpret literally", "Logical, thinking, questioning"};
        String[] questionB = new String[]{"Conserve energy, enjoy one-on-one", " look for meaning and possibilities", " Empathetic, feeling, accommodating"};
        String[] answers = new String [1];
        Scanner scanner = new Scanner(System.in);

        for (int b=0; b<20; b++){
            for (int i=0; i<questionA.length;i++){
                for (int j=0; j<questionB.length; j++){

                    System.out.println(questionA[i] + " | " + questionB[i]);
                    String answer = scanner.next();
                    answers[i] = answer;
                }
            }
        }
    }
}
