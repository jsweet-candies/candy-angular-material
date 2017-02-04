package def.angular_material.angular.material;
import def.js.Date;
@jsweet.lang.Interface
public abstract class IDateLocaleProvider extends def.js.Object {
    public String[] months;
    public String[] shortMonths;
    public String[] days;
    public String[] shortDays;
    public String[] dates;
    public double firstDayOfWeek;
    native public Date parseDate(String dateString);
    native public String formatDate(Date date);
    native public String monthHeaderFormatter(Date date);
    native public String weekNumberFormatter(double weekNumber);
    public String msgCalendar;
    public String msgOpenCalendar;
}

