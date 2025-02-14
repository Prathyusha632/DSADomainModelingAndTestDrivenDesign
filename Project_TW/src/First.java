import java.awt.*;
import java.util.Calendar;

// HelloWorld class extends Applet
public class First
{
    public static void main(String[] args){
        /*Calendar c=Calendar.getInstance();
        Calendar cc=Calendar.getInstance();
        System.out.println(c);*/
        Runtime r=Runtime.getRuntime();
        Runtime rr=Runtime.getRuntime();
        System.out.println(r.equals(rr));
        Desktop d=Desktop.getDesktop();
        Desktop dd = Desktop.getDesktop();
        System.out.println(d.equals(dd));
    }
}
