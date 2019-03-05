
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar();

        SimpleDateFormat formatOne = new SimpleDateFormat("yyyy-MMMM-dd");
        SimpleDateFormat formatTwo = new SimpleDateFormat("E" + ", d MMM yyyy HH:mm:ss Z");
        SimpleDateFormat formatThree = new SimpleDateFormat("h:mm a" , Locale.ENGLISH);
        SimpleDateFormat formatFour = new SimpleDateFormat("MM'/'dd'/'y hh:mm");
        SimpleDateFormat formatFive = new SimpleDateFormat("zzzz -> dd MMMM yyyy");
        SimpleDateFormat formatSix = new SimpleDateFormat("yyyy.MMMM.dd GGG hh:mm aaa", Locale.ENGLISH);

        String str = "Today's date:\n%s\n\n";

        System.out.printf(str, formatOne.format(calendar.getTime()).toUpperCase());
        System.out.printf(str, formatTwo.format(calendar.getTime()));
        System.out.printf(str, formatThree.format(calendar.getTime()));
        System.out.printf(str, formatFour.format(calendar.getTime()));
        System.out.printf(str, formatFive.format(calendar.getTime()));
        System.out.printf(str, formatSix.format(calendar.getTime()));

    }
}
