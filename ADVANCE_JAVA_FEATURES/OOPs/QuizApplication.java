import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class QuizApplication {
    static LinkedList<Admin> adminList=new LinkedList<>();
    static LinkedList<Player> playerList=new LinkedList<>();
    static LinkedList<QuizQuestion> questionList=new LinkedList<>();
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Quiz Application starting.....");
        int cont=0;
        do {
            System.out.println("Please select your choice..... \nPress 1 for Admin Registration\nPress 2 User Registration\nPress 3 to see the Admin details\nPress 4 to see the User details: ");
            int role=sc.nextInt();
            switch (role) {
                case 1:
                    adminRegistration();
                    break;
                case 2:
                    playerRegistration();
                    break;
                case 3:
                    for(int i=0;i<adminList.size();i++)
                        adminList.get(i).adminDetails();
                    break;
                case 4:
                    for(int i=0;i<playerList.size();i++)
                        playerList.get(i).playerDetails();
                    break;
                default:
                    System.out.println("Please select the correct option.....");
                    break;
            }
            System.out.println("Press 1 to continue or 0 to exit: ");
            cont=sc.nextInt();
        } while (cont==1);
    }

    public static void playerRegistration(){
        System.out.println("Register yourself as player....");
        sc.nextLine();
        System.out.println("Please enter your name: ");
        String name=sc.nextLine();
        Random random=new Random();
        int playerId=random.nextInt(101,200);
        Player player=new Player(name, playerId);
        playerList.add(player);
        System.out.println("Player Registration successfull!!");
        userAccess(player);
    }
    
    public static void userAccess(Player player){
        int cont=0;
        do {
            if(questionList.isEmpty()){
                System.out.println("Question list is empty..");
                return;
            }
            int score=0;
            System.out.println("Welcome "+player.getName()+", Now you can play the Quiz....");
            for(int i=0;i<questionList.size();i++){
                QuizQuestion question=questionList.get(i);
                System.out.println("Q"+question.getQuestionId()+" : ");
                question.displayQuestions();
                System.out.println("Select your answer: ");
                int userAnswerIndex=sc.nextInt();
                if(question.checkAnswer(userAnswerIndex))
                    score++;
            }
            player.setScore(score);
            System.out.println("Quiz finished!!\nYou Current Score: "+player.getScore()
            +" out of "+questionList.size());
            player.playerDetails();
            System.out.println("Press 1 to play again or 0 to exit: ");
            cont=sc.nextInt();
        } while (cont==1);
    }

    public static void adminRegistration(){
        System.out.println("Register yourself as admin....");
        sc.nextLine();
        System.out.println("Please enter your name: ");
        String name=sc.nextLine();
        Random random=new Random();
        int adminId=random.nextInt(1,100);
        Admin admin=new Admin(name, adminId);
        adminList.add(admin);
        System.out.println("Admin Registration successfull!!");
        adminAccess(admin);
    }

    public static void adminAccess(Admin admin){
        System.out.println("Welcome "+admin.getName()+"!!");
        int cont=0;
        do {
            System.out.println("Press 1 to add question\nPress 2 to view question list\nPress 3 to view the correct answers: ");
            int ch=sc.nextInt();
            switch (ch) {
                case 1:
                    addQuestion();
                    break;
                case 2:
                    if(questionList.isEmpty())
                        System.out.println("Question list is empty...");
                    for(int i=0;i<questionList.size();i++)
                        questionList.get(i).displayQuestions();
                    System.out.println();
                    break;
                case 3:
                    if(questionList.isEmpty())
                        System.out.println("Question list is empty...");
                    for(int i=0;i<questionList.size();i++)
                        questionList.get(i).displayCorrectAnswers();
                        System.out.println();
                    break;
                default:
                    System.out.println("Please select the correct option..");
                    break;
            }
            System.out.println("Press 1 to access admin panel or 0 to exit: ");
            cont=sc.nextInt();
        } while (cont==1);
    }

    public static void addQuestion(){
        Random random=new Random();
        int questionId=random.nextInt(301,500);
        sc.nextLine();
        System.out.println("Please enter the question: ");
        String questionText=sc.nextLine();
        System.out.println("Write down options");
        String options[]=new String[4];
        for(int i=0;i<4;i++){
            options[i]=sc.nextLine();
        }
        System.out.println("Please enter the correct answer index: ");
        int correctAnswerIndex=sc.nextInt();

        QuizQuestion quizQuestion=new QuizQuestion();
        quizQuestion.addQuestion(questionId, questionText, options, correctAnswerIndex);
        questionList.add(quizQuestion);

        System.out.println("Question is added successfully!!");
    }
}
