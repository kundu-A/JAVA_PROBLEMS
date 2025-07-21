//Abstraction
interface Questions{
    void addQuestion(int questionId,String question,String[] answers,int correctAnswerIndex);
    void displayQuestions();
    boolean checkAnswer(int userAnswerIndex);
    void displayCorrectAnswers();
}

