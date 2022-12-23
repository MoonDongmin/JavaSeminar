package Project.Login;

public class User {
    private String id;
    private String pwd;
    private String name;

    User(String id, String pwd, String name){
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public String getPwd() {
        return pwd;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
//
//    @Override
//    public String toString() {
//        return this.id + ", " + this.pwd + ", " + this.name;
//    }


}
