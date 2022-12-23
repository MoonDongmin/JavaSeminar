package Chapter9.Outter;

import Chapter9.Outter.Outter;

public class OutterExam {
    public static void main(String[] args){
        Outter outter = new Outter();
        Outter.Nested nesetd = outter.new Nested();
        nesetd.print();
    }
}
