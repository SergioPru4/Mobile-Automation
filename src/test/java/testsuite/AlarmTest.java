package testsuite;

import activitis.clock.AlarmFormScreen;
import activitis.clock.AlarmScreen;
import activitis.clock.MainScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

public class AlarmTest {
    MainScreen mainScreen = new MainScreen();
    AlarmScreen alarmScreen = new AlarmScreen();
    AlarmFormScreen alarmFormScreen = new AlarmFormScreen();
    @Test
    public void verifyCreateAlarm() {
        String hour = "9";
        String minute = "15";
        String amOrPm = "am".toUpperCase();

        mainScreen.selectClock.click();
        alarmScreen.selectClock.click();
        alarmFormScreen.setTime(hour);
        alarmFormScreen.setTime(minute);
        alarmFormScreen.selectAmOrPm(amOrPm);
        alarmFormScreen.okButton.click();

        String actual = alarmScreen.getTextAlarm(hour, minute);
        String time = hour+":"+minute+" "+amOrPm;

        Assertions.assertEquals(time, actual, "ERROR la alarma no fue creada");
    }
    @AfterEach
    public void close(){
        Session.getSession().closeSession();
    }
}
