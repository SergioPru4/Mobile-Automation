package activitis.clock;

import control.Button;
import org.openqa.selenium.By;

public class MainScreen {
    public Button selectClock = new Button(By.xpath("//android.widget.TextView[@text='ALARM']"));
}
