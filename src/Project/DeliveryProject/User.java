package Project.DeliveryProject;

public class User {
    String id;
    String pwd;
    String nickName;

    public User(String id, String pwd, String nickName){
        this.id =id;
        this.pwd=pwd;
        this.nickName=nickName;
    }

    public String getId(){return id;}
    public String getPwd(){return pwd;}
    public String getNickName(){return nickName;}
}
