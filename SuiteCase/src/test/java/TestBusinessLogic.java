import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by student on 17.02.2017.
 */
public class TestBusinessLogic {

    private EmployeeDetails employee;
    private  EmpBusinessLogic logic;

    //run smth once before all test STATIC
    @BeforeClass
    public static void Initialization(){

        System.out.println("=============TestBusinessLogic==============");
        System.out.println("Run once");

    }

    @Before
    public void createEmployeeAndBusinessLogic(){
        employee=new EmployeeDetails();
        logic = new EmpBusinessLogic();

        System.out.println("Run createEmployeeAndBusinessLogic");
    }

    @Test
    public void testYearlySalary(){
        System.out.println("Run testYearlySalary");

        // arrange
        double salary=120;
        employee.setMonthlySalary(salary);
        double expected_result=12*salary;

        // act

        double real_result=logic.calculateYearlySalary(employee);

        // assert

        assertEquals(expected_result,real_result,0.00001);

    }

    @Test
    public void testAppraisal(){
        System.out.println("Run testAppraisal");

        // arrange
        double salary=120;
        employee.setMonthlySalary(salary);
        double expected_result=500;

        // act
        // class_name.method_to_test(param)
        double real_result=logic.calculateAppraisal(employee);

        // assert

        assertEquals(expected_result,real_result,0.00001);

    }

}
