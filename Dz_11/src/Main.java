
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar();

        SimpleDateFormat data = new SimpleDateFormat("yyyy/MMMM/dd");

        String s = String.format("Today's date:\n%s", data.format(calendar.getTime()));

        System.out.println(s);

    }
}
