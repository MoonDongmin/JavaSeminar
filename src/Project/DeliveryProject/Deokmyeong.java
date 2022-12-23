package Project.DeliveryProject;

public class Deokmyeong extends Order{
    public Deokmyeong() {this.point = "덕명동";}
}

class  Yuseong extends Order{
    public Yuseong(){
        this.point="유성";
        this.baseRate= this.baseRate+2000;
        this.baseTime=this.baseTime+20;
    }
}

class Dunsan extends Order {
    public Dunsan() {
        this.point = "둔산동";
    }
    public String p() {
        System.out.print("\n" + getPoint() + "지역은 배달이 불가능합니다.\n");
        return null;
    }
}
