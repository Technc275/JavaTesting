import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by student on 17.02.2017.
 */
public class TestEmployeeDetails {

    private EmployeeDetails test_class; //pointer to memory
    private static double minimalka;

    //run smth once before all test STATIC
    @BeforeClass
    public static void Initialization(){

        System.out.println("=============TestEmployeeDetails==============");
        System.out.println("Run once");
        minimalka=3200;

    }


    //run smth every time befire each test
    @Before
    public void before_method(){

        System.out.println("Run before");
        test_class = new EmployeeDetails();
    }


    //ignore smth method
    //@Ignore
    @Test
    public void testMonthlySalary2(){

        System.out.println("Run testMonthlySalary");

        // arrange

        test_class.setMonthlySalary(minimalka+1000);

        // act

        double result=test_class.getMonthlySalary();

        // assert
        assertTrue(result>minimalka);

    }


    @Test
    public void testMonthlySalary(){

        System.out.println("Run testMonthlySalary");

        // arrange

        test_class.setMonthlySalary(minimalka);

        // act

        double result=test_class.getMonthlySalary();

        // assert
        assertEquals(minimalka,result,0.0001);

    }


    //after each test
    @After
    public void after_method(){
        System.out.println("Run after method");

    }


    //run last only once STATIC
    @AfterClass
    public static void my_last_code(){
        System.out.println("Run last code");
    }


}
