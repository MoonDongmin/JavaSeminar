package Chapter09.Outter;

public class OutterExam {
    public static void main(String[] args){
        Outter outter = new Outter();
        Outter.Nested nesetd = outter.new Nested();
        nesetd.print();
    }
}
