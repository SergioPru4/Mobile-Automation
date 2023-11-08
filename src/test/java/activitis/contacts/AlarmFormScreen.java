package activitis.contacts;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class AlarmFormScreen {
    public Button okButton = new Button(By.id("android:id/button1"));
    public void setTime(String time){
        Button timeButton = new Button(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc="+time+"]"));
        timeButton.click();
    }
    public void selectAmOrPm(String data){
        Label amOrPm = null;
        if (data.equals("AM")){
             amOrPm = new Label(By.id("android:id/am_label"));
        }else{
             amOrPm = new Label(By.id("android:id/pm_label"));
        }
        amOrPm.click();
    }
}
