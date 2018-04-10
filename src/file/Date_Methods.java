package file;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date_Methods {

    public Date sumDays(Date fecha, int dias) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fecha);
        cal.add(Calendar.DAY_OF_YEAR, dias);
        return cal.getTime();
    }

    public int dateDifferent(Date initial, Date end) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date DateInitial = initial;

        Date DateEnd = end;

        int days = (int) ((DateEnd.getTime() - DateInitial.getTime()) / 86400000);

        return days;
    }

    public Date StringToDate(String stringFecha, String formato) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(formato);
            Date datee = sdf.parse(stringFecha);
            return datee;
        } catch (Exception e) {

            return null;
        }

    }
}
