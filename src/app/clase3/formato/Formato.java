package app.clase3.formato;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Formato {

    public static void main(String[] args) {
        Formato.SimpleDateFormat();
    }
    
    public static void SimpleDateFormat() {
        
        DateFormat df = new SimpleDateFormat("E d MMMM");
        
        Date now = new Date();
        
        System.out.println(df.format(now));
        
    }

    public static void dateformat() {

        Date now = new Date();
        System.out.println(now.getTime());

        DateFormat df = DateFormat.getDateInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
        SimpleDateFormat df5 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
        DateFormat df6 = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        DateFormat df7 = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
        
        System.out.println(df.format(now));
        System.out.println(df1.format(now));
        System.out.println(df2.format(now));
        System.out.println(df3.format(now));
        System.out.println(df4.format(now));
        System.out.println(df5.format(now));
        System.out.println(df6.format(now));
        System.out.println(df7.format(now));

    }

    public static void GregorianCalendar() {

        GregorianCalendar ahora = new GregorianCalendar(1967, 7, 10);

        System.out.println("Fecha : " + ahora.getTime());
        System.out.println("Año: " + ahora.get(Calendar.YEAR));
        System.out.println("Mes: " + ahora.get(Calendar.MONTH));
        System.out.println("Día del mes: " + ahora.get(Calendar.DAY_OF_MONTH));

        System.out.println("Hora: " + ahora.get(Calendar.HOUR));
        System.out.println("Minuto: " + ahora.get(Calendar.MINUTE));
        System.out.println("Segundo: " + ahora.get(Calendar.SECOND));
        System.out.println("Milisegundo: " + ahora.get(Calendar.MILLISECOND));

        System.out.println("Primer día de la semana : " + ahora.getFirstDayOfWeek());
        System.out.println("Semana del mes: " + ahora.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Semana del año: " + ahora.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Día del año: " + ahora.get(Calendar.DAY_OF_YEAR));
    }

    public static void monedaFormat() {

        NumberFormat nfe = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        nfe.setGroupingUsed(false);

        NumberFormat nfd = NumberFormat.getCurrencyInstance(Locale.US);
        nfd.setGroupingUsed(false);

        Locale lp = new Locale("es", "PE");
        NumberFormat nfp = NumberFormat.getCurrencyInstance(lp);
        nfp.setGroupingUsed(false);
        System.out.println("Moneda Euro :" + nfe.format(150));
        System.out.println("Moneda Dolar :" + nfd.format(150));
        System.out.println("Moneda Soles :" + nfp.format(150));
    }

    public static void numberFormat() {

        NumberFormat nf = NumberFormat.getInstance(Locale.US);
        nf.setGroupingUsed(true);
        System.out.println(nf.format(10000000.0045451));

        nf.setGroupingUsed(false);
        System.out.println(nf.format(10000000.0045451));

        System.out.println("Con 3 enteros mínimo");
        nf.setMinimumIntegerDigits(3);
        System.out.println(nf.format(12));

        System.out.println("Con 5 enteros máximo");
        nf.setMaximumIntegerDigits(5);
        System.out.println(nf.format(123456));

        System.out.println("Con 4 enteros máximo en los decimales");
        nf.setMaximumFractionDigits(4);
        System.out.println(nf.format(123.981454));

        System.out.println("Con 2 enteros mínimo en los decimales");
        nf.setMinimumFractionDigits(2);
        System.out.println(nf.format(45.2));

    }
}