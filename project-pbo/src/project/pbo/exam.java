package project.pbo;

import java.util.Random;

public class exam extends game{  
    
    long startTime, endTime;
    
    public exam(int correctAnswers, int WrongAnswers, int num1, int num2, int result, int answer, int score, long startTime, long endTime){
      super(correctAnswers, WrongAnswers, num1, num2, result, answer, score);
      this.startTime = startTime;
      this.endTime = endTime;
    }
    
    public long getStartTime() {
        return this.startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }
    
    public long getEndTime() {
        return this.endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
    
    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
    
    @Override
    public boolean checkAnswer(int num1, int num2, int answer) {
        return answer == (num1 + num2);
    }
    
}

      
