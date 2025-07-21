//Inheritance
public class QuizQuestion implements Questions{

    private String question;
    private int questionId;
    private String[] answers;
    private int correctAnswerIndex;
    @Override
    public void addQuestion(int questionId, String question, String[] answers, int correctAnswerIndex) {
        this.questionId=questionId;
        this.question=question;
        this.answers=answers;
        this.correctAnswerIndex=correctAnswerIndex;
    }

    @Override
    public void displayQuestions() {
        System.out.println("Question Id: "+questionId);
        System.out.println("Q. "+question);
        System.out.println("Options: ");
        for(int i=0;i<4;i++)
            System.out.println((i+1)+" . "+answers[i]);
    }

    @Override
    public boolean checkAnswer(int userAnswerIndex) {
        return (userAnswerIndex==correctAnswerIndex);
    }

    @Override
    public void displayCorrectAnswers() {
        System.out.println(question);
        System.out.println("Correct Answer - "+correctAnswerIndex);
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }

    public void setCorrectAnswerIndex(int correctAnswerIndex) {
        this.correctAnswerIndex = correctAnswerIndex;
    }
    
}
