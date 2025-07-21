//Encapsulation
public class Admin {
    private int adminId;
    private String name;
    private String role;
    public Admin(String name,int adminId){
        this.adminId=adminId;
        this.name=name;
        this.role="ADMIN";
    }
    public String getName(){
        return name;
    }
    public void adminDetails(){
        System.out.println("Admin Details.....");
        System.out.println("Admin Id : "+adminId
        +"\nAdmin name : "+name
        +"\nAdmin Role : "+role);
    }
}
