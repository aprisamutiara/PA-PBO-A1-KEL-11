package project.pbo;

import java.util.Random;

public class practice extends game{
    
    public practice(int correctAnswers, int WrongAnswers, int num1, int num2, int result, int answer, int score){
        super(correctAnswers, WrongAnswers, num1, num2, result, answer, score);
    }
    
    public static int generateRandomNumbereasy() {
        Random random = new Random();
        return random.nextInt(20) + 1;
    }
 
    public static int generateRandomNumbermiddle() {
        Random random = new Random();
        return random.nextInt(50) + 1;
    }
    
    public static int generateRandomNumberhard() {
        Random random = new Random();
        return random.nextInt(75) + 1;
    }
    
   @Override
    public boolean checkAnswer(int num1, int num2, int answer) {
        return answer == (num1 + num2);
    }

}
    
    
 
