package Chapter14.UsingThisExample;

public class UsingThis {
    public int outterField = 10;

    class Inner{
        int innerField = 20;

        void method(){
            //람다식
            MyFunctionalInterface fi =()->{
                System.out.println("outterField:"+outterField);
                System.out.println("outterField:"+UsingThis.this.outterField+"\n");

                System.out.println("innterField:"+innerField);
                System.out.println("innterFiedl:"+this.innerField+"\n");
            };
            fi.method();
        }
    }
}
