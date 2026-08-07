import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String[] questions = {"Who is the Strongest character in JJK?",
                                "Who is the Creator of the Computer?",
                                "How many number of episodes in ONE PIESE?",
                                "Who is the inventor of Bulb?"};

        String[][] options = {{"A.Gojo Satoru","B.Ryomen Sukuna","C.Yuji Itadori","D.Yuta Occotsu"},
                                {"A.Charles Babage","B.Mukesh Ambani","C.Manan Patel","D.Einstine"},
                                {"A.2000","B.1080","C.500","D.700"},
                                {"A.Einstine","B.Newton","C.Ambani","D.Edision"}};

        char[] answerKey = {'C','A','B','D'};
        char answer;
        int score = 0;

        System.out.println("Quiz Game");

        for(int i=0;i<questions.length;i++){
            System.out.println(questions[i]);
            for(int j=0;j<options[i].length;j++){
                System.out.println(options[i][j]);
            }
            System.out.print("Enter your answer:");
            answer = scanner.next().toUpperCase().charAt(0);
            if(answer == answerKey[i]){
                System.out.println("CORRECT!");
                score++;
            }
            else{
                System.out.println("WRONG!");
                System.out.println("Correct Answer:" + answerKey[i]);
            }
        }

        System.out.println("Your Final Score is " + score + " out of " + questions.length);

        scanner.close();

    }
}