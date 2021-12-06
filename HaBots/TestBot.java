import javax.swing.JOptionPane;

//bunch of resources needed for this
import java.awt.AWTException;
import java.awt.event.MouseEvent;
import java.awt.Robot;

//try catch to catch any problem and show the stack trace
public class TestBot {
    //new robot
    private static Robot teste=null;
    public static void main(String[] args) {
        try {
            teste=new Robot();
        } catch (Exception e) {
            e.printStackTrace();
        }
        clicker(1000, 950);
    }

    //clicking operation,x and y being where te mouse will click at
    public static void clicker(int x,int y){
        teste.mouseMove(x, y);
        teste.delay(2);
        teste.mousePress(MouseEvent.BUTTON1_MASK);
        teste.mouseRelease(MouseEvent.BUTTON1_MASK);
    }
}