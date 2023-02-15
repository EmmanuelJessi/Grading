import java.util.Scanner;

public class Scores{

    public static void main(String[] args) {
        showGrade();
    }
    static void showGrade(){

        float quiz_scores, mid_scores, final_scores,avg;
        Scanner princess = new Scanner(System.in);
        System.out.println("Quiz score: ");
        quiz_scores = princess.nextFloat();
        System.out.println("Mid-term scores: ");

        mid_scores = princess.nextFloat();
        System.out.println("Final scores");
        final_scores = princess.nextFloat();
        avg = (quiz_scores+mid_scores+final_scores)/3;

        if (avg >= 90)
        System.out.println("Your Grade A");
        else if(avg >= 70)
        System.out.println("Your Grade B");
        else if (avg >= 50)
        System.out.println("Your Grade C");
        else if (avg < 50)
        System.out.println("Your Grade F.");
        else{
            System.out.println("Invalid");
        }


    }
}