import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class digitalWatchTest extends TestCase {
    @Test
    public void test1(){
        digitalWatch d = new digitalWatch();
        assertEquals("Turned On!",d.turnOn());
    }
    @Test
    public void test2(){
        digitalWatch d = new digitalWatch();
        assertEquals("Turned On!",d.turnOn());
        assertEquals("Already turned on",d.turnOn());
    }
    @Test
    public void test3(){
        digitalWatch d = new digitalWatch();
        assertEquals("Turned On!",d.turnOn());
        assertEquals("Already turned on",d.turnOn());
        assertEquals("Turned off",d.turnOff());
    }
    @Test
    public void test4(){
        digitalWatch d = new digitalWatch();
        assertEquals("Turned On!",d.turnOn());
        assertEquals("Timer set",d.setTimer(10));
    }
    @Test
    public void test5(){
        digitalWatch d = new digitalWatch();
        assertEquals("Turned On!",d.turnOn());
        assertEquals("Timer set",d.setTimer(10));
        assertEquals("Wait for timer to end",d.doSomething());
    }
    @Test
    public void test6(){
        digitalWatch d = new digitalWatch();
        assertEquals("Turned On!",d.turnOn());
        assertEquals("Timer set",d.setTimer(10));
        d.isTimerSet = false;
        assertEquals("Accepted",d.doSomething());
    }
    @Test
    public void test7(){
        digitalWatch d = new digitalWatch();
        assertEquals("Turned On!",d.turnOn());
        assertEquals("Timer set",d.setTimer(10));
        d.isTimerSet = false;
        assertEquals("Accepted",d.doSomething());
        assertEquals("Turned off",d.turnOff());
    }
    @Test
    public void test8(){
        digitalWatch d = new digitalWatch();
        assertEquals("Turned On!",d.turnOn());
        assertEquals("Timer set",d.setTimer(10));
        d.isTimerSet = false;
        assertEquals("Accepted",d.doSomething());
        d.isOpen = false;
        assertEquals("Error",d.turnOff());
    }

}