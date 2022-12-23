package Project.DeliveryProject;

public class Food {
   public int minrate;
   public String title;

    int getmin(){return minrate;}
    String print(){
        return ("\n"+title+"의 최소 주문금액은 "+minrate+"원 입니다.\n");
    }
}

class Bk extends Food{
    Bk(){
        this.minrate=12000;
        this.title="봉스키친";
    }
}

class GB extends Food{
    GB(){
        this.minrate=15000;
        this.title="국민돼지국밥";
    }
}

class BBACK extends Food{
    BBACK(){
        this.minrate=10000;
        this.title="빽다방";
    }
}

