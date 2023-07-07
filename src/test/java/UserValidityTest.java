import ass20.UserValidity;
import org.junit.Assert;
import org.junit.Test;

public class UserValidityTest {
    UserValidity u1=new UserValidity("vethsa","pravanya","abc.xyx@gmail.com","91 7986543210");
    @Test
    public void testFname(){
        Assert.assertEquals(true,u1.checkFname());
    }
    @Test
    public void testLname(){
        Assert.assertEquals(true,u1.checkLname());
    }
    @Test
    public void testEmail(){
        Assert.assertEquals(true,u1.checkEmail());
    }
    @Test
    public void testMobile(){
        Assert.assertEquals(true,u1.checkMobile());
    }
}
