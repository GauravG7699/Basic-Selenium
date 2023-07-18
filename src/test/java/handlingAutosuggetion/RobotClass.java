package handlingAutosuggetion;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotClass {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
        Robot r =new Robot();
        r.keyPress(KeyEvent.VK_SHIFT);
        r.keyPress(KeyEvent.VK_G );
        r.keyRelease(KeyEvent.VK_G);
        r.keyRelease(KeyEvent.VK_SHIFT);
        
        r.keyPress(KeyEvent.VK_A );
        r.keyRelease(KeyEvent.VK_A);
        
        r.keyPress(KeyEvent.VK_U );
        r.keyRelease(KeyEvent.VK_U);
        
        r.keyPress(KeyEvent.VK_R );
        r.keyRelease(KeyEvent.VK_R);
        
        r.keyPress(KeyEvent.VK_A );
        r.keyRelease(KeyEvent.VK_A);
        
        r.keyPress(KeyEvent.VK_V );
        r.keyRelease(KeyEvent.VK_V);
        
	}

}
