import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.Test;


public class coffeeMachineTest extends TestCase {
    @Test
    public void test1(){
        coffeeMachine c = new coffeeMachine();
        assertEquals("Power On!" + "Lights On!",c.openMachine());
    }
    @Test
    public void test2(){
        coffeeMachine c= new coffeeMachine();
        c.isPowerOn = true;
        assertEquals("Error!",c.openMachine());
    }
    @Test
    public void test3(){
        coffeeMachine c = new coffeeMachine();
        assertEquals("Turn Machine On first!", c.addMoney(30));
    }
    @Test
    public void test4(){
        coffeeMachine c = new coffeeMachine();
        c.openMachine();
        assertEquals("Successfully added money",c.addMoney(30));
    }
    @Test
    public void test5(){
        coffeeMachine c = new coffeeMachine();
        c.openMachine();
        c.closeMachine();
        assertEquals("Turn Machine On first!",c.addMoney(30));
    }
    @Test
    public void test6(){
        coffeeMachine c = new coffeeMachine();
        assertEquals("Power On!" + "Lights On!",c.openMachine());
        assertEquals("Successfully added money",c.addMoney(30));
    }
    @Test
    public void test7(){
        coffeeMachine c = new coffeeMachine();
        assertEquals("Power On!" + "Lights On!",c.openMachine());
        assertEquals("Successfully added money",c.addMoney(30));
        assertEquals("Lights Off!" + "Power Off!",c.closeMachine());
    }
    @Test
    public void test8(){
        coffeeMachine c = new coffeeMachine();
        assertEquals("Turn on the machine first!",c.makeCoffee(2));
    }
    @Test
    public void test9(){
        coffeeMachine c = new coffeeMachine();
        assertEquals("Power On!" + "Lights On!",c.openMachine());
        assertEquals("Successfully added money",c.addMoney(30));
        assertEquals(3+ " Cup Of coffee Made!",c.makeCoffee(3));
    }
    @Test
    public void test10(){
        coffeeMachine c = new coffeeMachine();
        assertEquals("Power On!" + "Lights On!",c.openMachine());
        assertEquals("Successfully added money",c.addMoney(30));
        assertEquals(3+ " Cup Of coffee Made!",c.makeCoffee(4));
    }
    @Test
    public void test11(){
        coffeeMachine c = new coffeeMachine();
        assertEquals("Power On!" + "Lights On!",c.openMachine());
        assertEquals("Successfully added money",c.addMoney(30));
        assertEquals(1+ " Cup Of coffee Made!",c.makeCoffee(1));
    }
    @Test
    public void test12(){
        coffeeMachine c = new coffeeMachine();
        assertEquals("Power On!" + "Lights On!",c.openMachine());
        assertEquals("Successfully added money",c.addMoney(30));
        assertEquals(2+ " Cup Of coffee Made!",c.makeCoffee(2));
        assertEquals("Lights Off!" + "Power Off!",c.closeMachine());
    }

}