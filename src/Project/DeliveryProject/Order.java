package Project.DeliveryProject;

public class Order {
    protected String point;
    protected int baseRate=3000;
    protected int baseTime=15;




    public int getRate() {return baseRate;}
    public int getBaseTime() {return baseTime;}
    public String getPoint() {return point;}
    public String p(){
        return ("\n"+getPoint()+"지역의 기본 배달 요금은"+Integer.toString(getRate())+"원\n배달소요 시간은"+Integer.toString(getBaseTime())+"분");
    }
}
