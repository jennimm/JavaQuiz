import java.util.Scanner;

class Quiz {
    public static void main(String [] args) {
        String q1 = "What colour is the sky?" + "a)Blue b)Green";

        Question [] questions = {
            new Question(q1, "a")
        };
        execute(questions);
    }

    public static void execute(Question [] questions) {
        int score = 0;
        Scanner inputAnswer = new Scanner(System.in);

        System.out.println(questions[0].query);
        String answer = inputAnswer.nextLine();
        if(answer.equals(questions[0].answer)){
            score++;  
        }
        System.out.println("You got " + score);

    }
}