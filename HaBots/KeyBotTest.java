import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;
public class KeyBotTest {
    
    //the clicking method
    public static void clicker(int x,int y){
        Robot robot2;
        try {
            robot2 = new Robot();
            robot2.mouseMove(x, y);
            robot2.delay(100);
            robot2.mousePress(MouseEvent.BUTTON1_MASK);
            robot2.mouseRelease(MouseEvent.BUTTON1_MASK);
            robot2.delay(500);
        } catch (AWTException e) {
            
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        try {
            
            Robot robot = new Robot();
            clicker(1000, 950);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress('V');
            robot.keyRelease('V');
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.delay(100);
            clicker(1875,1000);
           
        } catch (Exception e) {
            e.printStackTrace();
        }

              
        
    }    

}