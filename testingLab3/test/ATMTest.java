import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.Test;

public class ATMTest extends TestCase {
    @Test
    public void test1(){
        ATM a = new ATM();
        a.isValidatedCard = false;
        assertEquals("Card not validated",a.enterCard());
    }
    @Test
    public void test2(){
        ATM a = new ATM();

        assertEquals("Validated card",a.enterCard());
    }
    @Test
    public void  test3(){
        ATM a = new ATM();
        assertEquals("Successful login",a.enterPassword());
    }
    @Test
    public void  test4(){
        ATM a = new ATM();
        assertEquals("Validated card",a.enterCard());
        a.isValidPassword = false;
        assertEquals("Wrong password",a.enterPassword());
    }
    @Test
    public void  test5(){
        ATM a = new ATM();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Not enough balance",a.withdraw(10));
    }
    @Test
    public void  test6(){
        ATM a = new ATM();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Enter valid amount",a.deposit(20));
        assertEquals("Not enough balance",a.withdraw(10));
    }
    @Test
    public void  test7(){
        ATM a = new ATM();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Successful deposit",a.deposit(50));
        assertEquals("Successful withdraw",a.withdraw(10));
    }
    @Test
    public void  test8(){
        ATM a = new ATM();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Successful deposit",a.deposit(1000));
        assertEquals("Successful withdraw",a.withdraw(10));
    }
    @Test
    public void  test9(){
        ATM a = new ATM();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Enter valid amount",a.deposit(50001));
        assertEquals("Not enough balance",a.withdraw(10));
    }
    @Test
    public void  test10(){
        ATM a = new ATM();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Successful deposit",a.deposit(1000));
        assertEquals("Successful withdraw",a.withdraw(500));
        assertEquals("Successful withdraw",a.withdraw(500));
    }
    @Test
    public void  test11(){
        ATM a = new ATM();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Successful deposit",a.deposit(1000));
        assertEquals("Successful withdraw",a.withdraw(500));
        assertEquals("Not enough balance",a.withdraw(501));
    }
    @Test
    public void  test12(){
        ATM a = new ATM();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Successful deposit",a.deposit(3000));
        assertEquals("Successful withdraw",a.withdraw(1000));
        assertEquals("Not enough balance",a.withdraw(4000));
        assertEquals("Successful withdraw",a.withdraw(2000));
    }
}