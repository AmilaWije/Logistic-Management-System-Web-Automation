package TMS.Runner;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class CommonFunctions {

    public int generateNumber() {
        Random rand = new Random();
        return rand.nextInt(1000);
    }

    public String datePickerLogic() {
        Date currentDate= new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("M/d/yyyy, HH:mm:ss");
        String todayDateFormat = dateFormat.format(currentDate);
        return todayDateFormat;
    }
}
