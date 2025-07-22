import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;

public class QuizApplication {
    static LinkedList<Admin> adminList=new LinkedList<>();
    static LinkedList<Player> playerList=new LinkedList<>();
    static LinkedList<QuizQuestion> questionList=new LinkedList<>();
    static Map<Integer,Integer> answerList=new HashMap<>();
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
        Optional<Player> existingPlayer = playerList.stream()
            .filter(player -> player.getName().equalsIgnoreCase(name))
            .findFirst();

        if (existingPlayer.isPresent()) {
            System.out.println("Player with this name already exists. Redirecting to quiz...");
            playerAccess(existingPlayer.get());
        }

        Random random=new Random();
        int playerId=random.nextInt(101,200);
        Player player=new Player(name, playerId);
        playerList.add(player);
        System.out.println("Player Registration successfull!!");
        playerAccess(player);
    }
    
    public static void playerAccess(Player player){
        int cont=0;
        do {
            if(questionList.isEmpty()){
                System.out.println("Question list is empty..");
                return;
            }
            int score=0;
            System.out.println("Welcome "+player.getName()+", Now you can play the Quiz....");
            // List<QuizQuestion> shuffledQuestion=new ArrayList<>();
            // Collections.shuffle(shuffledQuestion);
            for(int i=0;i<questionList.size();i++){
                QuizQuestion question=questionList.get(i);
                question.displayQuestions();
                System.out.println("Select your answer: ");
                int userAnswerIndex=sc.nextInt();
                answerList.put(question.getQuestionId(),userAnswerIndex);
                if(question.checkAnswer(userAnswerIndex))
                    score++;
            }
            player.setScore(score);
            System.out.println("Quiz finished!!\nYou Current Score: "+player.getScore()
            +" out of "+questionList.size());
            System.out.println("/n******************************\n");
            player.playerDetails();
            if(score>=(questionList.size()/2))
                System.out.println("You Pass the test");
            else
                System.out.println("You failed the test , try again!!");
            System.out.println("\n******************************\n");
            System.out.println("Quiz History....");
            displayQuizHistory();
            System.out.println("\n******************************");
            System.out.println("Press 1 to play again or 0 to exit: ");
            cont=sc.nextInt();
        } while (cont==1);
    }

    public static void adminRegistration(){
        System.out.println("Register yourself as admin....");
        sc.nextLine();
        System.out.println("Please enter your name: ");
        String name=sc.nextLine();
        Optional<Admin> existingAdmin = adminList.stream()
            .filter(admin -> admin.getName().equalsIgnoreCase(name))
            .findFirst();

        if (existingAdmin.isPresent()) {
            System.out.println("Player with this name already exists. Redirecting to quiz...");
            adminAccess(existingAdmin.get());
        }
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
        boolean duplicateChecking=questionList
        .stream()
        .anyMatch(q->q.getQuestion().equalsIgnoreCase(questionText.trim()));
        if(duplicateChecking){
            System.out.println("This question is already exists... Add something new!!");
            return;
        }
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

    public static void displayQuizHistory() {
    for (QuizQuestion quizQuestion : questionList) {
        int qid = quizQuestion.getQuestionId();
        System.out.println("Question Id: " + qid);
        System.out.println("Question: " + quizQuestion.getQuestion());
        System.out.println("Correct Answer: " + quizQuestion.getCorrectAnswerIndex());
        System.out.println("Your answer: " + answerList.get(qid));
        System.out.println("------------------------");
    }
}
}
