import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by santosh on 3/22/18.
 */
public class mavenPracticeTest {

    /*
    Maven commands
    mvn clean install - Executes all lifecycles, creates the build by generating JAR files.
        mvn compile
        mvn test
        mvn resources
     */

    @Test
    public void add(){
        System.out.println("Addition");
        int a = 10;
        int b = 20;
        Assert.assertEquals(a+b, 30);
    }

    @Test
    public void sub(){
        System.out.println("Subtraction");
        int a = 10;
        int b = 20;
        Assert.assertEquals(a-b, -10);
    }

    @Test
    public void mul(){
        System.out.println("Multiplication");
        int a = 10;
        int b = 20;
        Assert.assertEquals(a*b, 200);
    }

    @Test
    public void division(){
        System.out.println("Division");
        int a = 10;
        int b = 20;
        Assert.assertEquals(a/b, 0);
    }
}
