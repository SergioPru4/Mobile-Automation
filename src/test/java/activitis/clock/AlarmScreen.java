package activitis.clock;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class AlarmScreen {
    public Button selectClock = new Button(By.id("com.google.android.deskclock:id/fab"));

    public String getTextAlarm(String hour, String minute) {
        int h = Integer.parseInt(hour);

        Label nameAlarm = new Label(By.xpath("//android.widget.TextView[contains(@text, '" + hour + ":" + minute + "')]"));
        String alarm = nameAlarm.getText();
        String time;
        String amOrPmAlarm;

        if (h >= 10) {
            time=alarm.substring(0, 5);
            amOrPmAlarm=alarm.substring(6, 8);
        }else {
            time=alarm.substring(0, 4);
            amOrPmAlarm=alarm.substring(5, 7);
        }
        return time+" "+amOrPmAlarm;
    }
}
