import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by student on 17.02.2017.
 */
public class TestRunner {

    public  static  void main(String[] args){

        Result result = JUnitCore.runClasses(TestEmployeeSuite.class);

        for(Failure failure : result.getFailures()){

            System.out.println(failure.toString());

        }


        System.out.print("Suite complited");
    }
}
