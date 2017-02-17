/**
 * Created by student on 17.02.2017.
 */
public class Main {


    public static void main(String[] args){

        StaticClass instance1= new StaticClass();
        instance1.a=12;
        instance1.b=100;

        System.out.println(instance1.a);


        StaticClass instance2= new StaticClass();
        instance2.a=111;
        instance2.b=200;

        System.out.println(instance1.a);
        System.out.println(instance1.b);
        System.out.println(instance2.b);

        System.out.print("In main function");

    }
}
