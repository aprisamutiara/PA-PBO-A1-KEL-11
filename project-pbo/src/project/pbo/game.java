package project.pbo;

public abstract class game {
    
    int correctAnswers, WrongAnswers, num1, num2, result, answer, score; 
    
    public game (int correctAnswers, int WrongAnswers, int num1, int num2, int result, int answer, int score){
        this.correctAnswers = correctAnswers; 
        this.WrongAnswers = WrongAnswers; 
        this.num1 = num1;
        this.num2 = num2; 
        this.result = result; 
        this.answer = answer;
        this.score = score; 
    }
    
    public int getCorrectAnswers() {
        return this.correctAnswers;
    }

    public void setCorrectAnswers(int correctAnswers) {
        this.correctAnswers = correctAnswers;
    }
    
    public int getWrongAnswers() {
        return this.WrongAnswers;
    }

    public void setWrongAnswers(int WrongAnswers) {
        this.WrongAnswers = WrongAnswers;
    }
 
    public int getNum1() {
        return this.num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }
    
    public int getNum2() {
        return this.num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public int getResult() {
        return this.result;
    }

    public void setResult(int result) {
        this.result = result;
    }
    
    public int getAnswer() {
        return this.answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
    
    public int getScore() {
        return score;
    }
    
    public void setScore(int score) {
        this.score = score;
    }

    public abstract boolean checkAnswer(int num1, int num2, int answer);   
}
