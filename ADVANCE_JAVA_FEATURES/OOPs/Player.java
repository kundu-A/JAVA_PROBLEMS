//Encapsulation
public class Player{
    private int playerId;
    private String name;
    private String role;
    private int score;
    public Player(String name,int playerId){
        this.playerId=playerId;
        this.name=name;
        this.role="USER";
        this.score=0;
    }
    public void setScore(int score){
        this.score=score;
    }
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
    public void playerDetails(){
        System.out.println("Player Details.....");
        System.out.println("Player Id : "+playerId
        +"\nPlayer name : "+name
        +"\nPlayer Role : "+role
        +"\nScore : "+score);
    }
}
